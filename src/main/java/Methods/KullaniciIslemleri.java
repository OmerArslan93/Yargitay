package Methods;

import Pages.KullaniciPage;
import Utilities.Base;
import org.openqa.selenium.WebDriver;

public class KullaniciIslemleri extends Base {

    KullaniciPage kullaniciPage;

    public KullaniciIslemleri(WebDriver driver) {
        super(driver);
        kullaniciPage = new KullaniciPage(driver);
    }
    public void kullaniciIslemleriButton() {
        waitProcess();
        kullaniciPage.clickKullanici();
    }
    public void clickYargitayTab() {
        kullaniciPage.clickYargitayTab();
    }
    public void clickEdevletTab() {
        kullaniciPage.clickEDevletTab();
    }
    public void clickFirmaTab() {
        kullaniciPage.clickFirmalarTab();
    }
    public void firmaBulVeOnayla(String firmaNo){
        kullaniciPage.clickFirmaFilter();
        kullaniciPage.sendKeyFirmaFilter(firmaNo);
        kullaniciPage.clickFirmaOnayla();
        kullaniciPage.clickFirmaOnaylaEvet();
    }
    public void kullaniciBul(String tckn){
        kullaniciPage.clickKTcNoFilter();
        waitProcess();
        kullaniciPage.sendKeyKTcNoFilter(tckn);
    }
    public void gorevlendirme(){
        waitProcess(2000);
        kullaniciPage.clickGorevlendirmeButton();
        waitProcess();
        kullaniciPage.clickYeniGorevEkleButton();
        waitProcess();
        kullaniciPage.rolSec();
        kullaniciPage.unvanSec();
        kullaniciPage.daireSec();
        kullaniciPage.durumSec();
        kullaniciPage.gBasTarihSec();
        kullaniciPage.clickGAciklama();
        kullaniciPage.sendKeyGAciklama("Test Otomasyonu Tarafından Oluşturulmuştur.");
        kullaniciPage.clickGKaydetButton();
        kullaniciPage.clickGKapatButton();
    }
    public void isAktarma(){
        waitProcess();
        kullaniciPage.clickIsAktarmaButton();
        kullaniciPage.clickKararSec();
        kullaniciPage.clickKullaniciSec();
        kullaniciPage.clickAktarmaOnayEvet();
        kullaniciPage.clickAktarmaKaydet();
        kullaniciPage.clickAktarmaKapat();
    }
}