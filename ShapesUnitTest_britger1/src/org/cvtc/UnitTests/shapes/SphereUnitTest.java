package org.cvtc.UnitTests.shapes;

import static org.junit.Assert.*;

import org.cvtc.UnitTests.shapes.messaging.MessageBoxSub;
import org.cvtc.shapes.Sphere;
import org.cvtc.shapes.messaging.Dialog;
import org.cvtc.shapes.messaging.MessageBox;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class SphereUnitTest {

	Dialog dialog = new MessageBox();
	
	@Test
	@Parameters({"10"})
	public void testGetRadius(float r) {
		Sphere sphere = new Sphere(dialog, r);
		float actual = sphere.getRadius();
		float expected = r;
		assertEquals(expected, actual, 0);
	}

	@Test
	@Parameters({"10",
				 "13",
				 "16"})
	public void testSurfaceArea(float r) {
		Sphere sphere = new Sphere(dialog, r);
		float actual = sphere.surfaceArea();
		float expected = (float) (4 * Math.PI * Math.pow(r, 2));
		assertEquals(expected, actual, 0);
	}
	
	@Test
	@Parameters({"12",
				 "37",
				 "77"})
	public void testVolume(float r) {
		Sphere sphere = new Sphere(dialog, r);
		float actual = sphere.volume();
		float expected = (float) (4.0 /3 * Math.PI * Math.pow(r, 3));
		assertEquals(expected, actual, 0);
	}
	
	@Test
	@Parameters({"4"})
	public void testRenderMethod(float r) {
		Dialog dialogSub = new MessageBoxSub();
		Sphere sphere = new Sphere(dialogSub, r);
		sphere.render();
	}
	
	@Test
	@Parameters({"-10",
				 "-13",
				 "-16"})
	public void testConstructorForNegNums(float r) {
		Sphere sphere = new Sphere(dialog, r);
		float actual = sphere.volume();
		float expected = 0;
		assertEquals(expected, actual, 0);
	}

}
