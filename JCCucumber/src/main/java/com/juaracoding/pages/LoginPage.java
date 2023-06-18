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
    @FindBy(xpath = "//input[@name='username']")
    WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    WebElement btnLogin;

    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement btnUsername;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement btnLogout;

    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement txtDashboard;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement txtInvalidCredentials;

    @FindBy(xpath = "//span[contains(@class, 'input-field-error-message')]")
    WebElement txtRequired;

    public void btnAccount() {
        this.driver = driver;
        driver.get("https://shop.demoqa.com/my-account/");
    }

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }

    public void logout(){
        btnUsername.click();
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
    }

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }

    public String getTxtInvalidCredentials(){
        return txtInvalidCredentials.getText();
    }

    public String getAtributUsername(){
        return username.getAttribute("required"); // return true, value dari required
    }

}
