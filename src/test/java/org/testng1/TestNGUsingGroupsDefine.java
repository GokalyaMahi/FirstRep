package org.testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGUsingGroupsDefine {
	@Test(groups="smoke")
	private void tc0() {
		System.out.println("Method 0");

	}

	@Test(groups="smoke")
	private void tc1() {
		System.out.println("Method 1");

	}

	@Test(groups="smoke")
	private void tc2() {
		System.out.println("Method 2");
		Assert.assertTrue(false);

	}

	@Test(groups="sanity")
	private void tc3() {
		System.out.println("Method 3");

	}

	@Test(groups="sanity")
	private void tc4() {
		System.out.println("Method 4");

	}

	@Test(groups="sanity")
	private void tc5() {
		System.out.println("Method 5");

	}

	@Test(groups="reg")
	private void tc6() {
		System.out.println("Method 6");

	}

	@Test(groups="reg")
	private void tc7() {
		System.out.println("Method 7");

	}

	@Test(groups="reg")
	private void tc8() {
		System.out.println("Method 8");

	}
	
	
}
