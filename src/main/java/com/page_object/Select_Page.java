package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Select_Page {

	public  WebDriver driver;

	@FindBy(id="radiobutton_0") private WebElement radiobutton ;
	@FindBy(id="continue") private WebElement con ;
	public Select_Page(WebDriver driver2) {
this.driver = driver2;
}
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getCon() {
		return con;
	}
	
}
