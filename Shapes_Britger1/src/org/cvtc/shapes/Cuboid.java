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
//represents a cuboid object that has the methods of the superclass "Shape"
public class Cuboid extends Shape implements Renderer{
	
	//length of cuboid object
	private float length = 0;
	
	//width of cuboid object
	private float width = 0;
	
	//depth of cuboid object
	private float depth = 0;
	
	//create and set properties of cuboid object
	public Cuboid(Dialog dialog, float length, float width, float depth) {
		super(dialog);
		
		//validate that all cuboid properties are greater than zero
		if(length > 0 && width > 0 && depth > 0) {
			//set properties of cylinder object
			setLength(length);
			setWidth(width);
			setDepth(depth);
		}
	}

	//retrieve length property of the cuboid object
	public float getLength() {
		return length;
	}

	//change the length of the cuboid object
	private void setLength(float length) {
		this.length = length;
	}

	//retrieve width property of the cuboid object
	public float getWidth() {
		return width;
	}

	//change the width of the cuboid object
	private void setWidth(float width) {
		this.width = width;
	}

	//retrieve depth property of the cuboid object
	public float getDepth() {
		return depth;
	}

	//change the depth of the cuboid object
	private void setDepth(float depth) {
		this.depth = depth;
	}

	@Override
	//calculate and return the surface area of cuboid object
	public float surfaceArea() {
		
		//parse the result of the formula to data type float
		//formula:
		//(2 times length times width) plus (2 times depth times length) plus (2 times width times depth)
		return 2 * getLength() * getWidth() + 2 * getDepth() * getLength() + 2 * getWidth() * getDepth();
	}

	@Override
	//calculate and return the volume of cuboid object
	public float volume() {
		
		//parse the result of the formula to data type float
		//formula:
		//length times width times depth
		return getLength() * getWidth() * getDepth();
	}

	@Override
	//display message box with cuboid object data
	public void render() {
		
		//display this message if at least one cuboid object property is less than or equal to zero
		if(getLength() == 0 || getWidth() == 0 || getDepth() == 0) {
			getDialog().show("Invalid! Please enter a number greater than 0.", "Cuboid");
		//display this message if all cuboid properties are greater than zero (valid)
		} else {
			getDialog().show("Length = " + getLength() + 
				    "\nWidth = " + getWidth() +
				    "\nDepth = " + getDepth() +
				    "\nSurface area = " + surfaceArea() + 
				    "\nVolume = " + volume(), "Cuboid");
		}
	}
}