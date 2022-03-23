package com.pom_pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Order {


	public  WebDriver driver;
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]") private WebElement check12;
	@FindBy(xpath="(//button[@type='submit'])[2]") private WebElement check1;
	@FindBy(id="cgv") private WebElement check2;
	@FindBy(xpath="//button[@class='button btn btn-default standard-checkout button-medium']") private WebElement check3;
	@FindBy(xpath="//a[@class='bankwire']") private WebElement pay;
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']") private WebElement confirm;
	@FindBy(xpath="//a[@title='Log me out']") private WebElement logout;
	
	public Confirm_Order(WebDriver driver2) {
              this.driver = driver2;
              PageFactory.initElements(driver, this);

    }
	public WebElement getCheck12() {
		return check12;
	}
	public WebElement getCheck1() {
		return check1;
	}
	public WebElement getCheck2() {
		return check2;
	}
	public WebElement getCheck3() {
		return check3;
	}
	public WebElement getPay() {
		return pay;
	}
	public WebElement getConfirm() {
		return confirm;
	}
	public WebElement getLogout() {
		return logout;
	}

}
