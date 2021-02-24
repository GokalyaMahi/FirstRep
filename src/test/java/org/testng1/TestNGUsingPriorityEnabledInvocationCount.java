package org.testng1;

import org.testng.annotations.Test;

public class TestNGUsingPriorityEnabledInvocationCount {

	@Test(priority = 5)
	private void tc0() {
		System.out.println("Method 0");
	}

	@Test(priority = -1)
	private void tc1() {
		System.out.println("Method 1");
	}

	@Test(priority = 0)
	private void tc2() {
		System.out.println("Method 2");
	}

	@Test
	private void tc3() {
		System.out.println("Method 3");
	}

	@Test(priority = 4, enabled = false)
	private void tc4() {
		System.out.println("Method 4");
	}

	@Test(invocationCount = 5)
	private void tc5() {
		System.out.println("Method 5");
	}

	@Test
	private void tc6() {
		System.out.println("Method 6");
	}

	@Test
	private void tc7() {
		System.out.println("Method 7");
	}

	@Test
	private void tc8() {
		System.out.println("Method 8");
	}

	@Test
	private void tc9() {
		System.out.println("Method 9");
	}

	@Test
	private void tc10() {
		System.out.println("Method 10");
	}

}
