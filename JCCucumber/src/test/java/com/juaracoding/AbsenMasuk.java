package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AbsenMasuk {

    static WebDriver driver;
    static ExtentTest extentTest;
    static  LoginPage loginPage = new LoginPage();
    static com.juaracoding.pages.AbsenMasuk absenMasuk = new com.juaracoding.pages.AbsenMasuk();

    public AbsenMasuk(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("Klik menu Laporan Kegiatan")
    public void Klik_menu_Laporan_Kegiatan(){
        absenMasuk.clickLaporanKegiatan();
        extentTest.log(LogStatus.PASS,"Klik menu Laporan Kegiatan");
    }
    @And("Klik Absen Masuk pada Collapse Laporan Kegiatan")
    public void Klik_Absen_Masuk_pada_Collapse_Laporan_Kegiatan(){
        absenMasuk.clickAbsenMasuk();
        extentTest.log(LogStatus.PASS,"Klik Absen Masuk pada Collapse Laporan Kegiatan");
    }
    @And("Unggah foto selfie")
    public void Unggah_foto_selfie(){
        absenMasuk.setImage("C:\\Users\\ASUS\\Pictures\\Camera Roll\\fotis-fotopoulos-6sAl6aQ4OWI-unsplash.jpg");
        extentTest.log(LogStatus.PASS, "Unggah foto selfie");
    }
    @And("Pada field Divisi dropdown pilih Attraction")
    public void Pada_field_Divisi_dropdown_pilih_Attraction(){
        delay(2);
        scroll(500);
        absenMasuk.selectDivisi("Attraction");
        extentTest.log(LogStatus.PASS, "Pada field Divisi dropdown pilih Attraction");
        delay(3);
    }
    @And("Dropdown Nama Shift")
    public void Dropdown_Nama_Shift(){
        absenMasuk.SelectShift();
        extentTest.log(LogStatus.PASS,"Dropdown Nama Shift");
    }
    @And("Pilih Shift")
    public void Pilih_Shift(){
        absenMasuk.Select();
        extentTest.log(LogStatus.PASS,"Pilih Shift");
    }
    @And("Dropdown Tipe Absen")
    public void Dropdown_Tipe_Absen(){
        absenMasuk.selectTipeAbsensi("WFH (WORK FROM HOME)");
        extentTest.log(LogStatus.PASS,"Dropdown Tipe Absen");
    }
    @And("Kolom keterangan")
    public void Kolom_keterangan() {
        absenMasuk.setKolom("hehe");
        extentTest.log(LogStatus.PASS, "Kolom keterangan");
    }
    @And("Submit")
    public void Submit() {
        absenMasuk.clickSubmitt();
        extentTest.log(LogStatus.PASS, "Submit");
    }
    @Then("get confirmasi")
    public void confirmasi() {
        Hooks.delay(1);
        Assert.assertEquals(absenMasuk.getConfirmasi(), "Input Result");
        extentTest.log(LogStatus.PASS, "get confirmasi");
    }

    /* Input Absen Masuk tanpa Upload Foto Selfie */
    @And("Foto Selfie tidak di isi")
    public void Foto_Selfie_tidak_di_isi(){
        extentTest.log(LogStatus.PASS, "Foto Selfie tidak di isi");
    }

    /* Input Absen Masuk tanpa pilih Divisi */
    @And("Field Divisi tidak di pilih")
    public void Field_Divisi_tidak_di_pilih(){
        extentTest.log(LogStatus.PASS, "Field Divisi tidak di pilih");
    }
    @And("Field Nama Shift dropdown tidak bisa di isi")
    public void Field_Shift_tidak_di_pilih(){
        extentTest.log(LogStatus.PASS, "Field Nama Shift dropdown tidak bisa di isi");
    }

    @Then("get confirmasi form Field Divisi")
    public void confirmasi_Field_Divisi() {
        Hooks.delay(1);
        Assert.assertFalse(absenMasuk.getInformasiImage().contains("Please select a file."));
        extentTest.log(LogStatus.PASS, "get confirmasi form Field Divisi");
    }

    /* Input Absen Masuk tanpa pilih Nama Shift */
    @And("Field Nama Shift tidak di pilih")
    public void Field_Nama_Shift_tidak_di_pilih(){
        extentTest.log(LogStatus.PASS, "Field Nama Shift tidak di pilih");
    }
    @Then("get confirmasi form Field Shift")
    public void confirmasi_Field_Shift() {
        Hooks.delay(1);
        Assert.assertFalse(absenMasuk.getInformasiImage().contains("Please select a file."));
        extentTest.log(LogStatus.PASS, "get confirmasi form Field Shift");
    }

    /* Input Absen Masuk tanpa pilih Tipe Absen */
    @And("Field Tipe Absen tidak di pilih")
    public void Field_Tipe_Absen_tidak_di_pilih(){
        extentTest.log(LogStatus.PASS, "Field Tipe Absen tidak di pilih");
    }
    /* Input Absen Masuk tanpa isi keterangan */
    @And("Kolom keterangan di kosongkan")
    public void Kolom_keterangan_di_kosongkan(){
        extentTest.log(LogStatus.PASS, "Kolom keterangan di kosongkan");
    }
    @Then("get confirmasi form Field keterangan")
    public void confirmasi_keterangan() {
        Hooks.delay(1);
        Assert.assertEquals(absenMasuk.getConfirmasiKeterangan(), "Input Result");
        extentTest.log(LogStatus.PASS, "get confirmasi form Field keterangan");
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
