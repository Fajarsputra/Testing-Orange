package com.juaracoding.cucumber.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber.drivers.DriverSingleton;

public class AddPage {
	private WebDriver driver;

    public AddPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement menuAdd;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement addFirst;
    
    @FindBy(xpath = "//input[@name='middleName']")
    WebElement addMiddle;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement addLast;
    
    @FindBy(xpath = "//div[@class='oxd-select-text--after']")
    WebElement menuVacancy;
    
    @FindBy(xpath = "//div/div/div/div[2]/div/div[2]/div[3]")
    WebElement addVacancy;

    @FindBy(xpath = "//div/div/form/div[3]/div/div[1]/div/div[2]/input")
    WebElement addEmail;
    
    @FindBy(xpath = "//div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")
    WebElement addNumber;

    @FindBy(xpath = "//input[@type=\"file\"]")
    WebElement addResume;
    
    @FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
    WebElement addKeywords;

    @FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
    WebElement menuDate;
    
    @FindBy(xpath = "//textarea[@placeholder='Type here']")
    WebElement addNote;

    @FindBy(xpath = "//div[@class='oxd-checkbox-wrapper']")
    WebElement addCeklis;
    
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addSave;
    
    public void menuAdd(){
        menuAdd.click();
    }
    
    public void addFname(){
        addFirst.sendKeys("Fajar");;
    }
    
    public void addMname(){
        addMiddle.sendKeys("Sepdiannicha");
    }
    
    public void addLname(){
        addLast.sendKeys("Putra");
    }
    
    public void menuVacany(){
        menuVacancy.click();
    }
    
    public void addVacany(){
        addVacancy.click();
    }
    
    public void addEMail(){
        addEmail.sendKeys("fajar@mail.com");
    }
    
    public void addNumber(){
        addNumber.sendKeys("0895464689");
    }
    
    public void addResume(){
        addResume.sendKeys("D:\\Test\\1.docx");
    }
    
    public void addKeyword(){
        addKeywords.sendKeys("Surat Lamaran Kerja");
    }
    
    public void menuDate(String dateInvalid){
        menuDate.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
		menuDate.sendKeys(dateInvalid);
    }
    
    public void addNotes(){
        addNote.sendKeys("Berkas Lamaran");
    }
    
    public void addCeklis(){
        addCeklis.click();
    }
    
    public void addSave(){
        addSave.click();
    }
}
