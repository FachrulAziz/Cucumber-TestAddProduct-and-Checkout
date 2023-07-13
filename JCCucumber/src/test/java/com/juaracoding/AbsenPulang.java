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

public class AbsenPulang {

    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();
    static com.juaracoding.pages.AbsenPulang absenPulang = new com.juaracoding.pages.AbsenPulang();

    public AbsenPulang(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Klik menu Laporan Kegiatan Pulang")
    public void Klik_menu_Laporan_Kegiatan_Pulang(){
        absenPulang.clickLaporanKegiatanPulang();
        extentTest.log(LogStatus.PASS,"Klik menu Laporan Kegiatan Pulang");
    }
    @And("Klik Absen Pulang pada Collapse Laporan Kegiatan")
    public void Absen_Pulang_pada_Collapse_Laporan_Kegiatan(){
        absenPulang.clickAbsenPulang();
        extentTest.log(LogStatus.PASS,"Klik Absen Pulang pada Collapse Laporan Kegiatan");
    }
    @And("Unggah foto selfie Pulang")
    public void Unggah_foto_selfie_Pulang(){
        absenPulang.setImagePulang("C:\\Users\\ASUS\\Pictures\\Camera Roll\\fotis-fotopoulos-6sAl6aQ4OWI-unsplash.jpg");
        extentTest.log(LogStatus.PASS, "Unggah foto selfie Pulang");
    }
    @And("field Divisi")
    public void field_Divisi(){
        delay(2);
        scroll(500);
        absenPulang.selectDivisiPulang("Attraction");
        extentTest.log(LogStatus.PASS, "field Divisi");
        delay(3);
    }
    @And("Dropdown Nama Shift pulang")
    public void Dropdown_Nama_Shift_Pulang(){
        absenPulang.SelectShiftPulang();
        extentTest.log(LogStatus.PASS,"Dropdown Nama Shift pulang");
    }
    @And("Pilih Shift pulang")
    public void Pilih_Shift_Pulang(){
        absenPulang.SelectPulang();
        extentTest.log(LogStatus.PASS,"Pilih Shift pulang");
    }
    @And("Dropdown Tipe Absen pulang")
    public void Pilih_Tipe_Absen(){
        absenPulang.selectTipeAbsensiPulang("WFH (WORK FROM HOME)");
        extentTest.log(LogStatus.PASS,"Dropdown Tipe Absen pulang");
    }
    @And("Kolom keterangan pulang")
    public void Kolom_keterangan_Pulang() {
        absenPulang.setKolomPulang("he heee");
        extentTest.log(LogStatus.PASS, "Kolom keterangan pulang");
    }
    @And("Submit pulang")
    public void Submit_Pulang() {
        absenPulang.clickSubmitPulang();
        extentTest.log(LogStatus.PASS, "Submit pulang");
    }
    @Then("get confirmasi pulang")
    public void confirmasi_Pulang() {
        Hooks.delay(1);
        Assert.assertEquals(absenPulang.getConfirmasiPulang(), "Input Result");
        extentTest.log(LogStatus.PASS, "get confirmasi pulang");
    }
    @Then("get confirmasi from Button Upload Image")
    public void Notifikasi_Button_Image() {
        Hooks.delay(1);
        Assert.assertFalse(absenPulang.getInformasiImagePulang().contains("Please select a file."));
        extentTest.log(LogStatus.PASS, "get confirmasi from Button Upload Image");
    }

    @Then("get confirmasi form Field Tipe Absen")
    public void confirmasi_Field_Tipe_Absen() {
        Hooks.delay(1);
        Assert.assertFalse(absenPulang.getInformasiImagePulang().contains("Please select a file."));
        extentTest.log(LogStatus.PASS, "get confirmasi form Field Tipe Absen");
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
