package com.testng;

import java.util.jar.Attributes.Name;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized {
	@Test
	@Parameters("Myname")
	private void name(String namevalue) {
		System.out.println("My name is "+namevalue);
	}
}
