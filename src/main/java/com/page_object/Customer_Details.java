package com.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customer_Details {

	public  WebDriver driver;

	@FindBy(id="location") private WebElement location ;
	@FindBy(id="hotels") private WebElement hotel ;
	@FindBy(id="room_type") private WebElement roomtype ;
	@FindBy(id="room_nos") private WebElement roomno ;
	@FindBy(id="adult_room") private WebElement adult ;
	@FindBy(id="child_room") private WebElement child ;
	@FindBy(id="Submit") private WebElement submit ;
	public Customer_Details(WebDriver driver2) {
		this.driver = driver2;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomno() {
		return roomno;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSubmit() {
		return submit;
	}

}
