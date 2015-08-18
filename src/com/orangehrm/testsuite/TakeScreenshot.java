package com.orangehrm.testsuite;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TakeScreenshot  extends Constants{
	
	@Test
	public void takingScrrenshot() throws IOException
	{
		String runmode=eo.getCellData(path2,0, 3,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("Screenshot test case skipped");
		}
		else
		{
		 sc.pageScrrenshot(driver,"Addemployee");
		}
	}

}
