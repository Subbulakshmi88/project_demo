package com.pom_pro;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {

	public  WebDriver driver;
	private  Home_Page hp;
	private  Book_Order bo;
	private   Add_Cart ac;
	private  Confirm_Order co;
	
	public Page_Object_Manager(WebDriver driver2) {
         this.driver = driver2;
}

	

	public Home_Page get_Instance_Hp() {
		
		if(hp==null) {
			hp = new Home_Page(driver);
		}
		return hp;
	}
	
	public Book_Order get_Instance_Bo() {
		if(bo==null) {
			bo = new Book_Order(driver);
		}
		return bo;
	}
	
	public Add_Cart get_Instance_Ac() {
		if(ac==null) {
			ac = new Add_Cart(driver);
		}
		return ac;
	}
	
	public Confirm_Order get_Instance_Co() {
		if(co==null) {
			co = new Confirm_Order(driver);
		}
		return co;
	}
}
