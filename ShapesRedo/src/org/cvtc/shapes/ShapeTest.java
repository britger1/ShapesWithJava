package org.cvtc.shapes;

public class ShapeTest {

	public static void main(String[] args) {
		
		Dialog dialog = new MessageBox();
		
		ShapeFactory shapeFactory = new ShapeFactory(dialog);
		
		((Sphere) shapeFactory.makeSphere(10)).render();
		
		((Cylinder) shapeFactory.makeCylinder(10, 10)).render();
		
		((Cuboid) shapeFactory.makeCuboid(10, 10, 10)).render();

	}

}
