package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
    private WebDriver driver;
    public CheckOut(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@class='button wc-forward wp-element-button']")
    WebElement btnViewCart;
    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward wp-element-button']")
    WebElement btnProses;
    @FindBy(xpath = "//input[@id='billing_first_name']")
    WebElement inputfirstName;
    @FindBy(xpath = "//input[@id='billing_last_name']")
    WebElement inputlastName;
    @FindBy(xpath = "//input[@id='billing_company']")
    WebElement inputCompany;
    @FindBy(xpath = "//span[@id='select2-billing_country-container']")
    WebElement selectSelectCountry;
    @FindBy(xpath = "//input[@id='billing_address_1']")
    WebElement inputAddres;
    @FindBy(xpath = "//input[@id='billing_city']")
    WebElement inputCity;
    @FindBy(xpath = "//span[@id='select2-billing_state-container']")
    WebElement selectProvince;
    @FindBy(xpath = "//input[@id='billing_postcode']")
    WebElement inputPostCode;
    @FindBy(xpath = "//input[@id='billing_phone']")
    WebElement inputPhoneNumber;
    @FindBy(xpath = "//input[@id='billing_email']")
    WebElement inputEmail;
    @FindBy(xpath = "//input[@id='terms']")
    WebElement btnCheckBox;
    @FindBy(xpath = "//button[@id='place_order']")
    WebElement btnOrder;
    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement txtCheckout;

    public void btnCheckOut() {
        this.driver = driver;
        driver.get("https://shop.demoqa.com/checkout/");
    }
    public void clickBtnCart(){
        btnViewCart.click();
    }
    public void clickBtnProses(){
        btnProses.click();
    }

    public void checkOut(String inputfirstName, String inputlastName, String inputCompany,
                         String selectCountry, String inputAddres, String inputCity,
                         String selectProvince, String inputPostCode, String inputPhoneNumber,
                         String inputEmail){
        this.inputfirstName.sendKeys(inputfirstName);
        this.inputlastName.sendKeys(inputlastName);
        this.inputCompany.sendKeys(inputCompany);
        this.selectSelectCountry.sendKeys(selectCountry);
        this.inputAddres.sendKeys(inputAddres);
        this.inputCity.sendKeys(inputCity);
        this.selectProvince.sendKeys(selectProvince);
        this.inputPostCode.sendKeys(inputPostCode);
        this.inputPhoneNumber.sendKeys(inputPhoneNumber);
        this.inputEmail.sendKeys(inputEmail);
        btnCheckBox.click();
        btnOrder.click();
    }
    public void enterFirstName(String inputfirstName){
        this.inputfirstName.sendKeys(inputfirstName);
    }
    public void enterLastName (String inputlastName){
        this.inputlastName.sendKeys(inputlastName);
    }
    public void enterInputCompany(String inputCompany){
        this.inputCompany.sendKeys(inputCompany);
    }
    public void enterSelectCountry (String selectCountry){
        this.selectSelectCountry.sendKeys(selectCountry);
    }
    public void SelectinputAddres(String inputAddres){
        this.inputAddres.sendKeys(inputAddres);
    }
    public void selectInputCity (String inputCity){
        this.inputCity.sendKeys(inputCity);
    }
    public void SelectInputProvince(String selectProvince){
        this.selectProvince.sendKeys(selectProvince);
    }
    public void InsertInputPostCode (String inputPostCode){
        this.inputPostCode.sendKeys(inputPostCode);
    }
    public void insertPhoneNumber(String inputPhoneNumber){
        this.inputPhoneNumber.sendKeys(inputPhoneNumber);
    }
    public void inputEmailAddres (String inputEmail){
        this.inputEmail.sendKeys(inputEmail);
    }
    public void clickBtnOrder(){
        btnOrder.click();
    }
    public void clickBtnCek(){
        btnCheckBox.click();
    }
    public String getTxtDashboard(){
        return txtCheckout.getText();
    }
}
