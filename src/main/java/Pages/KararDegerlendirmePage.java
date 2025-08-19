package Pages;

import Utilities.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ByChained;

public class KararDegerlendirmePage extends Base{

    By kararAc = new By.ByXPath("//tr[@role='row'][@tabindex='0']");
    By yimKararAc = new By.ByXPath("//tr[@role='row'][1]//td[5]");
    By incelemeyeAl = new By.ByXPath("//span[text()='İncelemeye Al']");
    By incelemeyiBirak = new By.ByXPath("//span[@class='p-button-label p-c'][text()='İncelemeyi Bırak']");
    By emsalDegil = By.id("emsalMi");
    By sureceDahilEt = new By.ByXPath("//button[@aria-label='Sürece Dahil Et']");
    By arsiveGonder = new By.ByXPath("//button[@aria-label='Arşive Gönder']");
    By arsivGerekce = new By.ByXPath("//div[@class='col-12 md:col-8']//textarea[@id='aciklama']");
    By gonderButton = new By.ByXPath("//button[@aria-label='Gönder']");
    By uyariEvet = new By.ByXPath("//button[@aria-label='Evet']");

    By onaylayacakKullaniciClick = By.id("kullanici");
    By onaylayacakKullaniciSec = new By.ByXPath("//li[@class='p-dropdown-item'][@aria-label='Test Otomasyonu']");

    By onemDuzeyiClick = new By.ByXPath("//div[@id='onemDUzeyi']//div[@class='p-dropdown-trigger']");
    By onemDuzeyiSec = new By.ByXPath("//li[@class='p-dropdown-item'][@aria-label='1 - Düşük']");

    By onemGerekcesiClick = new By.ByXPath("//div[@id='onemGerekcesi']//div[@class='p-dropdown-trigger']");
    By onemGerekcesiSec = new By.ByXPath("//li[@class='p-dropdown-item'][@aria-label='Hukuka katkısı düşük olan']");

    By ozetBilgileriButton = new By.ByXPath("//button[@aria-label='Özet Bilgileri']");
    By ozet1editor = By.id("dataFrame");
    By ozet1getir = new By.ByXPath("//div[@class='col-5']//div[@class='p-panel p-component'][1]//div[@class='card p-1']//button[@class='brain-button ml-1 tooltip']");
    By ozet1aktar = new By.ByXPath("//div[@class='col-5']//div[@class='p-panel p-component'][1]//div[@class='card p-1']//button[@class='p-button p-component p-button-lg p-button-success ml-1 p-button-icon-only']");
    By ozet2editor= By.id("t5");
    By ozet2getir = new By.ByXPath("//div[@class='col-5']//div[@class='p-panel p-component'][2]//div[@class='card p-1']//button[@class='brain-button ml-1 tooltip']");
    By gecerliOzet = new By.ByXPath("//div[@class='p-panel-content']//div[@class='ql-editor ql-blank']");
    By aktarButton = new By.ByXPath("//span[@class='p-button-label p-c'][text()='Aktar']");

    By hukukiKavramClick = new By.ByXPath("//div[@class='p-multiselect-label p-placeholder'][text()='Hukuki Kavram Seçiniz']");
    By hukukiKavramSec = new By.ByXPath("//span[text()='Acente']");
    By hukukiKavramKapat = new By.ByXPath("//button[@type='button' and @class='p-multiselect-close p-link']");

    By hukukiKonuClick = new By.ByXPath("//div[@class='p-multiselect-label p-placeholder'][text()='Hukuki Konu Seçiniz']");
    By hukukiKonuSec = new By.ByXPath("//span[text()='Acil Ve Zorunlu Onarım']");
    By hukukiKonuKapat = new By.ByXPath("//button[@type='button' and @class='p-multiselect-close p-link']");

    By anahtarKelimeClick = new By.ByXPath("//div[@class='p-multiselect-label p-placeholder'][text()='Anahtar Kelime Seçiniz']");
    By anahtarKelimeSec = new By.ByXPath("//span[text()='Adam Öldürme']");
    By anahtarKelimeKapat = new By.ByXPath("//button[@type='button' and @class='p-multiselect-close p-link']");

    By mevzuatTuruClick = new By.ByXPath("//div[@id='kanunTuru']//div[@class='p-dropdown-trigger']");
    By mevzuatTuruSec = new By.ByXPath("//li[@aria-label='Kanunlar']");

    By mevzuatClick = new By.ByXPath("//span[text()='Mevzuat Seçin']");
    By mevzuatSec = new By.ByXPath("//div[text()='195-BASIN İLAN KURUMU TEŞKİLİNE DAİR KANUN']");
    By maddeText = By.id("kanunMadde");
    By fikraText = By.id("kanunFikra");
    By bendText = By.id("kanunBend");
    By ekleButton = new By.ByXPath("//div[@class='col-12 md:col-10 ']//span[@class='p-button-icon p-c pi pi-plus']");

    By not = By.id("aciklama");

    By kaydetButton = new By.ByXPath("//span[@class='p-button-label p-c'][text()='Kaydet']");
    By kayitOnayla = new By.ByXPath("//div[@class='p-dialog-footer']//button[@class='p-button p-component p-confirm-dialog-accept']");

    By onayla = new By.ByXPath("//span[@class='p-button-label p-c'][text()='Onayla']");
    By onaylaEvet = new By.ByXPath("//span[@class='p-button-label p-c'][text()='Evet']");

    public KararDegerlendirmePage(WebDriver driver) {
        super(driver);
    }
    public void clickKararAc(){
        fluentWait(kararAc);
        click(kararAc);
    }
    public void clickYimKararAc(){
        fluentWait(yimKararAc);
        click(yimKararAc);
    }
    public void clickIncelemeyeAl(){
        fluentWait(incelemeyeAl);
        waitProcess(1000);
        click(incelemeyeAl);
    }
    public void clickIncelemeyiBirak(){
        fluentWait(incelemeyiBirak);
        click(incelemeyiBirak);
    }
    public void onaylayacakKisiSec(){
        fluentWait(onaylayacakKullaniciClick);
        click(onaylayacakKullaniciClick);
        fluentWait(onaylayacakKullaniciSec);
        click(onaylayacakKullaniciSec);
    }
    public void onemDuzeyiSec(){
        fluentWait(onemDuzeyiClick);
        click(onemDuzeyiClick);
        fluentWait(onemDuzeyiSec);
        click(onemDuzeyiSec);
    }
    public void onemGerekcesiSec(){
        fluentWait(onemGerekcesiClick);
        click(onemGerekcesiClick);
        fluentWait(onemGerekcesiSec);
        click(onemGerekcesiSec);
    }
    public void clickOzetBilgileriButton(){
        fluentWait(ozetBilgileriButton);
        click(ozetBilgileriButton);
    }
    public void ozet1kontrol() {
      fluentWait(ozet1editor);
      getText(ozet1editor);
      if (ozet1editor.equals(""))
          click(ozet1getir);
      else
          click(ozet1aktar);
    }
    public void clickOzet1Getir(){
        fluentWait(ozet1getir);
        click(ozet1getir);
    }
    public void clickGecerliOzet() {
        fluentWait(gecerliOzet);
        click(gecerliOzet);
    }
    public void sendKeyGecerliOzet(String ozet){
        fluentWait(this.gecerliOzet);
        type(this.gecerliOzet, ozet);
    }
    public void clickAktarButton() {
        fluentWait(aktarButton);
        click(aktarButton);
    }
    public void hukukiKavramSec(){
        fluentWait(hukukiKavramClick);
        click(hukukiKavramClick);
        fluentWait(hukukiKavramSec);
        click(hukukiKavramSec);
        waitProcess();
        fluentWait(hukukiKavramKapat);
        click(hukukiKavramKapat);
    }
    public void hukukiKonuSec(){
        fluentWait(hukukiKonuClick);
        click(hukukiKonuClick);
        fluentWait(hukukiKonuSec);
        click(hukukiKonuSec);
        fluentWait(hukukiKonuKapat);
        click(hukukiKonuKapat);
    }
    public void anahtarKelimeSec(){
        fluentWait(anahtarKelimeClick);
        click(anahtarKelimeClick);
        fluentWait(anahtarKelimeSec);
        click(anahtarKelimeSec);
        fluentWait(anahtarKelimeKapat);
        click(anahtarKelimeKapat);
    }
    public void mevzuatTuruSec(){
        fluentWait(mevzuatTuruClick);
        click(mevzuatTuruClick);
        fluentWait(mevzuatTuruSec);
        click(mevzuatTuruSec);
    }
    public void mevzuatSec(){
        fluentWait(mevzuatClick);
        click(mevzuatClick);
        fluentWait(mevzuatSec);
        click(mevzuatSec);
    }
    public void clickMaddeText(){
        fluentWait(maddeText);
        click(maddeText);
    }
    public void sendKeyMaddeText(String maddeText){
        fluentWait(this.maddeText);
        type(this.maddeText, maddeText);
    }
    public void clickFikraText(){
        fluentWait(fikraText);
        click(fikraText);
    }
    public void sendKeyFikraText(String fikraText){
        fluentWait(this.fikraText);
        type(this.fikraText, fikraText);
    }
    public void clickBendText(){
        fluentWait(bendText);
        click(bendText);
    }
    public void sendKeyBendText(String bendText){
        fluentWait(this.bendText);
        type(this.bendText, bendText);
    }
    public void clickEkleButton(){
        fluentWait(ekleButton);
        click(ekleButton);
    }
    public void clickNot() {
        fluentWait(not);
        click(not);
    }
    public void sendKeyNot(String not){
        fluentWait(this.not);
        type(this.not, not);
    }
    public void clickEmsalDegil() {
        fluentWait(emsalDegil);
        click(emsalDegil);
    }
    public void clickKaydet() {
        fluentWait(kaydetButton);
        click(kaydetButton);
    }
    public void clickKayitOnayla() {
        fluentWait(kayitOnayla);
        click(kayitOnayla);
    }
    public void clickOnayla(){
        fluentWait(onayla);
        click(onayla);
    }
    public void clickOnaylaEvet(){
        fluentWait(onaylaEvet);
        click(onaylaEvet);
    }
    public void clickSureceDahilEt(){
        fluentWait(sureceDahilEt);
        click(sureceDahilEt);
    }
    public void clickArsiveGonder(){
        fluentWait(arsiveGonder);
        click(arsiveGonder);
    }
    public void clickArsivGerekce(){
        fluentWait(arsivGerekce);
        click(arsivGerekce);
    }
    public void sendKeyArsivGerekce(String gerekce){
        fluentWait(this.arsivGerekce);
        type(this.arsivGerekce, gerekce);
    }
    public void clickGonder(){
        fluentWait(gonderButton);
        click(gonderButton);
    }
    public void clickArsivEvet(){
        fluentWait(uyariEvet);
        click(uyariEvet);
    }
}