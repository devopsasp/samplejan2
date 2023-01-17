package mygradledemo;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CalulatorTest {

	@Test
	public void testCalculateIntrest() {
		Calculate obj=new Calculate();
		float expected=obj.calculateIntrest(20000, 10, 10);
		float actual=20000;
		assertEquals(expected, actual,0.0);
	}

	
}
