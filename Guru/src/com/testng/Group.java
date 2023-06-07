package com.testng;

import org.testng.annotations.Test;

public class Group {
	@Test(groups = {"Apple"})
	private void apple() {
		System.out.println("Apple testing");

	}
	@Test(groups = {"Apple"})
	private void apple1() {
		System.out.println("Apple1 testing");

	}
	@Test(groups = {"Moto"})
	private void moto() {
		System.out.println("Moto testing");

	}
	@Test(groups = {"Moto"})
	private void moto1() {
		System.out.println("Moto1 testing");

	}
	@Test
	private void vivo() {
		System.out.println("vivo testing");
	}
	@Test
	private void vivo1() {
		System.out.println("vivo11 testing");

	}
	@Test
	private void lenovo() {
		System.out.println("Lenovo testing");

	}
	@Test
	private void lenovo1() {
		System.out.println("Lenovo11 testing");
	}
}
