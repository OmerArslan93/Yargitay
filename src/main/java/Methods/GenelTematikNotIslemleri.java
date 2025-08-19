package Methods;

import Pages.GenelTematikNotPage;
import Utilities.Base;
import org.openqa.selenium.WebDriver;

public class GenelTematikNotIslemleri extends Base {

    GenelTematikNotPage genelTematikNotPage;

    public GenelTematikNotIslemleri(WebDriver driver) {
        super(driver);
        genelTematikNotPage = new GenelTematikNotPage(driver);
    }
    public void gTematikNotTumuClick(){
        genelTematikNotPage.clickGtematikNotMenu();
        waitProcess();
        genelTematikNotPage.clickGtematikNotTumu();
    }
    public void gTematikNotBekleyenlerClick(){
        genelTematikNotPage.clickGtematikNotMenu();
        waitProcess();
        genelTematikNotPage.clickGtematikNotBekleyenler();
    }
    public void gtematikNotEkle(String kavram){
        genelTematikNotPage.clickYeniGenelTematikNotEkle();
        genelTematikNotPage.clickKavram();
        genelTematikNotPage.sendKeyKavram(kavram);
        genelTematikNotPage.clickMevzuat();
        genelTematikNotPage.sendKeyMevzuat("Mevzuat");
        genelTematikNotPage.tarihSec();
        genelTematikNotPage.clickKonusu();
        genelTematikNotPage.sendKeyKonusu("Konusu");
        genelTematikNotPage.clickGenelTematikNot();
        genelTematikNotPage.sendKeyGenelTematikNot("Genel Tematik Not - Bu veri Test Otomasyonu tarafından oluşturulmuştur. Lütfen dikkate almayınız!");
        genelTematikNotPage.clickHalkaAcik();
        genelTematikNotPage.clickUyariOnay();
        genelTematikNotPage.clickSabitlensinMi();
        genelTematikNotPage.clickKaydetVeGonder();
    }
    public void gTematikNotBul(String kavram){
        genelTematikNotPage.clickKavramFilter();
        genelTematikNotPage.sendKeyKavramFilter(kavram);
        genelTematikNotPage.clickAra();
        }
    public void gTematikNotAc(){
        genelTematikNotPage.clickTematikNotAc();
    }
    public void gTematikNotOnayla(){
        genelTematikNotPage.clickOnayla();
    }
}
