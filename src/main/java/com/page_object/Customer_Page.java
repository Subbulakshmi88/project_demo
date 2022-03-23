package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customer_Page {

	public  WebDriver driver;

	@FindBy(id="first_name") private WebElement name ;
	@FindBy(id="last_name") private WebElement lastname ;
	@FindBy(id="address") private WebElement add ;
	@FindBy(id="cc_num") private WebElement ccnum ;
	@FindBy(id="cc_type") private WebElement cctype ;
	@FindBy(id="cc_exp_month") private WebElement ccexp ;
	@FindBy(id="cc_exp_year") private WebElement ccyr ;
	@FindBy(id="cc_cvv") private WebElement cccvv ;
	@FindBy(id="book_now") private WebElement booknow ;
	
	public Customer_Page(WebDriver driver2) {
this.driver = driver2;
}
	public WebElement getName() {
		return name;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getCcexp() {
		return ccexp;
	}
	public WebElement getCcyr() {
		return ccyr;
	}
	public WebElement getCccvv() {
		return cccvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}

}
