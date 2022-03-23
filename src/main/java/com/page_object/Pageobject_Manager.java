package com.page_object;

import org.openqa.selenium.WebDriver;



public class Pageobject_Manager {
	public  WebDriver driver;
	private  Login_Page li;
	private  Customer_Details cd;
	private   Customer_Page cp;
	private  Select_Page sp;
	private  Logout_Page lo;
	
	public Pageobject_Manager(WebDriver driver2) {
this.driver = driver2;
}
	public Login_Page get_Instance_Li() {
		if(li==null) {
			li = new Login_Page(driver);
		}
		return li;
	}
	public Customer_Details get_Instance_Cd() {
		if(cd==null) {
			cd = new Customer_Details(driver);
		}
		return cd;
	}
	public Customer_Page get_Instance_Cp() {
		if(cp==null) {
			cp = new Customer_Page(driver);
		}
		return cp;
	}
	public Select_Page get_Instance_Sp() {
		if(sp==null) {
			sp = new Select_Page(driver);
		}
		return sp;
	}
	public Logout_Page get_Instance_Lo() {
		if(lo==null) {
			lo = new Logout_Page(driver);
		}
		return lo;
	}

}
