package com.pom_pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Cart {

	public  WebDriver driver;
	public Add_Cart(WebDriver driver2) {
        this.driver = driver2;
        PageFactory.initElements(driver, this);

}
	
	@FindBy(id="quantity_wanted") private WebElement quantity ;
	@FindBy(xpath="(//button[@type='submit'])[3]") private WebElement add ;
	@FindBy(xpath="//a[@title='Proceed to checkout']") private WebElement check ;
	
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getCheck() {
		return check;
	}

}
