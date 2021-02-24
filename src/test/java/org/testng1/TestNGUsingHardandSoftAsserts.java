package org.testng1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGUsingHardandSoftAsserts {
	@Test
	private void tc11() {
		System.out.println("Method 11");
		Assert.assertEquals("Method 11", "Method", "Failed method");
		System.out.println("Method after Hard Assert");

	}

	@Test
	private void tc12() {
		System.out.println("Method 12");
		SoftAssert s = new SoftAssert();
		s.assertEquals("Method 13", "Method", "Failed Method");
		System.out.println("Method after Soft Assert");

	}

	@Test
	private void tc13() {
		System.out.println("Method 13");
		SoftAssert s = new SoftAssert();
		s.assertEquals("Method 13", "Method", "Failed Method");
		s.assertAll();
		System.out.println("Method after Soft Assert");

	}

	@Test
	private void tc14() {
		System.out.println("Method 14");

	}

	@Test
	private void tc15() {
		System.out.println("Method 15");

	}

}
