package Methods;

import Pages.KararDegerlendirmePage;
import Utilities.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

public class KararDegerlendirmeIslemleri extends Base {

     KararDegerlendirmePage kararDegerlendirmePage;

    public KararDegerlendirmeIslemleri(WebDriver driver) {
        super(driver);
        kararDegerlendirmePage = new KararDegerlendirmePage(driver);
    }
    public void kararAc (){
        waitProcess();
        kararDegerlendirmePage.clickKararAc();
    }
    public void yimKararAc (){
        waitProcess();
        kararDegerlendirmePage.clickYimKararAc();
        waitProcess();
    }
    public void incelemeyeAl (){
        waitProcess();
        kararDegerlendirmePage.clickIncelemeyeAl();
    }
    public void incelemeyiBirak (){
        kararDegerlendirmePage.clickIncelemeyiBirak();
    }
    public void degerlendirmeFormuDoldur(int maddeText) {
        waitProcess(2000);
        kararDegerlendirmePage.onaylayacakKisiSec();
        kararDegerlendirmePage.onemDuzeyiSec();
        kararDegerlendirmePage.onemGerekcesiSec();
        kararDegerlendirmePage.clickOzetBilgileriButton();
        kararDegerlendirmePage.ozet1kontrol();
        kararDegerlendirmePage.clickAktarButton();
        kararDegerlendirmePage.hukukiKavramSec();
        kararDegerlendirmePage.mevzuatTuruSec();
        waitProcess(500);
        kararDegerlendirmePage.mevzuatSec();
        kararDegerlendirmePage.clickMaddeText();
        kararDegerlendirmePage.sendKeyMaddeText(""+Base.getRandomValue());
        kararDegerlendirmePage.clickFikraText();
        kararDegerlendirmePage.sendKeyFikraText("2");
        kararDegerlendirmePage.clickBendText();
        kararDegerlendirmePage.sendKeyBendText("b");
        kararDegerlendirmePage.clickEkleButton();
        kararDegerlendirmePage.clickNot();
        kararDegerlendirmePage.sendKeyNot("Test Not");
    }
    public void clickEmsalDegilKaldir(){
        kararDegerlendirmePage.clickEmsalDegil();
    }
    public void clickEmsalDegilIsaretle(){
        kararDegerlendirmePage.clickEmsalDegil();
    }
    public void onaylayacakKisiSec(){
        kararDegerlendirmePage.onaylayacakKisiSec();
    }
    public void kaydet(){
        kararDegerlendirmePage.clickKaydet();
        kararDegerlendirmePage.clickKayitOnayla();
    }
    public void onayla(){
        kararDegerlendirmePage.clickOnayla();
        kararDegerlendirmePage.clickOnaylaEvet();
    }
    public void sureceDahilEt(){
        kararDegerlendirmePage.clickSureceDahilEt();
        kararDegerlendirmePage.clickOnaylaEvet();
    }
    public void arsiveGonder(){
        kararDegerlendirmePage.clickArsiveGonder();
        kararDegerlendirmePage.clickArsivGerekce();
        kararDegerlendirmePage.sendKeyArsivGerekce("Test Otomasyonu tarafından arşive gönderildi.");
        kararDegerlendirmePage.clickGonder();
        kararDegerlendirmePage.clickArsivEvet();
    }
}
