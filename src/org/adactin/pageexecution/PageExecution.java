package org.adactin.pageexecution;

import org.adactic.baseclass.Baseclass;
import org.adactin.pagefactory.Pagefactory;

public class PageExecution extends Pagefactory {

	public static void login() {
		Baseclass.typeData(Baseclass.findElementByID(username), "Rajvimal07");
		Baseclass.typeData(Baseclass.findElement(password), "e2wuLTfswyT@MBK");
		Baseclass.click(Baseclass.findElement(getloginButton()));
	}
}
