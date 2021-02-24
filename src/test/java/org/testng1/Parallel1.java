package org.testng1;

import org.testng.annotations.Test;

public class Parallel1 {
	@Test
	private void tc0() {
		System.out.println("Method 0");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc1() {
		System.out.println("Method 1");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc2() {
		System.out.println("Method 2");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc3() {
		System.out.println("Method 3");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc4() {
		System.out.println("Method 4");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc5() {
		System.out.println("Method 5");
		System.out.println(Thread.currentThread().getId());

	}

}
