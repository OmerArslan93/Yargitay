package Pages;

import Utilities.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VeriArindirmaPage extends Base {

    By veriArindirma = new By.ByXPath("//span[@class='p-menuitem-text'][text()='Veri Arındırma']");
    By veriArindirmaBekleyenler = new By.ByXPath("//ul[@class='p-submenu-list p-panelmenu-root-submenu']//span[text()='Bekleyenler']");
    By incelemeyeAl = new By.ByXPath("//button[@aria-label='İncelemeye Al']");
    By onaylayacakKisi = By.id("kullanici");
    By onaylayacakKisiSec = new By.ByXPath("//li[@aria-label='Test Otomasyonu']");
    By anonimlestir = new By.ByXPath("//button[@aria-label='Anonimleştir']");
    By kaydet = new By.ByXPath("//button[@aria-label='Kaydet']");
    By onayla = new By.ByXPath("//button[@aria-label='Onayla']");
    By onaylaEvet = new By.ByXPath("//span[@class='p-button-label p-c'][text()='Evet']");

    public VeriArindirmaPage(WebDriver driver) {
        super(driver);
    }
    public void clickVeriArindirma() {
        fluentWait(veriArindirma);
        click(veriArindirma);
    }
    public void clickVeriArindirmaBekleyenler() {
        fluentWait(veriArindirmaBekleyenler);
        click(veriArindirmaBekleyenler);
    }
    public void clickIncelemeyeAl() {
        fluentWait(incelemeyeAl);
        click(incelemeyeAl);
    }
    public void onaylayacakKisiSec() {
        fluentWait(onaylayacakKisi);
        click(onaylayacakKisi);
        fluentWait(onaylayacakKisiSec);
        click(onaylayacakKisiSec);
    }
    public void clickAnonimlestir() {
        fluentWait(anonimlestir);
        click(anonimlestir);
    }
    public void clickKaydet() {
        fluentWait(kaydet);
        click(kaydet);
    }
    public void clickOnayla() {
        fluentWait(onayla);
        click(onayla);
    }
    public void clickOnaylaEvet() {
        fluentWait(onaylaEvet);
        click(onaylaEvet);
    }
}
