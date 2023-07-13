package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsenMasuk {
    private WebDriver driver;
    public AbsenMasuk(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Laporan Kegiatan']")
    WebElement clickLK;
    @FindBy(xpath = "//a[normalize-space()='Absen Masuk']")
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
    WebElement submit;
    @FindBy(xpath = "//div[@class='panel-heading ui-sortable-handle']")
    WebElement confirmasi;
    @FindBy(xpath = "//input[@id='file']")
    WebElement invalidConfirmasiImage;
    @FindBy(xpath = "//select[@id='divisi']")
    WebElement invalidConfirmasiDivisi;
    @FindBy(xpath = "//div[@class='panel-heading ui-sortable-handle']")
    WebElement getConfirmasiKeterangan;
//    @FindBy(xpath = "//input[@placeholder='NIK']")
//    WebElement username;
//    @FindBy(xpath = "//input[@placeholder='Password']")
//    WebElement password;
//    @FindBy(xpath = "//button[@type='submit']")
//    WebElement btnLogin;
//    @FindBy(xpath = "//h1[@class='page-header']")
//    WebElement txtDashboard;

    public void clickLaporanKegiatan(){
        delay(1);
        clickLK.click();
    }
    public void clickAbsenMasuk(){
        clickAbsenM.click();
    }
    public void setImage(String image){
        this.image.sendKeys(image);
    }
    public void selectDivisi(String divisi){
        this.SDivisi.sendKeys(divisi);
    }
    public void SelectShift(){
        clickSelectShift.click();
    }
    public void Select(){
        SelectShift.click();
    }

    public void selectTipeAbsensi(String tipeAbsensi){
        this.tipeAbsensi.sendKeys(tipeAbsensi);
    }
    public void setKolom(String tipeAbsensi){
        this.kolomKeterangan.sendKeys(tipeAbsensi);
    }
    public void clickSubmitt(){
        submit.click();
    }
    public String getConfirmasi(){
       return confirmasi.getText();
    }
    public String getInformasiImage(){
        return invalidConfirmasiImage.getText();
    }
    public String getInformasiDivisi(){
        return invalidConfirmasiDivisi.getText();
    }
    public String getConfirmasiKeterangan(){
        return getConfirmasiKeterangan.getText();
    }
//
//    public void login(String username, String password){
//        this.username.clear();
//        this.password.clear();
//        this.username.sendKeys(username);
//        this.password.sendKeys(password);
//        btnLogin.click();
//    }
//    public void enterUsername(String username){
//        this.username.sendKeys(username);
//    }
//
//    public void enterPassword(String password){
//        this.password.sendKeys(password);
//    }
//
//    public void clickBtnLogin(){
//        btnLogin.click();
//        delay(3);
//    }
//    public String getTxtDashboard(){
//        return txtDashboard.getText();
//    }
    static void delay(long detik){
        try {
            Thread.sleep(detik*1000); // delay 3 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
