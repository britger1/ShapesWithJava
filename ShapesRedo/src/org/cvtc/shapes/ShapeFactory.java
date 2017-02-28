package org.cvtc.shapes;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.Shape;
import org.cvtc.shapes.Sphere;
import org.cvtc.shapes.Dialog;

public class ShapeFactory {
	
	private Dialog dialog;

	public ShapeFactory(Dialog dialog) {
		setDialog(dialog);
	}

	private Dialog getDialog() {
		return dialog;
	}

	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	public Shape makeCuboid(final float height, final float width,final float depth) {
		Cuboid cuboid = new Cuboid(getDialog(), height, width, depth);
		return cuboid;
	}
	
	public Shape makeCylinder(final float radius, final float height) {
		Cylinder cylinder = new Cylinder(getDialog(), radius, height);
		return cylinder;
	}
	
	public Shape makeSphere(final float radius) {
		Sphere sphere = new Sphere(getDialog(), radius);
		return sphere;
	}
}