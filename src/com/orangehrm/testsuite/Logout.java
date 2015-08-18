package com.orangehrm.testsuite;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Logout  extends Constants{
	
	@Test
	public void logoutTest() throws IOException
	{
		String runmode=eo.getCellData(path2,0, 4,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("AddEmployee test case skipped");
		}
		else
		{
		LogoutPageObject lp=PageFactory.initElements(driver,LogoutPageObject.class);
		lp.logout();
		}
	}

}
