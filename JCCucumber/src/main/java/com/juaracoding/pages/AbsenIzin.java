package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsenIzin {
    private WebDriver driver;
    public AbsenIzin(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Laporan Kegiatan']")
    WebElement clickLK;
    //
    @FindBy(xpath = "//a[normalize-space()='Absen Izin']")
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
    WebElement submitIzin;
    @FindBy(xpath = "//div[@class='panel-heading ui-sortable-handle']")
    WebElement confirmasi;
    @FindBy(xpath = "//input[@id='file']")
    WebElement invalidConfirmasiImageIzin;
    @FindBy(xpath = "//select[@id='divisi']")
    WebElement invalidConfirmasiDivisi;
    @FindBy(xpath = "//div[@class='panel-heading ui-sortable-handle']")
    WebElement getConfirmasiKeteranganIzin;

    public void clickLaporanKegiatanIzin(){
        delay(1);
        clickLK.click();
    }
    public void clickAbsenIzin(){
        clickAbsenM.click();
    }
    public void setImageIzin(String image){
        this.image.sendKeys(image);
    }
    public void selectDivisiIzin(String divisi){
        this.SDivisi.sendKeys(divisi);
    }
    public void SelectShiftIzin(){
        clickSelectShift.click();
    }
    public void SelectIzin(){
        SelectShift.click();
    }

    public void selectTipeAbsensiIzin(String tipeAbsensi){
        this.tipeAbsensi.sendKeys(tipeAbsensi);
    }
    public void setKolomIzin(String tipeAbsensi){
        this.kolomKeterangan.sendKeys(tipeAbsensi);
    }
    public void clickSubmitIzin(){
        submitIzin.click();
    }
    public String getConfirmasiIzin(){
        return confirmasi.getText();
    }
    public String getInformasiImageIzin(){
        return invalidConfirmasiImageIzin.getText();
    }
    public String getInformasiDivisiIzin(){
        return invalidConfirmasiDivisi.getText();
    }
    public String getConfirmasiKeteranganIzin(){
        return getConfirmasiKeteranganIzin.getText();
    }
    static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
