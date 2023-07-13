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

public class AbsenSakit {

    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();
    static com.juaracoding.pages.AbsenSakit absenSakit = new com.juaracoding.pages.AbsenSakit();

    public AbsenSakit(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Klik menu Laporan Kegiatan Sakit")
    public void Klik_menu_Laporan_Kegiatan_Sakit(){
        absenSakit.clickLaporanKegiatanSakit();
        extentTest.log(LogStatus.PASS,"Klik menu Laporan Kegiatan Sakit");
    }
    @And("Klik Absen Sakit pada Collapse Laporan Kegiatan")
    public void Absen_Sakit_pada_Collapse_Laporan_Kegiatan(){
        absenSakit.clickAbsenSakit();
        extentTest.log(LogStatus.PASS,"Klik Absen Sakit pada Collapse Laporan Kegiatan");
    }
    @And("Unggah foto selfie Sakit")
    public void Unggah_foto_selfie_Sakit(){
        absenSakit.setImageSakit("C:\\Users\\ASUS\\Pictures\\Camera Roll\\fotis-fotopoulos-6sAl6aQ4OWI-unsplash.jpg");
        extentTest.log(LogStatus.PASS, "Unggah foto selfie Sakit");
    }
    @And("Dropdown Nama Shift Sakit")
    public void Dropdown_Nama_Shift_Sakit(){
        absenSakit.SelectShiftSakit();
        extentTest.log(LogStatus.PASS,"Dropdown Nama Shift Sakit");
    }
    @And("Pilih Shift Sakit")
    public void Pilih_Shift_Sakit(){
        absenSakit.SelectSakit();
        extentTest.log(LogStatus.PASS,"Pilih Shift Sakit");
    }
    @And("Dropdown Tipe Absen Sakit")
    public void Pilih_Tipe_Absen(){
        absenSakit.selectTipeAbsensiSakit("WFH (WORK FROM HOME)");
        extentTest.log(LogStatus.PASS,"Dropdown Tipe Absen Sakit");
    }
    @And("Kolom keterangan Sakit")
    public void Kolom_keterangan_Sakit() {
        absenSakit.setKolomSakit("he heee");
        extentTest.log(LogStatus.PASS, "Kolom keterangan Sakit");
    }
    @And("Submit Sakit")
    public void Submit_Sakit() {
        absenSakit.clickSubmitSakit();
        extentTest.log(LogStatus.PASS, "Submit Sakit");
    }
    @Then("get confirmasi Sakit")
    public void confirmasi_Sakit() {
        Hooks.delay(1);
        Assert.assertEquals(absenSakit.getConfirmasiSakit(), "Input Result");
        extentTest.log(LogStatus.PASS, "get confirmasi Sakit");
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
