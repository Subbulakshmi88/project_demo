package com.Runner_Class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.Maven_Class.Base_Class1;
import com.page_object.Pageobject_Manager;

public class Adactin_Runner extends Base_Class1 {
	public static WebDriver driver = browser_launch("chrome");
    public static Pageobject_Manager pom2 = new Pageobject_Manager(driver);
public static Logger log = Logger.getLogger(Adactin_Runner.class);
	public static void main(String[] args) throws IOException, InterruptedException {
		
		geturl("http://adactinhotelapp.com/");

		log.info("url launched");
		implicitwait(30, TimeUnit.SECONDS);
		inputelement(pom2.get_Instance_Li().getUsername(),"Subbulaxmi8896");
		inputelement(pom2.get_Instance_Li().getPassword(),"subha@54321");
		clickelement(pom2.get_Instance_Li().getLogin());
		
		log.info("login");
		
		selectbyIndex("byText", pom2.get_Instance_Cd().getLocation(), "Los Angeles");
		selectbyIndex("byText", pom2.get_Instance_Cd().getHotel(), "Hotel Sunshine");
		selectbyIndex("byText", pom2.get_Instance_Cd().getRoomtype(), "Standard");
		selectbyIndex("byText", pom2.get_Instance_Cd().getRoomno(), "2 - Two");
		selectbyIndex("byText", pom2.get_Instance_Cd().getAdult(), "4 - Four");
		selectbyIndex("byText", pom2.get_Instance_Cd().getChild(), "2 - Two");
		clickelement(pom2.get_Instance_Cd().getSubmit());
		
		log.info("hotel details");


		clickelement(pom2.get_Instance_Sp().getRadiobutton());
		clickelement(pom2.get_Instance_Sp().getCon());
		
		log.info("select hotel");

		inputelement(pom2.get_Instance_Cp().getName(),particular_Cell_Data("C:\\eclipse\\Project_Maven\\ADACTIN EXCEL.xlsx", 15, 5));
		inputelement(pom2.get_Instance_Cp().getLastname(),particular_Cell_Data("C:\\eclipse\\Project_Maven\\ADACTIN EXCEL.xlsx", 16, 5));
		inputelement(pom2.get_Instance_Cp().getAdd(),particular_Cell_Data("C:\\eclipse\\Project_Maven\\ADACTIN EXCEL.xlsx", 17, 5));
		inputelement(pom2.get_Instance_Cp().getCcnum(),particular_Cell_Data("C:\\eclipse\\Project_Maven\\ADACTIN EXCEL.xlsx",18, 5));
		selectbyIndex("byIndex", pom2.get_Instance_Cp().getCctype(), "2");
		selectbyIndex("byIndex", pom2.get_Instance_Cp().getCcexp(), "10");
		selectbyIndex("byIndex", pom2.get_Instance_Cp().getCcyr(), "11");
		inputelement(pom2.get_Instance_Cp().getCccvv(),particular_Cell_Data("C:\\eclipse\\Project_Maven\\ADACTIN EXCEL.xlsx", 22, 5));
		clickelement(pom2.get_Instance_Cp().getBooknow());
		
		log.info("book now");

	    Thread.sleep(20000);

		takessreenshot("C:\\eclipse\\Project_Maven\\Screenshot\\adactin.png");

		clickelement(pom2.get_Instance_Lo().getLogout());
		log.info("logout");



	}

	

	

	

}
