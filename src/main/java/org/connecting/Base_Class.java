package org.connecting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_Class {

public static WebDriver driver;	
	
	    public static  WebDriver browserLaunch(String browser ) {
          if (browser.equalsIgnoreCase("chrome"))
          {
        	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharmilaa\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe" );
        	  driver = new ChromeDriver();
          }else if(browser.equalsIgnoreCase("edge"))
          {
        			  System.setProperty("webdriver.edge.driver","C:\\Users\\Sharmilaa\\eclipse-workspace\\Cucumber\\Driver\\msedgedriver.exe" );
                	  driver = new EdgeDriver();	  
          }else {
        	  System.out.println("Invalid Browser");
        	  
          }
          driver.manage().window().maximize();
		return driver;
	    
	    
	    }
	    public static void Input(WebElement search, String value) {
search.sendKeys(value);
		}
	    public static void clickOnElelemt(WebElement click) {
	    	click.click();
	    			}
	    public static void screenshot(String name) throws IOException {
TakesScreenshot tk = (TakesScreenshot)driver;
File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
File destination = new File("C:\\Users\\Sharmilaa\\Pictures\\Screenshots\\"+name+".img");
FileUtils.copyFile(screenshotAs, destination);
		}
}
