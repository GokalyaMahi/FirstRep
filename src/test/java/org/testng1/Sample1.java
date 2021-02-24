package org.testng1;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Sample1 {
	
	@Test
	private void tc0() {
		System.out.println("Method 0");

	}

	@Test
	private void tc1() {
		System.out.println("Method 1");

	}
	
	@Test(retryAnalyzer=FailClass.class)
	private void tc2() {
		System.out.println("Method 2");
		Assert.assertTrue(false);

	}
}
