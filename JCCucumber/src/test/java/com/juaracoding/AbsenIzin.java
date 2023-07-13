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

public class AbsenIzin {

    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();
    static com.juaracoding.pages.AbsenIzin absenIzin = new com.juaracoding.pages.AbsenIzin();

    public AbsenIzin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Klik menu Laporan Kegiatan Izin")
    public void Klik_menu_Laporan_Kegiatan_Izin(){
        absenIzin.clickLaporanKegiatanIzin();
        extentTest.log(LogStatus.PASS,"Klik menu Laporan Kegiatan Izin");
    }
    @And("Klik Absen Izin pada Collapse Laporan Kegiatan")
    public void Absen_Izin_pada_Collapse_Laporan_Kegiatan(){
        absenIzin.clickAbsenIzin();
        extentTest.log(LogStatus.PASS,"Klik Absen Izin pada Collapse Laporan Kegiatan");
    }
    @And("Unggah foto selfie Izin")
    public void Unggah_foto_selfie_Izin(){
        absenIzin.setImageIzin("C:\\Users\\ASUS\\Pictures\\Camera Roll\\fotis-fotopoulos-6sAl6aQ4OWI-unsplash.jpg");
        extentTest.log(LogStatus.PASS, "Unggah foto selfie Izin");
    }
    @And("Dropdown Nama Shift Izin")
    public void Dropdown_Nama_Shift_Izin(){
        absenIzin.SelectShiftIzin();
        extentTest.log(LogStatus.PASS,"Dropdown Nama Shift Izin");
    }
    @And("Pilih Shift Izin")
    public void Pilih_Shift_Izin(){
        absenIzin.SelectIzin();
        extentTest.log(LogStatus.PASS,"Pilih Shift Izin");
    }
    @And("Dropdown Tipe Absen Izin")
    public void Pilih_Tipe_Absen(){
        absenIzin.selectTipeAbsensiIzin("WFH (WORK FROM HOME)");
        extentTest.log(LogStatus.PASS,"Dropdown Tipe Absen Izin");
    }
    @And("Kolom keterangan Izin")
    public void Kolom_keterangan_Izin() {
        absenIzin.setKolomIzin("he heee");
        extentTest.log(LogStatus.PASS, "Kolom keterangan Izin");
    }
    @And("Submit Izin")
    public void Submit_Izin() {
        absenIzin.clickSubmitIzin();
        extentTest.log(LogStatus.PASS, "Submit Izin");
    }
    @Then("get confirmasi Izin")
    public void confirmasi_Izin() {
        Hooks.delay(1);
        Assert.assertEquals(absenIzin.getConfirmasiIzin(), "Input Result");
        extentTest.log(LogStatus.PASS, "get confirmasi Izin");
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
