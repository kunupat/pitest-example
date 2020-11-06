package com.test.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.test.Main;

public class MainTest {

	@Test
	public void test1() {
		assertTrue(Main.method(0));
	}
	
	/*
	 * @Test public void test2() { assertTrue(Main.method(1)); }
	 */
	
	/*
	 * @Test public void test3() { assertFalse(Main.method(-1)); }
	 */
}
