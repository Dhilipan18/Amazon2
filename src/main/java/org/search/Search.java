package org.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

	
	public static WebDriver driver;
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}

    @FindBy(id = "nav-search-submit-button")
    private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	@FindBy(xpath = "//a[contains(text(),'Best Sellers')]")
	private WebElement click;

	public WebElement getClick() {
		return click;
	}

	public Search(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver, this);
	}
}
