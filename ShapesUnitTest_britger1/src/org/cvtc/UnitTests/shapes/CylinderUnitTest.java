package org.cvtc.UnitTests.shapes;

import static org.junit.Assert.*;

import org.cvtc.UnitTests.shapes.messaging.MessageBoxSub;
import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.messaging.Dialog;
import org.cvtc.shapes.messaging.MessageBox;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class CylinderUnitTest {
	
	Dialog dialog = new MessageBox();
	MessageBoxSub dialogSub = new MessageBoxSub();

	@Test
	@Parameters({"10, 20"})
	public void testGetRadius(float r, float h) {
		Cylinder cylinder = new Cylinder(dialog, r, h);
		float actual = cylinder.getRadius();
		float expected = r;
		assertEquals(expected, actual, 0);
	}
	
	@Test
	@Parameters({"10, 20"})
	public void testGetHeight(float r, float h) {
		Cylinder cylinder = new Cylinder(dialog, r, h);
		float actual = cylinder.getHeight();
		float expected = h;
		assertEquals(expected, actual, 0);
	}
	
	@Test
	@Parameters({"10, 20",
				 "13, 2",
				 "16, 99"})
	public void testSurfaceArea(float r, float h) {
		Cylinder cylinder = new Cylinder(dialog, r, h);
		float actual = cylinder.surfaceArea();
		float expected = (float) ((2 * Math.PI * r * h) + 2 * Math.PI * Math.pow(r, 2));
		assertEquals(expected, actual, 0);
	}
	
	@Test
	@Parameters({"12, 13",
				 "37, 14",
				 "77, 53"})
	public void testVolume(float r, float h) {
		Cylinder cylinder = new Cylinder(dialog, r, h);
		float actual = cylinder.volume();
		float expected = (float) (h * Math.PI * Math.pow(r, 2));
		assertEquals(expected, actual, 0);
	}
	
	@Test
	@Parameters({"4, 5"})
	public void testRenderMethod(float r, float h) {
		Dialog dialogSub = new MessageBoxSub();
		Cylinder sphere = new Cylinder(dialogSub, r, h);
		sphere.render();
	}
	
	@Test
	@Parameters({"-10, -20",
				 "13, -2",
				 "-16, 99"})
	public void testConstructorForNegNums(float r, float h) {
		Cylinder cylinder = new Cylinder(dialog, r, h);
		float actual = cylinder.volume();
		float expected = 0;
		assertEquals(expected, actual, 0);
	}
	
}
