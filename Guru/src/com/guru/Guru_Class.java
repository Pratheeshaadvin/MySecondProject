package com.guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru_Class {
	public static void main(String[] args) {
		//gecko driver download
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\ADMIN\\eclipse-workspace\\Guru\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		WebElement uid = driver.findElement(By.xpath("//input[@type='text']"));
		uid.sendKeys("mngr495231");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("judYpAn");
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
	}
}
