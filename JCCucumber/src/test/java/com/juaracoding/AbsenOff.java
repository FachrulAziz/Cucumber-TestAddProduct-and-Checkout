package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AbsenOff {

    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();
    static com.juaracoding.pages.AbsenOff absenOff = new com.juaracoding.pages.AbsenOff();

    public AbsenOff(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Klik menu Laporan Kegiatan Off")
    public void Klik_menu_Laporan_Kegiatan_Off(){
        absenOff.clickLaporanKegiatanOff();
        extentTest.log(LogStatus.PASS,"Klik menu Laporan Kegiatan Off");
    }
    @And("Klik Absen Off pada Collapse Laporan Kegiatan")
    public void Absen_Off_pada_Collapse_Laporan_Kegiatan(){
        absenOff.clickAbsenOff();
        extentTest.log(LogStatus.PASS,"Klik Absen Off pada Collapse Laporan Kegiatan");
    }
    @And("Unggah foto selfie Off")
    public void Unggah_foto_selfie_Off(){
        absenOff.setImageOff("C:\\Users\\ASUS\\Pictures\\Camera Roll\\fotis-fotopoulos-6sAl6aQ4OWI-unsplash.jpg");
        extentTest.log(LogStatus.PASS, "Unggah foto selfie Off");
    }

    @And("Dropdown Nama Shift Off")
    public void Dropdown_Nama_Shift_Off(){
        absenOff.SelectShiftOff();
        extentTest.log(LogStatus.PASS,"Dropdown Nama Shift Off");
    }
    @And("Pilih Shift Off")
    public void Pilih_Shift_Off(){
        absenOff.SelectOff();
        extentTest.log(LogStatus.PASS,"Pilih Shift Off");
    }
    @And("Dropdown Tipe Absen Off")
    public void Pilih_Tipe_Absen(){
        absenOff.selectTipeAbsensiOff("WFH (WORK FROM HOME)");
        extentTest.log(LogStatus.PASS,"Dropdown Tipe Absen Off");
    }
    @And("Kolom keterangan Off")
    public void Kolom_keterangan_Off() {
        absenOff.setKolomOff("he heee");
        extentTest.log(LogStatus.PASS, "Kolom keterangan Off");
    }
    @And("Submit Off")
    public void Submit_Off() {
        absenOff.clickSubmitOff();
        extentTest.log(LogStatus.PASS, "Submit Off");
    }
    @Then("get confirmasi Off")
    public void confirmasi_Off() {
        Hooks.delay(1);
        Assert.assertEquals(absenOff.getConfirmasiOff(), "Input Result");
        extentTest.log(LogStatus.PASS, "get confirmasi Off");
    }

    static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    static void scroll(int pixel){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+pixel+")"); //scroll down vertikal 500px
    }
}
