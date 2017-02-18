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

//represents a sphere object that has the methods of the superclass "Shape"
public class Sphere extends Shape implements Renderer{

	//radius of the sphere object
	private float radius = 0;

	//create and set properties of sphere object
	public Sphere(Dialog dialog, float radius) {
		super(dialog);
		
		//validate radius is greater than zero
		if(radius > 0) {
			//set radius of sphere object
			setRadius(radius);
		}
	}

	//retrieve radius property of the sphere object
	public float getRadius() {
		return radius;
	}
	
	//change the radius of the sphere object
	private void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	//calculate and return the surface area of sphere object
	public float surfaceArea() {
		
		//parse the result of the formula to data type float
		//formula:
		//4 times pi times radius squared
		return (float) (4 * Math.PI * Math.pow(getRadius(), 2));
	}

	@Override
	//calculate and return the volume of sphere object
	public float volume() {
		
		//parse the result of the formula to data type float
		//formula:
		// 4 divided by 3 times pi times radius cubed
		return (float) (4.0 /3 * Math.PI * Math.pow(getRadius(), 3));
	}

	@Override
	//display message box with sphere object data
	public void render() {
		
		//display this message if radius is less than or equal to zero
		if(getRadius() == 0) {
			getDialog().show("Invalid! Please enter a number greater than 0.", "Sphere");
		//display this message if radius is greater than zero (valid)
		} else {
			getDialog().show("Radius = " + getRadius() + 
				    "\nSurface area = " + surfaceArea() + 
				    "\nVolume = " + volume(), "Sphere");
		}
	}
}