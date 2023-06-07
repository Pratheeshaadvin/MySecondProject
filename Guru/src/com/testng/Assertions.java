package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	String name ="Pratheesha";
	boolean value =false;
	@Test
	private void CheckAssertion() {
		Assert.assertEquals(name,"Pratheesha");
		Assert.assertNotEquals(name, "pratheesha");
		Assert.assertFalse(value, "false");
	}
}
