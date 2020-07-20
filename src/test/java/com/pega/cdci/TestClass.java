package com.pega.cdci;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ghorh\\Documents\\seleniumbazinga\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://automationtalks.com/");
		System.out.println("test1----->" + driver.getTitle());

	}

	@Test
	public void test2() {

		Assert.assertTrue(true);

	}

}
