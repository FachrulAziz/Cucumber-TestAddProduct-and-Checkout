package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsenOff {
    private WebDriver driver;
    public AbsenOff(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Laporan Kegiatan']")
    WebElement clickLK;
    //
    @FindBy(xpath = "//a[normalize-space()='Absen Off']")
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
    WebElement submitOff;
    @FindBy(xpath = "//div[@class='panel-heading ui-sortable-handle']")
    WebElement confirmasi;
    @FindBy(xpath = "//input[@id='file']")
    WebElement invalidConfirmasiImageOff;
    @FindBy(xpath = "//select[@id='divisi']")
    WebElement invalidConfirmasiDivisi;
    @FindBy(xpath = "//div[@class='panel-heading ui-sortable-handle']")
    WebElement getConfirmasiKeteranganOff;

    public void clickLaporanKegiatanOff(){
        delay(1);
        clickLK.click();
    }
    public void clickAbsenOff(){
        clickAbsenM.click();
    }
    public void setImageOff(String image){
        this.image.sendKeys(image);
    }
    public void selectDivisiOff(String divisi){
        this.SDivisi.sendKeys(divisi);
    }
    public void SelectShiftOff(){
        clickSelectShift.click();
    }
    public void SelectOff(){
        SelectShift.click();
    }

    public void selectTipeAbsensiOff(String tipeAbsensi){
        this.tipeAbsensi.sendKeys(tipeAbsensi);
    }
    public void setKolomOff(String tipeAbsensi){
        this.kolomKeterangan.sendKeys(tipeAbsensi);
    }
    public void clickSubmitOff(){
        submitOff.click();
    }
    public String getConfirmasiOff(){
        return confirmasi.getText();
    }
    public String getInformasiImageOff(){
        return invalidConfirmasiImageOff.getText();
    }
    public String getInformasiDivisiOff(){
        return invalidConfirmasiDivisi.getText();
    }
    public String getConfirmasiKeteranganOff(){
        return getConfirmasiKeteranganOff.getText();
    }
    static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
