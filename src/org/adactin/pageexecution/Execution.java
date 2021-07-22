package org.adactin.pageexecution;

import org.adactic.baseclass.Baseclass;

public class Execution extends PageExecution {

	public static void main(String[] args) {
		Baseclass.browserLaunch();
		Baseclass.loadurl(url);
		PageExecution.login();
	}
}
