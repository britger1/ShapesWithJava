/**
 * 
 */
package org.cvtc.shapes;

import org.cvtc.shapes.messaging.Dialog;

/**
 * @author Bradley
 *
 */

//Represents a superclass shape that has certain methods
public abstract class Shape {
	
	private Dialog dialog;
	
	public Shape(Dialog dialog) {
		setDialog(dialog);
	}
	
	protected Dialog getDialog() {
		return dialog;
	}
	
	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	//method that will get the surface area of a 3D shape
	public abstract float surfaceArea();
	
	//method that will get the volume of a 3D shape
	public abstract float volume();

}