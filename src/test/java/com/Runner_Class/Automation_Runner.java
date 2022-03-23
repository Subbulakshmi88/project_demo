package com.Runner_Class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.Maven_Class.Base_Class;
import com.pom_pro.Page_Object_Manager;

public class Automation_Runner extends Base_Class{

	public static WebDriver driver = browser_launch("chrome");
	public static Page_Object_Manager pom1 = new Page_Object_Manager(driver);
	public static Logger log = Logger.getLogger(Automation_Runner.class);
	public static void main(String[] args) throws IOException, InterruptedException {
		PropertyConfigurator.configure("log4j.properties");

		geturl("http://automationpractice.com/index.php");
		
        log.info("url launched");
		clickelement(pom1.get_Instance_Hp().getSign_in());
		inputelement(pom1.get_Instance_Hp().getEmail(),particular_Cell_Data("C:\\eclipse\\Project_Maven\\AUTOMATION EXCEL.xlsx", 2, 5) );
		inputelement(pom1.get_Instance_Hp().getPassword(),particular_Cell_Data("C:\\eclipse\\Project_Maven\\AUTOMATION EXCEL.xlsx", 7, 5) );
		sleep(1000);
		clickelement(pom1.get_Instance_Hp().getLogin());
		
        log.info("login");

		clickelement(pom1.get_Instance_Bo().getCate());
		sleep(3000);
        clickelement(pom1.get_Instance_Bo().getSize());
		clickelement(pom1.get_Instance_Bo().getColor());
		selectbyIndex("byIndex", pom1.get_Instance_Bo().getSort(), "1");
        clickelement(pom1.get_Instance_Bo().getMore());
        
        log.info("order");

		clear(pom1.get_Instance_Ac().getQuantity());
		inputelement(pom1.get_Instance_Ac().getQuantity(),particular_Cell_Data("C:\\eclipse\\Project_Maven\\AUTOMATION EXCEL.xlsx", 25, 5) );
		implicitwait(10, TimeUnit.SECONDS);
		clickelement(pom1.get_Instance_Ac().getAdd());
		clickelement(pom1.get_Instance_Ac().getCheck());
		
        log.info("order check");

		clickelement(pom1.get_Instance_Co().getCheck12());
		clickelement(pom1.get_Instance_Co().getCheck1());
		implicitwait(50, TimeUnit.SECONDS);
		clickelement(pom1.get_Instance_Co().getCheck2());
		implicitwait(50, TimeUnit.SECONDS);
		clickelement(pom1.get_Instance_Co().getCheck3());
		clickelement(pom1.get_Instance_Co().getPay());
		clickelement(pom1.get_Instance_Co().getConfirm());
		clickelement(pom1.get_Instance_Co().getLogout());
		    
        log.info("logout");

		takessreenshot("C:\\eclipse\\Project_Maven\\Screenshot\\automationpractice1.png");
		
	}

	
}
