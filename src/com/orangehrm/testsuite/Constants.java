package com.orangehrm.testsuite;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.orangehrm.utility.Exceloperations;
import com.orangehrm.utility.Screenshots;

public class Constants {

	static RemoteWebDriver driver=null;
	Exceloperations eo=new Exceloperations();
	String path1="E:\\June25batch\\OrangeHRM\\src\\com\\orangehrm\\testdata\\EmployeeList.xlsx";
	Screenshots sc=new Screenshots();
	String path2="E:\\June25batch\\OrangeHRM\\src\\com\\orangehrm\\dataengine\\DataEngine.xlsx";
	
}
