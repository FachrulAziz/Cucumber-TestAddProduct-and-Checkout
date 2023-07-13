package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsenPulang {
    private WebDriver driver;
    public AbsenPulang(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Laporan Kegiatan']")
    WebElement clickLK;
    //
    @FindBy(xpath = "//a[normalize-space()='Absen Pulang']")
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
    WebElement submitPulang;
    @FindBy(xpath = "//div[@class='panel-heading ui-sortable-handle']")
    WebElement confirmasi;
    @FindBy(xpath = "//input[@id='file']")
    WebElement invalidConfirmasiImagePulang;
    @FindBy(xpath = "//select[@id='divisi']")
    WebElement invalidConfirmasiDivisi;
    @FindBy(xpath = "//div[@class='panel-heading ui-sortable-handle']")
    WebElement getConfirmasiKeteranganPulang;

    public void clickLaporanKegiatanPulang(){
        delay(1);
        clickLK.click();
    }
    public void clickAbsenPulang(){
        clickAbsenM.click();
    }
    public void setImagePulang(String image){
        this.image.sendKeys(image);
    }
    public void selectDivisiPulang(String divisi){
        this.SDivisi.sendKeys(divisi);
    }
    public void SelectShiftPulang(){
        clickSelectShift.click();
    }
    public void SelectPulang(){
        SelectShift.click();
    }

    public void selectTipeAbsensiPulang(String tipeAbsensi){
        this.tipeAbsensi.sendKeys(tipeAbsensi);
    }
    public void setKolomPulang(String tipeAbsensi){
        this.kolomKeterangan.sendKeys(tipeAbsensi);
    }
    public void clickSubmitPulang(){
        submitPulang.click();
    }
    public String getConfirmasiPulang(){
        return confirmasi.getText();
    }
    public String getInformasiImagePulang(){
        return invalidConfirmasiImagePulang.getText();
    }
    public String getInformasiDivisiPulang(){
        return invalidConfirmasiDivisi.getText();
    }
    public String getConfirmasiKeteranganPulang(){
        return getConfirmasiKeteranganPulang.getText();
    }
    static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
