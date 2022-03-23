package com.pom_pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {


	public  WebDriver driver;

	public Home_Page(WebDriver driver2) {
            this.driver= driver2;
            PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//a[@class='login']") private WebElement sign_in;
	@FindBy(xpath="(//input[@class='is_required validate account_input form-control'])[2]") private WebElement email;
	@FindBy(xpath="//input[@data-validate='isPasswd']") private WebElement password;
	@FindBy(id="SubmitLogin") private WebElement login;

	public WebElement getSign_in() {
		return sign_in;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}

}
