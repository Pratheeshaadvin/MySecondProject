package com.testng;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class Skip_Testcase {
	@Test(priority =0)
	private void start_the_car() {
		System.out.println("Start the car");
	}
	@Test(priority =1)
	private void first_Gear() {
		System.out.println("First gear");

	}
	@Test(priority =5, enabled = false )
	private void music() {
		System.out.println("Music");
	}
	@Test(priority =2)
	private void second_Gear() {
		System.out.println("second Gear");

	}
	@Test(priority =3)
	private void third_Gear() {
		System.out.println("Third Gear");

	}
	@Test(priority =4)
	private void fourth_Gear() {
		System.out.println("Fourth Gear");

	}
}
