package org.adactic.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver = null;
	 
	 public static void browserLaunch() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajrk\\eclipse-workspace\\Selenium\\jar\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	 }
	 
	 public static void loadurl(String url) {
		 driver.get(url);
	 }
	 
	 public static WebElement findElementByID(String id) {
			return driver.findElement(By.id(id));
	 }
	 
	 public static WebElement findElement(String xpath) {
			return driver.findElement(By.xpath(xpath));
	 }	
	 
	 public static WebElement findElement(By ab) {
			return driver.findElement(ab);
	 }	
	 
	 public static void typeData(WebElement element, String data) {
			element.sendKeys(data);
	 }
	 
	 public static void select(WebElement element, int num) {
			Select ss = new Select(element);
			ss.selectByIndex(num);
	 }
	 
	 public static void click(WebElement element) {
			element.click();
	 }
}
