/**
 * 
 */
package org.cvtc.shapes;

import org.cvtc.shapes.messaging.Dialog;
import org.cvtc.shapes.messaging.Renderer;

/**
 * @author Bradley
 *
 */
//represents a cylinder object that has the methods of the superclass "Shape"
public class Cylinder extends Shape implements Renderer{

	//radius of cylinder object
	private float radius = 0;
	
	//height if cylinder object
	private float height = 0;
	
	//create and set properties of cylinder object
	public Cylinder(Dialog dialog, float radius, float height) {
		super(dialog);
		
		//validate that all cylinder properties are greater than zero
		if(radius > 0 && height > 0) {
			//set properties of cylinder object
			setRadius(radius);
			setHeight(height);
		}
	}
	
	//retrieve radius property of the cylinder object
	public float getRadius() {
		return radius;
	}

	//change the radius of the cylinder object
	private void setRadius(float radius) {
		this.radius = radius;
	}

	//retrieve height property of the cylinder object
	public float getHeight() {
		return height;
	}

	//change the height of the cylinder object
	private void setHeight(float height) {
		this.height = height;
	}

	@Override
	//calculate and return the surface area of cylinder object
	public float surfaceArea() {
		
		//parse the result of the formula to data type float
		//formula:
		//(2 times pi times radius times height) plus (2 times pi times radius squared)
		return (float) (2 * Math.PI * getRadius() * getHeight() + 2 * Math.PI * Math.pow(getRadius(), 2));
	}

	@Override
	//calculate and return the volume of cylinder object
	public float volume() {
		
		//parse the result of the formula to data type float
		//formula:
		//pi times radius squared times height
		return (float) (Math.PI * Math.pow(getRadius(), 2) * getHeight());
	}

	@Override
	//display message box with cylinder object data
	public void render() {
		
		//display this message if at least one cylinder object property is less than or equal to zero
		if(getRadius() == 0 || getHeight() == 0) {
			getDialog().show("Invalid! Please enter a number greater than 0.", "Cylinder");
		//display this message if all cylinder properties are greater than zero (valid)
		} else {
			getDialog().show("Radius = " + getRadius() + 
				    "\nHeight = " + getHeight() +
				    "\nSurface area = " + surfaceArea() + 
				    "\nVolume = " + volume(), "Cylinder");
		}
	}
}