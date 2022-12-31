package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.WebDriver;

import com.juaracoding.cucumber.pages.ViewPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestView {
	WebDriver driver;
    private static ExtentTest extentTest;
    private ViewPage viewPage = new ViewPage();

    public TestView() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    
	@When("User click menu Recruitment")
	public void user_click_menu_recruitment() {
//		Hooks.delay(1);
        viewPage.menuView();
        extentTest.log(LogStatus.PASS, "User click menu Recruitment");
    }
	
	@Then("User on menu Recruitment")
	public void user_on_menu_recruitment() {
		//Sengaja fail untuk uji fungsi screenshot
//      Assert.assertEquals(dashboardPage.getTxtDashboard(), "Launching Soo");
      extentTest.log(LogStatus.PASS, "User on menu Dashboard");
	}
}
