package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsenSakit {
    private WebDriver driver;
    public AbsenSakit(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Laporan Kegiatan']")
    WebElement clickLK;
    //
    @FindBy(xpath = "//a[normalize-space()='Absen Sakit']")
    WebElement clickAbsenM;
    @FindBy(xpath = "//input[@id='file']")
    WebElement image;
    @FindBy(xpath = "//select[@id='divisi']")
    WebElement SDivisi;
    @FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/button/div/div/div")
    WebElement clickSelectShift;
    @FindBy(xpath = "//div[@id='content']//li[4]//a[1]")
    WebElement SelectShift;
    @FindBy(xpath = "//select[@id='absen_type']")
    WebElement tipeAbsensi;
    @FindBy(xpath = "//textarea[@name='keterangan']")
    WebElement kolomKeterangan;
    @FindBy(xpath = "//input[@value='Submit']")
    WebElement submitSakit;
    @FindBy(xpath = "//div[@class='panel-heading ui-sortable-handle']")
    WebElement confirmasi;
    @FindBy(xpath = "//input[@id='file']")
    WebElement invalidConfirmasiImageSakit;
    @FindBy(xpath = "//select[@id='divisi']")
    WebElement invalidConfirmasiDivisi;
    @FindBy(xpath = "//div[@class='panel-heading ui-sortable-handle']")
    WebElement getConfirmasiKeteranganSakit;

    public void clickLaporanKegiatanSakit(){
        delay(1);
        clickLK.click();
    }
    public void clickAbsenSakit(){
        clickAbsenM.click();
    }
    public void setImageSakit(String image){
        this.image.sendKeys(image);
    }
    public void selectDivisiSakit(String divisi){
        this.SDivisi.sendKeys(divisi);
    }
    public void SelectShiftSakit(){
        clickSelectShift.click();
    }
    public void SelectSakit(){
        SelectShift.click();
    }

    public void selectTipeAbsensiSakit(String tipeAbsensi){
        this.tipeAbsensi.sendKeys(tipeAbsensi);
    }
    public void setKolomSakit(String tipeAbsensi){
        this.kolomKeterangan.sendKeys(tipeAbsensi);
    }
    public void clickSubmitSakit(){
        submitSakit.click();
    }
    public String getConfirmasiSakit(){
        return confirmasi.getText();
    }
    public String getInformasiImageSakit(){
        return invalidConfirmasiImageSakit.getText();
    }
    public String getInformasiDivisiSakit(){
        return invalidConfirmasiDivisi.getText();
    }
    public String getConfirmasiKeteranganSakit(){
        return getConfirmasiKeteranganSakit.getText();
    }
    static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
