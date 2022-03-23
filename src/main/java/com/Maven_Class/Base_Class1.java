package com.Maven_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Base_Class1 {
	public static WebDriver driver;
	public static String value;

	public static WebDriver browser_launch(String type) {
    if (type.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	} else if (type.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver","value");
		driver = new FirefoxDriver();
    }
    driver.manage().window().maximize();
    return driver;
	}
	public static void geturl(String url) {
		 driver.get(url);	
   }
	public static void clickelement(WebElement element) {
         element.click();
	}
	public static void inputelement(WebElement element, String data) {
		 element.sendKeys(data);
	}
	public static void sleep(int milliseconds) throws InterruptedException {
         Thread.sleep(milliseconds);
	}
	public static void selectbyIndex(String type, WebElement element2, String data2) {
		try {
			Select select1 = new Select(element2);
			if (type.equalsIgnoreCase("byValue")) {
				select1.selectByValue(data2);
			} else if (type.equalsIgnoreCase("byText")) {
				select1.selectByVisibleText(data2);
			}else if (type.equalsIgnoreCase("byIndex")) {
				int index = Integer.parseInt(data2);
				select1.selectByIndex(index);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	public static void implicitwait(int seconds, TimeUnit data) {
        try {
			driver.manage().timeouts().implicitlyWait(seconds, data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void clear(WebElement element1) {
		element1.clear();
	}
	public static void takessreenshot(String path) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File(path);
        FileUtils.copyFile(src, dest);
	}
	public static void close() {
	     driver.close();;
	}
	public static String particular_Cell_Data(String path, int row_Index, int cell_Index) throws IOException {

		File f = new File(path);
		FileInputStream fiS = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fiS);
        Sheet s = w.getSheetAt(0);
		Row r = s.getRow(row_Index);
		Cell c = r.getCell(cell_Index);
		CellType ct = c.getCellType();
		if (ct.equals(CellType.STRING)) {
			value = c.getStringCellValue();
		} else if (ct.equals(CellType.NUMERIC)){
            double nc = c.getNumericCellValue();
          int val  =(int) nc;
          value = String.valueOf(val);
		}
              return value;	
	}
}
