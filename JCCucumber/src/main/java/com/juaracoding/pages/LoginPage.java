package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@placeholder='NIK']")
    WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;

    @FindBy(xpath = "//span[normalize-space()='ALFIN ERIA SEPTIADY']")
    WebElement btnStaff;

    @FindBy(xpath = "//span[normalize-space()='ADITYA RIDWAN NUGRAHA']")
    WebElement btnUser1;

    @FindBy(xpath = "//span[normalize-space()='ALFIN ERIA SEPTIADY']")
    WebElement btnUser2;

    @FindBy(xpath = "//span[normalize-space()='HUSAINI AL BANNA']")
    WebElement btnUser3;

    @FindBy(xpath = "//span[normalize-space()='NURUL HASNI']")
    WebElement btnUser4;

    @FindBy(xpath = "//a[normalize-space()='Log Out']")
    WebElement btnLogout;

    @FindBy(xpath = "//h1[@class='page-header']")
    WebElement txtDashboard;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissable']")
    WebElement txtInvalidCredentials;


    public void login(String username, String password){
        this.username.clear();
        this.password.clear();
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }

    public void logoutStaff(){
        btnStaff.click();
    }

    public void logoutUser1(){
        btnUser1.click();
    }

    public void logoutUser2(){
        btnUser2.click();
    }

    public void logoutUser3(){
        btnUser3.click();
    }

    public void logoutUser4(){
        btnUser4.click();
    }

    public void logout(){
        btnLogout.click();
    }

    public void enterUsername(String username){
        this.username.sendKeys(username);
    }

    public void enterPassword(String password){
        this.password.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnLogin.click();
        delay(3);
    }

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }

    public String getTxtInvalidCredentials(){
        return txtInvalidCredentials.getText();
    }
    static void delay(long detik){
        try {
            Thread.sleep(detik*1000); // delay 3 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
