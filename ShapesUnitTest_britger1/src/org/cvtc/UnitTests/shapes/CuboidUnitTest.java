package org.cvtc.UnitTests.shapes;

import static org.junit.Assert.*;

import org.cvtc.UnitTests.shapes.messaging.MessageBoxSub;
import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.messaging.Dialog;
import org.cvtc.shapes.messaging.MessageBox;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class CuboidUnitTest {

	Dialog dialog = new MessageBox();
	MessageBoxSub dialogSub = new MessageBoxSub();
	
	@Test
	@Parameters({"10, 20, 30"})
	public void testGetLength(float l, float w, float d) {
		Cuboid cuboid = new Cuboid(dialog, l, w, d);
		float actual = cuboid.getLength();
		float expected = l;
		assertEquals(expected, actual, 0);
	}
	
	@Test
	@Parameters({"10, 20, 30"})
	public void testGetWidth(float l, float w, float d) {
		Cuboid cuboid = new Cuboid(dialog, l, w, d);
		float actual = cuboid.getWidth();
		float expected = w;
		assertEquals(expected, actual, 0);
	}
	
	@Test
	@Parameters({"10, 20, 30"})
	public void testGetDepth(float l, float w, float d) {
		Cuboid cuboid = new Cuboid(dialog, l, w, d);
		float actual = cuboid.getDepth();
		float expected = d;
		assertEquals(expected, actual, 0);
	}
	
	@Test
	@Parameters({"10, 20, 30",
				 "13, 2, 4",
				 "16, 99, 1"})
	public void testSurfaceArea(float l, float w, float d) {
		Cuboid cuboid = new Cuboid(dialog, l, w, d);
		float actual = cuboid.surfaceArea();
		float expected = d*w*2 + d*l*2 + l*w*2;
		assertEquals(expected, actual, 0);
	}
	
	@Test
	@Parameters({"12, 13, 16",
				 "37, 14, 20",
				 "77, 53, 41"})
	public void testVolume(float l, float w, float d) {
		Cuboid cuboid = new Cuboid(dialog, l, w, d);
		float actual = cuboid.volume();
		float expected = d*w*l;
		assertEquals(expected, actual, 0);
	}
	
	@Test
	@Parameters({"4, 5, 2"})
	public void testRenderMethod(float l, float w, float d) {
		Dialog dialogSub = new MessageBoxSub();
		Cuboid sphere = new Cuboid(dialogSub, l, w, d);
		sphere.render();
	}
	
	@Test
	@Parameters({"-10, -20, 30",
				 "13, -2, 4",
				 "16, 99, -1"})
	public void testConstructorForNegNums(float l, float w, float d) {
		Cuboid cuboid = new Cuboid(dialog, l, w, d);
		float actual = cuboid.volume();
		float expected = 0;
		assertEquals(expected, actual, 0);
	}
}