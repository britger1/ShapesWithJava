/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Bradley
 *
 */

//Represents a superclass shape that has certain methods
public abstract class Shape {
	
	//method that will get the surface area of a 3D shape
	public abstract float surfaceArea();
	
	//method that will get the volume of a 3D shape
	public abstract float volume();

	//method that will display measurements of a 3D shape
	public abstract void render();
}