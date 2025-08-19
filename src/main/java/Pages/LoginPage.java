package Pages;

import Utilities.Base;
import Utilities.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

public class LoginPage extends Base {

    By username = By.id("username");
    By password = By.name("password");
    By girisYap = new By.ByXPath("//button[@class='giris-button giris-button-label']");
    By uyariTamam = new By.ByXPath("//button[@aria-label='Tamam']");
    By rolCombo = new By.ByXPath("//div[@id='varsayilanRol']//span[@class='p-dropdown-label p-inputtext']");
    By rolSec1 = new By.ByXPath("//li[@class='p-dropdown-item' and @aria-label='(YİM-1) Daire Sorumlu Hakimi']");
    By rolSec2 = new By.ByXPath("//li[@class='p-dropdown-item' and @aria-label='(YİM-2) Daire Sorumlu Üyesi']");
    By rolSec3 = new By.ByXPath("//li[@class='p-dropdown-item' and @aria-label='(YİM-3) Daire Başkanı']");
    By rolSec4 = new By.ByXPath("//li[@class='p-dropdown-item' and @aria-label='(YİM-4) YİM Kurulu Hakimi']");
    By rolSec5 = new By.ByXPath("//li[@class='p-dropdown-item' and @aria-label='(YİM-5) YİM Kurulu Üyesi']");
    By rolSec6 = new By.ByXPath("//li[@class='p-dropdown-item' and @aria-label='(YİM-6) Yayın Kurulu Başkanı']");
    By rolSec7 = new By.ByXPath("//li[@class='p-dropdown-item' and @aria-label='(YİM-Hakim) Dosyadan Sorumlu Hakim']");
    By rolSec8 = new By.ByXPath("//li[@class='p-dropdown-item' and @aria-label='(YİM-Arındırma Sorumlu) Veri Arındırma Sorumlusu']");
    By rolSec9 = new By.ByXPath("//li[@class='p-dropdown-item' and @aria-label='(YİM-Arındırma Hakim) Veri Arındırma Hakimi']");
    By rolSecAdmin = new By.ByXPath("//li[@class='p-dropdown-item' and @aria-label='Admin']");
    By logoutButton = new By.ByXPath("//span[@class='p-button-icon p-c pi pi-sign-out']");
    By kayitOl = new By.ByXPath("//button[@aria-label='Kayıt Ol']");
    By firmaAdi = By.id("ad");
    By firmaNo = By.id("firmaNo");
    By telefon = By.id("telefon");
    By ePosta = By.id("eposta");
    By adres = By.id("adres");
    By sifre = new By.ByXPath("//div[@id='sifre']//input[@type='password']");
    By sifreOnay = new By.ByXPath("//div[@id='sifreOnay']//input[@type='password']");
    By kvkkCheck = new By.ByXPath("//div[@class='p-checkbox-box']");
    By kvkkOnay = new By.ByXPath("//button[@aria-label='Onaylıyorum']");
    By kaydet = new By.ByXPath("//button[@aria-label='Kaydet']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickUsername() {
        fluentWait(username);
        click(username);
    }
    public void sendKeyUsername(String username) {
        fluentWait(this.username);
        type(this.username, username);
    }
    public void clickPassword() {
        fluentWait(password);
        click(password);
    }
    public void sendKeyPassword(String password) {
        fluentWait(this.password);
        type(this.password, password);
    }
    public void clickGirisButton() {
        fluentWait(this.girisYap);
        click(girisYap);
    }
    public void uyariKontrol(){
        if(checkElementExisting(uyariTamam))
            clickUyariTamam();
        else
            System.out.println("Uyarı Yok");
    }
    public void clickUyariTamam() {
        fluentWait(uyariTamam);
        click(uyariTamam);
    }
    public void rolSec1() {
        fluentWait(rolCombo);
        click(rolCombo);
        click(rolSec1);
    }
    public void rolSec2() {
        fluentWait(rolCombo);
        click(rolCombo);
        click(rolSec2);
    }
    public void rolSec3() {
        fluentWait(rolCombo);
        click(rolCombo);
        click(rolSec3);
    }
    public void rolSec4() {
        fluentWait(rolCombo);
        click(rolCombo);
        click(rolSec4);
    }
    public void rolSec5() {
        fluentWait(rolCombo);
        click(rolCombo);
        click(rolSec5);
    }
    public void rolSec6() {
        fluentWait(rolCombo);
        click(rolCombo);
        click(rolSec6);
    }
    public void rolSec7() {
        fluentWait(rolCombo);
        click(rolCombo);
        click(rolSec7);
    }
    public void rolSec8() {
        fluentWait(rolCombo);
        click(rolCombo);
        click(rolSec8);
    }
    public void rolSec9() {
        fluentWait(rolCombo);
        click(rolCombo);
        click(rolSec9);
    }
    public void rolSecAdmin() {
        fluentWait(rolCombo);
        click(rolCombo);
        click(rolSecAdmin);
    }
    public void clickKayitOlButton(){
        fluentWait(kayitOl);
        click(kayitOl);
    }
    public void clickFirmaAdi() {
        fluentWait(firmaAdi);
        click(firmaAdi);
    }
    public void sendKeyFirmaAdi(String firmaAdi) {
        fluentWait(this.firmaAdi);
        type(this.firmaAdi, firmaAdi);
    }
    public void clickFirmaNo() {
        fluentWait(firmaNo);
        click(firmaNo);
    }
    public void sendKeyFirmaNo(String firmaNo) {
        fluentWait(this.firmaNo);
        type(this.firmaNo, firmaNo);
    }
    public void clickTelefon() {
        fluentWait(telefon);
        click(telefon);
    }
    public void sendKeyTelefon (String telefon) {
        fluentWait(this.telefon);
        type(this.telefon, telefon);
    }
    public void clickEposta() {
        fluentWait(ePosta);
        click(ePosta);
    }
    public void sendKeyEposta (String ePosta) {
        fluentWait(this.ePosta);
        type(this.ePosta, ePosta);
    }
    public void clickAdres() {
        fluentWait(adres);
        click(adres);
    }
    public void sendKeyAdres (String adres) {
        fluentWait(this.adres);
        type(this.adres, adres);
    }
    public void clickSifre() {
        fluentWait(sifre);
        click(sifre);
    }
    public void sendKeySifre (String sifre) {
        fluentWait(this.sifre);
        type(this.sifre, sifre);
    }
    public void clickSifreOnay() {
        fluentWait(sifreOnay);
        click(sifreOnay);
    }
    public void sendKeySifreOnay (String sifreOnay) {
        fluentWait(this.sifreOnay);
        type(this.sifreOnay, sifreOnay);
    }
    public void clickKvkkCheck() {
        fluentWait(kvkkCheck);
        click(kvkkCheck);
    }
    public void clickKvkkOnay() {
        fluentWait(kvkkOnay);
        click(kvkkOnay);
    }
    public void clickKaydet() {
        fluentWait(kaydet);
        click(kaydet);
    }
    public void clickLogout(){
        fluentWait(logoutButton);
        click(logoutButton);
    }
}
