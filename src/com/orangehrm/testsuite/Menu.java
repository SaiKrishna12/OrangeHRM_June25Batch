package com.orangehrm.testsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu {
	@FindBy(xpath="//*[@id='menu_admin_viewAdminModule']/b")
	WebElement admin;
	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']/b")
	WebElement pim;
	@FindBy(xpath="//*[@id='menu_leave_viewLeaveModule']/b")
	WebElement leave;
	@FindBy(xpath="//*[@id='menu_time_viewTimeModule']/b")
	WebElement time;
	@FindBy(xpath="//*[@id='menu_recruitment_viewRecruitmentModule']/b")
	WebElement recrutment;
	@FindBy(xpath="//*[@id='menu_performance_viewPerformanceModule']/b")
	WebElement performance;
	
	
	

}
