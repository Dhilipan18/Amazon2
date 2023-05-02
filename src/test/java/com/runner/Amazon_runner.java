package com.runner;

import org.connecting.Base_Class;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Sharmilaa\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\feature\\Amazon.feature",
glue = "com.stepdefinition")



public class Amazon_runner {
	
	public static WebDriver driver;

	@BeforeClass

	public static void browser() {
  System.setProperty("webdriver.edge.driver","C:\\Users\\Sharmilaa\\eclipse-workspace\\Cucumber\\Driver\\msedgedriver.exe");
  driver = new EdgeDriver();
  driver.manage().window().maximize();
	
	}
}
