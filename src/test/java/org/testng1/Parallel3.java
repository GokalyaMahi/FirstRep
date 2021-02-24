package org.testng1;

import org.testng.annotations.Test;

public class Parallel3 {
	@Test
	private void tc000() {
		System.out.println("Method 000");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc111() {
		System.out.println("Method 111");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc222() {
		System.out.println("Method 222");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc333() {
		System.out.println("Method 333");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc444() {
		System.out.println("Method 444");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc555() {
		System.out.println("Method 555");
		System.out.println(Thread.currentThread().getId());

	}

}
