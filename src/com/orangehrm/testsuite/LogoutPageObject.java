package com.orangehrm.testsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPageObject  extends Constants{
	
	@FindBy(id="welcome")
	WebElement welcome;
	@FindBy(xpath="//*[@id='welcome-menu']/ul/li[2]/a")
	WebElement logout;
	public void logout()
	{
		welcome.click();
		logout.click();
	}

}
