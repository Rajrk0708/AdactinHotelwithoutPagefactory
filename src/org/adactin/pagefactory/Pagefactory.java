package org.adactin.pagefactory;

import org.adactic.baseclass.Baseclass;
import org.openqa.selenium.By;

public class Pagefactory extends Baseclass {
	
	//geturl
	public static String url = "http://adactinhotelapp.com/";

	//locator by String id
	public static String username = "username";
	
	//locator by abstract "By"
	public static By password = By.id("password");
	
	//locator by "click" getter method
	public static String getloginButton() {
		return "//input[@class='login_button']";
	}
}
