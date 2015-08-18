package com.orangehrm.testsuite;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AddEmployee  extends Constants{
	@Test
	public void addEmployeeTest() throws IOException, InterruptedException
	{
		String runmode=eo.getCellData(path2,0, 2,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("AddEmployee test case skipped");
		}
		else
		{
		
		AddEmployeePageObjects addemp=PageFactory.initElements(driver,AddEmployeePageObjects.class);
		Menu menu=PageFactory.initElements(driver,Menu.class);
		int rowCount=eo.getRowCount(path1,0);
		for(int i=1;i<=rowCount;i++)
		{
			Thread.sleep(5000);
			menu.pim.click();
			Thread.sleep(5000);
			Row r=eo.getRow(path1,0,i);
			addemp.addEmployee(r);
			Thread.sleep(5000);
		}
		}
		
	}

}
