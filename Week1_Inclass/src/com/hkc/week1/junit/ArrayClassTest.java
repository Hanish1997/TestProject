package com.hkc.week1.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayClassTest {

	@Test
	public void testPass()
	{
		assertTrue(ArrayClass.isPass(90));
		assertFalse(ArrayClass.isPass(45));
	}
	@Test
	public void testGrade()
	{
		assertEquals('A',ArrayClass.grade(95));
		assertEquals('B',ArrayClass.grade(89));
		assertEquals('C',ArrayClass.grade(70));
		assertEquals('D',ArrayClass.grade(62));
		assertEquals('F',ArrayClass.grade(54));
	}
	

}