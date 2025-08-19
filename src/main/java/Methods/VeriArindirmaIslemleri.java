package Methods;

import Pages.VeriArindirmaPage;
import Utilities.Base;
import org.openqa.selenium.WebDriver;

public class VeriArindirmaIslemleri extends Base {

    VeriArindirmaPage veriArindirmaPage;

    public VeriArindirmaIslemleri(WebDriver driver) {
        super(driver);
        veriArindirmaPage = new VeriArindirmaPage(driver);
    }
    public void veriArindirmaBekleyenlerClick() {
        veriArindirmaPage.clickVeriArindirmaBekleyenler();
    }
    public void veriArindir() {
        veriArindirmaPage.clickIncelemeyeAl();
        veriArindirmaPage.onaylayacakKisiSec();
        waitProcess(2000);
        veriArindirmaPage.clickAnonimlestir();
        waitProcess(3000);
        veriArindirmaPage.clickKaydet();
        waitProcess(3000);
        veriArindirmaPage.clickOnayla();
        veriArindirmaPage.clickOnaylaEvet();
    }
    public void veriArindirmaOnayla() {
        veriArindirmaPage.clickIncelemeyeAl();
        waitProcess(3000);
        veriArindirmaPage.clickOnayla();
        veriArindirmaPage.clickOnaylaEvet();
    }

}
