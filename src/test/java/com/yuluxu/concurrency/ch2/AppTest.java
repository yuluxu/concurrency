package com.yuluxu.concurrency.ch2;

import org.junit.Test;

import junit.framework.TestCase;

public class AppTest extends TestCase
{
	private App app;

	@Test
	public void testSum()
	{
		int expected = 3;
		int actual = app.sum(1, 2);
		assertTrue(expected == actual);
	}

	public void setUp()
	{
		app = new App();
	}
}
