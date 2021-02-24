package org.testng1;

import org.testng.annotations.Test;

public class Parallel2 {
	@Test
	private void tc00() {
		System.out.println("Method 00");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc11() {
		System.out.println("Method 11");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc22() {
		System.out.println("Method 22");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc33() {
		System.out.println("Method 33");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc44() {
		System.out.println("Method 44");
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc55() {
		System.out.println("Method 55");
		System.out.println(Thread.currentThread().getId());

	}

}
