package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.WebDriver;

import com.juaracoding.cucumber.pages.AddPage;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAdd {
	
	WebDriver driver;
    private static ExtentTest extentTest;
    private AddPage addPage = new AddPage();

    public TestAdd() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
	
	@When("User click Add")
	public void user_click_add() {
	    addPage.menuAdd();
	}
	@When("Isi First Name")
	public void isi_first_name() {
	    addPage.addFname();
	}
	@When("Isi Middle Name")
	public void isi_middle_name() {
	    addPage.addMname();
	}
	@When("Isi Last Name")
	public void isi_last_name() {
	    addPage.addLname();
	}
	@When("Pilih Vacany")
	public void pilih_vacany() {
		addPage.menuVacany();
		addPage.addVacany();
	}
	@When("Isi Email")
	public void isi_email() {
	    addPage.addEMail();
	}
	@When("Isi Contact Number")
	public void isi_contact_number() {
	    addPage.addNumber();
	}
	@When("Isi Resume")
	public void isi_resume() {
	    addPage.addResume();
	}
	@When("Isi Keyword")
	public void isi_keyword() {
	    addPage.addKeyword();
	}
	@When("Pilih Tanggal")
	public void pilih_tanggal() {
	    addPage.menuDate("2022-12-06");
	}
	@When("Isi notes")
	public void isi_notes() {
	    addPage.addNotes();
	}
	@When("Centang Data")
	public void centang_data() {
	    addPage.addCeklis();
	}
	@Then("Klik Save")
	public void klik_save() {
	    addPage.addSave();
	}
}
