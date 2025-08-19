package Pages;

import Utilities.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KullaniciPage extends Base {
    By kullanici = new By.ByXPath("//li[@class='p-menuitem font-medium']//span[text()='Kullanıcı']");
    By yargitayTab = new By.ByXPath("//span[@class='p-tabview-title'][text()='Yargıtay Kullanıcıları']");
    By eDevletTab = new By.ByXPath("//span[@class='p-tabview-title'][text()='e-Devlet']");
    By firmaTab = new By.ByXPath("//span[@class='p-tabview-title'][text()='Firmalar']");
    By tcKnoFilter = new By.ByXPath("//table[@class= 'p-datatable-table']//tr//th[@class='p-filter-column'][4]//input[@class='p-inputtext p-component p-column-filter']");
    By gorevlendirmeButton = new By.ByXPath("//button[@class='p-button p-component columnIcon p-button-warning p-button-icon-only']");
    By yeniGorevEkleButton = new By.ByXPath("//span[@class='p-button-label p-c'][text()='Yeni Görevlendirme Ekle']");
    By gRol = By.id("rol");
    By gRolSec = new By.ByXPath("//li[@aria-label='(YİM-1) Sorumlu Daire Hakimi']");
    By gUnvan = By.id("unvan");
    By gUnvanSec = new By.ByXPath("//li[@aria-label='Bilişim Personeli']");
    By gDaire = By.id("daire");
    By gDaireSec = new By.ByXPath("//li[@aria-label='1. Hukuk Dairesi']");
    By gDurum = By.id("durum");
    By gDurumSec = new By.ByXPath("//li[@aria-label='Aktif']");
    By gBasTarih = By.id("gorevlendirmeBasTarih");
    By gBasTarihSec = new By.ByXPath("//tbody//td//span[text()=6]");
    By gAciklama = By.id("aciklama");
    By gKaydetButton = new By.ByXPath("//button[@aria-label='Kaydet']");
    By gKapatButton = new By.ByXPath("//button[@type='button' and @aria-label='Close']");
    By isAktarmaButton = new By.ByXPath("//button[@class='p-button p-component columnIcon p-button-success p-button-icon-only']");
    By kararSec = new By.ByXPath("//tbody[@class='p-datatable-tbody']//tr[1]//td[@class='p-selection-column']//div[@class='p-checkbox p-component']");
    By kullaniciCombo = new By.ByXPath("//div[@class='p-dropdown-trigger']");
    By kullaniciSec = new By.ByXPath("//li[@class='p-dropdown-item' and @aria-label='TO0001-Test Otomasyonu/(YİM-1)']");
    By aktarmaOnayEvet = new By.ByXPath("//button[@aria-label='Onayla']");
    By aktarmaKaydet = new By.ByXPath("//button[@aria-label='Kaydet']");
    By aktarmaKapat = new By.ByXPath("//button[@aria-label='Close']");
    By firmaFilter = new By.ByXPath("//table[@class= 'p-datatable-table']//tr//th[@class='p-filter-column'][2]//input[@class='p-inputtext p-component p-column-filter']");
    By firmaOnayla = new By.ByXPath("//button[@class='p-button p-component columnIcon p-button-success p-button-icon-only']");
    By firmaOnaylaEvet = new By.ByXPath("//button[@aria-label='Evet']");

    public KullaniciPage(WebDriver driver) {
        super(driver);
    }
    public void clickKullanici() {
        fluentWait(kullanici);
        click(kullanici);
    }
    public void clickYargitayTab() {
        fluentWait(yargitayTab);
        click(yargitayTab);
    }
    public void clickEDevletTab() {
        fluentWait(eDevletTab);
        click(eDevletTab);
    }
    public void clickFirmalarTab() {
        fluentWait(firmaTab);
        click(firmaTab);
    }
    public void clickKTcNoFilter() {
        fluentWait(tcKnoFilter);
        click(tcKnoFilter);
    }
    public void sendKeyKTcNoFilter(String tckn) {
        fluentWait(this.tcKnoFilter);
        type(this.tcKnoFilter, tckn);
    }
    public void clickGorevlendirmeButton() {
        fluentWait(gorevlendirmeButton);
        click(gorevlendirmeButton);
    }
    public void clickYeniGorevEkleButton() {
        fluentWait(yeniGorevEkleButton);
        click(yeniGorevEkleButton);
    }
    public void rolSec (){
        fluentWait(gRol);
        click(gRol);
        fluentWait(gRolSec);
        click(gRolSec);
    }
    public void unvanSec (){
        fluentWait(gUnvan);
        click(gUnvan);
        fluentWait(gUnvanSec);
        click(gUnvanSec);
    }
    public void daireSec (){
        fluentWait(gDaire);
        click(gDaire);
        fluentWait(gDaireSec);
        click(gDaireSec);
    }
    public void durumSec (){
        fluentWait(gDurum);
        click(gDurum);
        fluentWait(gDurumSec);
        click(gDurumSec);
    }
    public void gBasTarihSec (){
        fluentWait(gBasTarih);
        click(gBasTarih);
        fluentWait(gBasTarihSec);
        click(gBasTarihSec);
    }
    public void clickGAciklama() {
        fluentWait(gAciklama);
        click(gAciklama);
    }
    public void sendKeyGAciklama(String gAciklama) {
        fluentWait(this.gAciklama);
        type(this.gAciklama, gAciklama);
    }
    public void clickGKaydetButton (){
        fluentWait(gKaydetButton);
        click(gKaydetButton);
    }
    public void clickGKapatButton(){
        fluentWait(gKapatButton);
        click(gKapatButton);
    }
    public void clickIsAktarmaButton() {
        fluentWait(isAktarmaButton);
        click(isAktarmaButton);
    }
    public void clickKararSec(){
        fluentWait(kararSec);
        click(kararSec);
    }
    public void clickKullaniciSec(){
        fluentWait(kullaniciCombo);
        click(kullaniciCombo);
        fluentWait(kullanici);
        click(kullaniciSec);
    }
    public void clickAktarmaOnayEvet(){
        fluentWait(aktarmaOnayEvet);
        click(aktarmaOnayEvet);
    }
    public void clickAktarmaKaydet(){
        fluentWait(aktarmaKaydet);
        click(aktarmaKaydet);
    }
    public void clickAktarmaKapat(){
        fluentWait(aktarmaKapat);
        click(aktarmaKapat);
    }
    public void clickFirmaFilter(){
        fluentWait(firmaFilter);
        click(firmaFilter);
    }
    public void sendKeyFirmaFilter(String firmaNo) {
        fluentWait(this.firmaFilter);
        type(this.firmaFilter, firmaNo);
    }
    public void clickFirmaOnayla(){
        fluentWait(firmaOnayla);
        click(firmaOnayla);
    }
    public void clickFirmaOnaylaEvet(){
        fluentWait(firmaOnaylaEvet);
        click(firmaOnaylaEvet);
    }
}