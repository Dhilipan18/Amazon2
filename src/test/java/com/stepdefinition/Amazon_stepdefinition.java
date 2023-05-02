package com.stepdefinition;

import org.connecting.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.search.Search;

import com.runner.Amazon_runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_stepdefinition extends Base_Class {
	
   public static WebDriver driver = Amazon_runner.driver;
   
   Search s = new Search(driver);
   
   
   
   
	@Given("user Can able to lauch the url")
	public void user_can_able_to_lauch_the_url() {
	  driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=74238127911&hvpone=&hvptwo=&hvadid=610644609009&hvpos=&hvnetw=g&hvrand=5801196048929901068&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-29089120&hydadcr=5496_2359482");
	}

	@When("user Can able to search the product in search box")
	public void user_can_able_to_search_the_product_in_search_box() {
	  // WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
	 
Input(s.getUserName(), "sangeeth");
	   
	 
	   
	}

	@When("user Can able to click the search button")
	public void user_can_able_to_click_the_search_button() {
	    //WebElement findElement = driver.findElement(By.id("nav-search-submit-button"));
	 clickOnElelemt(s.getSearch());
	}

	@Then("user can able to navigate to text page")
	public void user_can_able_to_navigate_to_text_page() throws InterruptedException {
	   Thread.sleep(1000);
	}

	@When("user Can able to scroll the product")
	public void user_can_able_to_scroll_the_product() {
		//WebElement findElement = driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]"));
		clickOnElelemt(s.getClick());
		
	    
	}

	@When("user Can able to select the particular product")
	public void user_can_able_to_select_the_particular_product() {
	// WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
	 clickOnElelemt(s.getClick());
	}

	@Then("user Can able to navigate to next page")
	public void user_can_able_to_navigate_to_next_page() {
	   WebElement findElement = driver.findElement(By.id("nav-search-submit-button"));
	   clickOnElelemt(findElement);
	}
}
