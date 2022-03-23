package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout_Page {

	public  WebDriver driver;

	@FindBy(id="logout") private WebElement logout ;

	public Logout_Page(WebDriver driver2) {
this.driver = driver2;
}

	public WebElement getLogout() {
		return logout;
	}
}
