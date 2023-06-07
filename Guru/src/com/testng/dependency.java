package com.testng;

import org.checkerframework.checker.units.qual.degrees;
import org.testng.annotations.Test;

public class dependency {
	@Test(enabled = false)
	private void tenth() {
		System.out.println("Tength");
	}
	@Test(dependsOnMethods = "tenth")
	private void higher() {
		System.out.println("Higher");
	}
	@Test(dependsOnMethods = "higher")
	private void degree() {
		System.out.println("DEgree");

	}
}
