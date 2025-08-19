package Pages;

import Utilities.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HukukiKavramPage extends Base {

    By daireKapat = new By.ByXPath("//span[@class='p-menuitem-text'][text()='Daire Emsal Karar Önerisi']");
    By yimKapat = new By.ByXPath("//span[@class='p-menuitem-text'][text()='YİM Emsal Karar Önerisi']");
    By hukukiKavramMenu = new By.ByXPath("//span[@class='p-menuitem-text'][text()='Hukuki Kavramlar']");
    By hukukiKavramTumu = new By.ByXPath("//ul[@class='p-submenu-list p-panelmenu-root-submenu']//li[@class='p-menuitem font-medium'][4]//span[text()='Tümü']");
    By hukukiKavramBekleyenler = new By.ByXPath("//ul[@class='p-submenu-list p-panelmenu-root-submenu']//li[@class='p-menuitem font-medium'][4]//span[text()='Bekleyenler']");
    By hukukiKavramOnaylananlar = new By.ByXPath("//ul[@class='p-submenu-list p-panelmenu-root-submenu']//li[@class='p-menuitem font-medium'][4]//span[text()='Onaylananlar']");
    By hukukiKavramEkle = new By.ByXPath("//button[@aria-label='Yeni Hukuki Kavram Ekle']");
    By hukukiKavram = By.id("hukukiKavram");
    By aciklama = By.id("aciklama");
    By hKaydet = new By.ByXPath("//button[@aria-label='Kaydet ve Gönder']");
    By hukukiKavramFilter = new By.ByXPath("//tr//th[2]//input[@class='p-inputtext p-component p-column-filter']");
    By hukukiKavramAc = new By.ByXPath("//tr[@role='row'][@tabindex='0']");
    By hOnayla = new By.ByXPath("//span[@class='p-button-label p-c'][text()='Onayla']");
    By hKapat = new By.ByXPath("//span[@class='p-dialog-header-close-icon pi pi-times']");
    By hReddet = new By.ByXPath("//span[@class='p-dialog-header-close-icon pi pi-times']");

    public HukukiKavramPage(WebDriver driver) {
        super(driver);
    }
    public void daireKapat() {
        fluentWait(daireKapat);
        click(daireKapat);
    }
    public void yimKapat() {
        fluentWait(yimKapat);
        click(yimKapat);
    }
    public void clickHukukiKavramMenu() {
        fluentWait(hukukiKavramMenu);
        click(hukukiKavramMenu);
    }
    public void clickHukukiKavramTumu() {
        fluentWait(hukukiKavramTumu);
        click(hukukiKavramTumu);
    }
    public void clickHukukiKavramBekleyenler() {
        fluentWait(hukukiKavramBekleyenler);
        click(hukukiKavramBekleyenler);
    }
    public void clickHukukiKavramOnaylananlar() {
        fluentWait(hukukiKavramOnaylananlar);
        click(hukukiKavramOnaylananlar);
    }
    public void clickYeniHukukiKavramEkle(){
        fluentWait(hukukiKavramEkle);
        click(hukukiKavramEkle);
    }
    public void clickHukukiKavram(){
        fluentWait(hukukiKavram);
        click(hukukiKavram);
    }
    public void sendKeyHukukiKavram(String hukukiKavramNo){
        fluentWait(this.hukukiKavram);
        type(this.hukukiKavram, hukukiKavramNo);
    }
    public void clickAciklama(){
        fluentWait(aciklama);
        click(aciklama);
    }
    public void sendKeyAciklama(String aciklama){
        fluentWait(this.aciklama);
        type(this.aciklama, aciklama);
    }
    public void clickAKaydet (){
        fluentWait(hKaydet);
        click(hKaydet);
    }
    public void clickHukukiKavramFilter (){
        fluentWait(hukukiKavramFilter);
        click(hukukiKavramFilter);
    }
    public void sendKeyHukukiKavramFilter(String HukukiKavramFilter){
        fluentWait(this.hukukiKavramFilter);
        type(this.hukukiKavramFilter, HukukiKavramFilter);
    }
    public void clickHukukiKavramAc(){
        fluentWait(hukukiKavramAc);
        click(hukukiKavramAc);
    }
    public void clickOnayla(){
        fluentWait(hOnayla);
        click(hOnayla);
    }
    public void clickKapat(){
        fluentWait(hKapat);
        click(hKapat);
    }
    public void clickReddet(){
        fluentWait(hReddet);
        click(hReddet);
    }
}
