package com.pom_pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Order {

	public  WebDriver driver;
	public Book_Order(WebDriver driver2) {
        this.driver = driver2;
        PageFactory.initElements(driver, this);

}
	@FindBy(xpath="(//a[@title='T-shirts'])[2]") private WebElement cate;
	@FindBy(id="layered_id_attribute_group_1") private WebElement size;
	@FindBy(id="layered_id_attribute_group_13") private WebElement color;
	@FindBy(id="selectProductSort") private WebElement sort;
	@FindBy(xpath="//a[@title='Faded Short Sleeve T-shirts']") private WebElement more;
		public WebElement getCate() {
		return cate;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getColor() {
		return color;
	}
	public WebElement getSort() {
		return sort;
	}
	public WebElement getMore() {
		return more;
	}
	
	
}
