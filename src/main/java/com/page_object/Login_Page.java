package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page {

	public  WebDriver driver;

	@FindBy(id="username") private WebElement username ;
	@FindBy(id="password") private WebElement password ;
	public Login_Page(WebDriver driver2) {
this.driver= driver2;
}

	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	@FindBy(id="login") private WebElement login ;
}
