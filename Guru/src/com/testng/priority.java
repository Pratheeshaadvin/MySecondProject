package com.testng;

import org.testng.annotations.Test;

public class priority {
	@Test(priority = 1)
	private void first() {
		System.out.println("First");

	}
	@Test(priority = 0)
	private void second() {
		System.out.println("second");

	}
	@Test(priority = 2)
	private void third() {
		System.out.println("Third");

	}
	@Test(priority = 3)
	private void four() {
		System.out.println("four");

	}
}
