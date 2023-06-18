package com.juaracoding;

import com.juaracoding.pages.CheckOut;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCheckOut {
    static WebDriver driver;
    static ExtentTest extentTest;
    static CheckOut checkOut = new CheckOut();

    public TestCheckOut() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("User click view cart")
    public void User_click_view_cart(){
        checkOut.clickBtnCart();
        extentTest.log(LogStatus.PASS, "User click view cart");
    }
    @And("User click proses checkOut")
    public void User_click_proses_checkOut(){
        checkOut.clickBtnProses();
        extentTest.log(LogStatus.PASS, "User click proses checkOut");
    }
    @And("User input first name")
    public void User_input_first_name(){
        checkOut.enterFirstName("Fachrul");
        extentTest.log(LogStatus.PASS, "User input first name");
    }
    @And("User input last name")
    public void User_input_last_name(){
        checkOut.enterLastName("Aziz");
        extentTest.log(LogStatus.PASS, "User input last name");
    }
    @And("User input company name")
    public void User_input_company_name(){
        checkOut.enterInputCompany("Juara Coding");
        extentTest.log(LogStatus.PASS, "User input company name");
    }
    @And("User select country")
    public void User_select_country(){
        checkOut.enterSelectCountry("Indonesia");
        extentTest.log(LogStatus.PASS, "User select country");
    }
    @And("User input street addres")
    public void User_input_street_addres(){
        checkOut.SelectinputAddres("Kec.Solear");
        extentTest.log(LogStatus.PASS, "User input street addres");
    }
    @And("User input city")
    public void User_input_city(){
        checkOut.selectInputCity("Kab.Tangerang");
        extentTest.log(LogStatus.PASS, "User input city");
    }
    @And("User select province")
    public void User_select_province(){
        checkOut.SelectInputProvince("Banten");
        extentTest.log(LogStatus.PASS, "User select province");
    }
    @And("User input postCode")
    public void User_input_postCode(){
        checkOut.InsertInputPostCode("15743");
        extentTest.log(LogStatus.PASS, "User input postCode");
    }
    @And("User input phone number")
    public void User_input_phone_number(){
        checkOut.insertPhoneNumber("+62123123123");
        extentTest.log(LogStatus.PASS, "User input phone number");
    }
    @And("User input email addres")
    public void User_input_email_addres(){
        checkOut.inputEmailAddres("fachrulaziz40@gmail.com");
        extentTest.log(LogStatus.PASS, "User input email addres");
    }
    @And("User clik checkBox")
    public void User_clik_checkBox(){
        checkOut.clickBtnCek();
        extentTest.log(LogStatus.PASS, "User clik checkBox");
    }
    @And("User click button order")
    public void User_click_button_order(){
        checkOut.clickBtnOrder();
        extentTest.log(LogStatus.PASS, "User click button order");
    }
    @Then("User get text title checkout")
    public void User_get_text_title_checkout(){
        Hooks.delay(1);
        Assert.assertEquals(checkOut.getTxtDashboard(),"CHECKOUT");
        extentTest.log(LogStatus.PASS,"User get text title checkout");
    }
}
