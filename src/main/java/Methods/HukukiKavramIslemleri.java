package Methods;

import Pages.HukukiKavramPage;
import Utilities.Base;
import org.openqa.selenium.WebDriver;

public class HukukiKavramIslemleri extends Base {

    HukukiKavramPage hukukiKavramPage;

    public HukukiKavramIslemleri(WebDriver driver) {
        super(driver);
        hukukiKavramPage = new HukukiKavramPage(driver);
    }
    public void digerMenuKapat(){
        hukukiKavramPage.daireKapat();
        waitProcess();
        hukukiKavramPage.yimKapat();
    }
    public void hukukiKavramMenuClick(){
        hukukiKavramPage.clickHukukiKavramMenu();
    }
    public void hukukiKavramMenuBekleyenlerClick(){
        waitProcess();
        hukukiKavramPage.clickHukukiKavramBekleyenler();
    }
    public void hukukiKavramOnaylananlarClick(){
        hukukiKavramPage.clickHukukiKavramOnaylananlar();
    }
    public void hukukiKavramEkle(String HukukiKavramNo){
        hukukiKavramPage.clickYeniHukukiKavramEkle();
        hukukiKavramPage.clickHukukiKavram();
        hukukiKavramPage.sendKeyHukukiKavram(HukukiKavramNo);
        hukukiKavramPage.clickAciklama();
        hukukiKavramPage.sendKeyAciklama("Test Otomasyonu tarafından oluşturulmuştur");
        hukukiKavramPage.clickAKaydet();
    }
    public void hukukiKavramBul(String HukukiKavram){
        hukukiKavramPage.clickHukukiKavramFilter();
        hukukiKavramPage.sendKeyHukukiKavramFilter(HukukiKavram);
        waitProcess(1500);
        hukukiKavramPage.clickHukukiKavramAc();
    }
    public void HukukiKavramOnayla(){
        hukukiKavramPage.clickOnayla();
    }
}
