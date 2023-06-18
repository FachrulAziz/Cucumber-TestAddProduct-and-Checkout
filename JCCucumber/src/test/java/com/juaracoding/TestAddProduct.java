package com.juaracoding;

import com.juaracoding.pages.AddProduct;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAddProduct {

    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();
    static AddProduct addProduct = new AddProduct();
    
    public TestAddProduct(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    
    @When("User click menu demo site")
    public void User_click_menu_demo_site(){
        addProduct.clickDemoSite();
        extentTest.log(LogStatus.PASS,"User click menu demo site");
    }
    @And("User select product one")
    public void User_select_product_one(){
        addProduct.SelectProduct();
        extentTest.log(LogStatus.PASS,"User select product one");
    }
    @And("User select color")
    public void User_select_color(){
        addProduct.selectColor("Grey");
        extentTest.log(LogStatus.PASS, "User select color");
    }
    @And("User select size")
    public void User_select_size(){
        addProduct.selectSize("42");
        extentTest.log(LogStatus.PASS, "User select size");
    }
    @And("User select add to cart")
    public void User_select_add_to_cart(){
        addProduct.AddToCart();
        extentTest.log(LogStatus.PASS,"User select product one");
    }
    @Then("User get text title add product one")
    public void User_get_text_title_add_product_one(){
        Hooks.delay(1);
        Assert.assertEquals(addProduct.getTxtProduct(),"View cart\n" +
                "“playboy x missguided plus size grey lips print front cropped t shirt” has been added to your cart.");
        extentTest.log(LogStatus.PASS,"User get text title add product one");
    }

    /* ===== product two ===== */
    @And("User select product two")
    public void User_select_product_two(){
        addProduct.SelectProductTwo();
        extentTest.log(LogStatus.PASS,"User select product two");
    }
    @And("User select color two")
    public void User_select_color_two(){
        addProduct.selectColor("Pink");
        extentTest.log(LogStatus.PASS, "User select color two");
    }
    @And("User select size two")
    public void User_select_size_two(){
        addProduct.selectSize("37");
        extentTest.log(LogStatus.PASS, "User select size two");
    }
    @Then("User get text title add product two")
    public void User_get_text_title_add_product_two(){
        Hooks.delay(1);
        Assert.assertEquals(addProduct.getTxtProduct(),"View cart\n" +
                "“pink drop shoulder oversized t shirt” has been added to your cart.");
        extentTest.log(LogStatus.PASS,"User get text title add product one");
    }
}
