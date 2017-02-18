/**
 * 
 */
package org.cvtc.shapeTest;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.Sphere;
import org.cvtc.shapes.messaging.Dialog;
import org.cvtc.shapes.messaging.MessageBox;

/**
 * @author Bradley
 *
 */

//class that contains the method to test to see if our shape objects are outputting
public class ShapesTest {
	
	//main method that runs and outputs message boxes with shape data
	public static void main(String[] args) {
		
		Dialog dialog = new MessageBox();
		
		//creating a new sphere object
		Sphere sphere = new Sphere(dialog, 10);
		//output data for the sphere object we created
		sphere.render();
		
		//creating a new cylinder object
		Cylinder cylinder = new Cylinder(dialog, 10, 20);
		//output data for the cylinder object we created
		cylinder.render();
		
		//creating a new cuboid object
		Cuboid cuboid = new Cuboid(dialog, 10, 10, 10);
		//output data for the cuboid object we created
		cuboid.render();

	}
}