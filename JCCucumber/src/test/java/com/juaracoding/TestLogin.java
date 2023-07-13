package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User enter url TMS")
    public void user_enter_url_tms(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User enter URL TMS");
    }

    @When("User enter valid username")
    public void user_enter_valid_username(){
        loginPage.enterUsername("D6220404");
        extentTest.log(LogStatus.PASS,"User enter valid username");
    }

    @And("User enter valid password")
    public void user_enter_valid_password(){
        loginPage.enterPassword("1996-09-29");
        extentTest.log(LogStatus.PASS,"User enter valid password");
    }

    @And("User click button login")
    public void user_click_button_login(){
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS,"User click button login");
    }

    @Then("User get text title page dashboard")
    public void user_get_text_title_page_dashboard(){
        Hooks.delay(2);
        Assert.assertEquals(loginPage.getTxtDashboard(),"Dashboard");
        extentTest.log(LogStatus.PASS,"User get text title page dashboard");
    }

    @When("User enter invalid username")
    public void user_enter_invalid_username(){
        Hooks.delay(1);
        loginPage.logoutStaff();
        loginPage.logout();
        loginPage.enterUsername("D6220404");
        extentTest.log(LogStatus.PASS,"User enter invalid username");
    }

    @And("User enter invalid password")
    public void user_enter_invalid_password(){
        loginPage.enterPassword("fjdfjdhsjk");
        extentTest.log(LogStatus.PASS,"User enter invalid password");
    }

    @Then("User get text invalid credentials")
    public void user_get_text_invalid_credentials(){
        Hooks.delay(2);
        Assert.assertTrue(loginPage.getTxtInvalidCredentials().contains("Wrong username or password..!"));
        extentTest.log(LogStatus.PASS,"User get text invalid credentials");
    }
}