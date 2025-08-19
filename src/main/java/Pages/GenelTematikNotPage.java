package Pages;

import Utilities.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenelTematikNotPage extends Base {

    By gTematikNotMenu = new By.ByXPath("//ul[@class='p-submenu-list p-panelmenu-root-submenu']//li[@class='p-menuitem font-medium'][3]");
    By gtematikNotTumu = new By.ByXPath("//ul[@class='p-submenu-list p-panelmenu-root-submenu']//li[@class='p-menuitem font-medium'][3]//span[text()='Tümü']");
    By gtematikNotBekleyenler = new By.ByXPath("//ul[@class='p-submenu-list p-panelmenu-root-submenu']//li[@class='p-menuitem font-medium'][3]//span[text()='Bekleyenler']");
    By yeniGenelTematikNotEkle = new By.ByXPath("//button[@aria-label=\"Yeni Tematik Bilgi Notu Ekle\"]");
    By kavram = By.id("kavram");
    By mevzuat = By.id("mevzuat");
    By basTarih = By.id("basTarih");
    By basTarihSec = new By.ByXPath("//td[@class='p-datepicker-today']");
    By konusu = By.id("konusu");
    By gTematikNot = new By.ByXPath("//div[@class='ql-editor ql-blank']");
    By halkaAcik = By.id("halkaSAcik");
    By uyariOnay = new By.ByXPath("//button[@aria-label='Onayla']");
    By sabitlensinmi = By.id("sabitMi");
    By gKaydet = new By.ByXPath("//button[@aria-label='Kaydet']");
    By gKaydetVeGonder = new By.ByXPath("//button[@aria-label='Kaydet ve Gönder']");
    By ekranKapat = new By.ByXPath("//button[@class='p-dialog-header-icon p-dialog-header-close p-link']");
    By kavramFilter = new By.ByXPath("//div[@class='grid text-left']//div[@class='col-4'][1]//input[@class='p-inputtext p-component w-full']");
    By araButton = new By.ByXPath("//button[@aria-label='Ara']");
    By tematikNotAc = new By.ByXPath("//tr[@role='row'][@tabindex='0']");
    By gOnayla = new By.ByXPath("//span[@class='p-button-label p-c'][text()='Onayla']");

    public GenelTematikNotPage(WebDriver driver) {
        super(driver);
    }
    public void clickGtematikNotMenu() {
        fluentWait(gTematikNotMenu);
        click(gTematikNotMenu);
    }
    public void clickGtematikNotTumu() {
        fluentWait(gtematikNotTumu);
        click(gtematikNotTumu);
    }
    public void clickGtematikNotBekleyenler() {
        fluentWait(gtematikNotBekleyenler);
        click(gtematikNotBekleyenler);
    }
    public void clickYeniGenelTematikNotEkle(){
        fluentWait(yeniGenelTematikNotEkle);
        click(yeniGenelTematikNotEkle);
    }
    public void clickKavram(){
        fluentWait(kavram);
        click(kavram);
    }
    public void sendKeyKavram(String kavram){
        fluentWait(this.kavram);
        type(this.kavram, kavram);
    }
    public void clickMevzuat(){
        fluentWait(mevzuat);
        click(mevzuat);
    }
    public void sendKeyMevzuat(String mevzuat){
        fluentWait(this.mevzuat);
        type(this.mevzuat, mevzuat);
    }
    public void tarihSec(){
        fluentWait(basTarih);
        click(basTarih);
        fluentWait(basTarihSec);
        click(basTarihSec);
    }
    public void clickKonusu(){
        fluentWait(konusu);
        click(konusu);
    }
    public void sendKeyKonusu(String konusu){
        fluentWait(this.konusu);
        type(this.konusu, konusu);
    }
    public void clickGenelTematikNot(){
        fluentWait(gTematikNot);
        click(gTematikNot);
    }
    public void sendKeyGenelTematikNot(String gTematikNot){
        fluentWait(this.gTematikNot);
        type(this.gTematikNot, gTematikNot);
    }
    public void clickHalkaAcik (){
        fluentWait(halkaAcik);
        click(halkaAcik);
    }
    public void clickUyariOnay (){
        fluentWait(uyariOnay);
        click(uyariOnay);
    }
    public void clickSabitlensinMi (){
        fluentWait(sabitlensinmi);
        click(sabitlensinmi);
    }
    public void clickGKaydet (){
        fluentWait(gKaydet);
        click(gKaydet);
    }
    public void clickKaydetVeGonder (){
        fluentWait(gKaydetVeGonder);
        click(gKaydetVeGonder);
    }
    public void clickKapat (){
        fluentWait(ekranKapat);
        click(ekranKapat);
    }
    public void clickKavramFilter (){
        fluentWait(kavramFilter);
        click(kavramFilter);
    }
    public void sendKeyKavramFilter(String kavram){
        fluentWait(this.kavramFilter);
        type(this.kavramFilter, kavram);
    }
    public void clickAra(){
        fluentWait(araButton);
        click(araButton);
    }
    public void clickTematikNotAc(){
        fluentWait(tematikNotAc);
        click(tematikNotAc);
    }
    public void clickOnayla(){
        fluentWait(gOnayla);
        click(gOnayla);
    }
}