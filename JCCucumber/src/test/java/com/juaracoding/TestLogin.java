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

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User enter url DemoQA")
    public void User_enter_url_DemoQA() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User enter url DemoQA");
    }

    @When("User go to login")
    public void user_go_to_login() {
        driver.get("https://shop.demoqa.com/my-account/");
        loginPage.btnAccount();
        extentTest.log(LogStatus.PASS, "User go to login");
    }

    @And("User enter valid username")
    public void user_enter_valid_username() {
        driver.navigate().refresh();
        loginPage.enterUsername("fachrulaziz95");
        extentTest.log(LogStatus.PASS, "User enter valid username");
    }

    @And("User enter valid password")
    public void user_enter_valid_password() {
        loginPage.enterPassword("vegazr4362");
        extentTest.log(LogStatus.PASS, "User enter valid password");
    }

    @And("User click button login")
    public void user_click_button_login() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }

    @Then("User get text title page dashboard")
    public void user_get_text_title_page_dashboard(){
        Hooks.delay(1);
        Assert.assertEquals(loginPage.getTxtDashboard(),"MY ACCOUNT");
        extentTest.log(LogStatus.PASS,"User get text title page dashboard");
    }
}