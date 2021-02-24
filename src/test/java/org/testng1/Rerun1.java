package org.testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rerun1 {
	@Test(retryAnalyzer=FailClass.class)
	private void tc0() {
		System.out.println("Method 0");
		Assert.assertTrue(false);

	}

	@Test
	private void tc1() {
		System.out.println("Method 1");

	}

	@Test
	private void tc2() {
		System.out.println("Method 2");

	}

	@Test
	private void tc3() {
		System.out.println("Method 3");

	}

	@Test
	private void tc4() {
		System.out.println("Method 4");

	}

}
