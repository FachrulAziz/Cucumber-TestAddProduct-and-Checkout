package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProduct {
    private WebDriver driver;
    public AddProduct(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'ToolsQA Demo Site')]")
    WebElement demoSite;
    @FindBy(xpath = "//a[contains(text(),'playboy x missguided plus size grey lips print fro')]")
    WebElement product;
    @FindBy(xpath = "//a[normalize-space()='pink drop shoulder oversized t shirt']")
    WebElement productTwo;
    @FindBy(xpath = "//select[@id='pa_color']")
    WebElement itemColor;
    @FindBy(xpath = "//select[@id='pa_size']")
    WebElement itemSize;
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement btnAddToCart;
    @FindBy(xpath = "//div[@role='alert']")
    WebElement txtProduct;
    @FindBy(xpath = "//div[@role='alert']")
    WebElement txtProductTwo;

    public void productSelect(String color, String size){
        this.itemColor.sendKeys(color);
        this.itemSize.sendKeys(size);
        btnAddToCart.click();
    }
    public void clickDemoSite(){
        demoSite.click();
    }
    public void SelectProduct(){
        product.click();
    }
    public void selectColor(String color){
        this.itemColor.sendKeys(color);
    }
    public void selectSize(String size){
        this.itemSize.sendKeys(size);
    }
    public void AddToCart(){
        btnAddToCart.click();
    }
    public String getTxtProduct(){
        return txtProduct.getText();
    }
    public void SelectProductTwo(){
        productTwo.click();
    }
    public String getTxtProductTwo(){
        return txtProductTwo.getText();
    }

}
