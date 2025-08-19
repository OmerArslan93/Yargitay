package Pages;

import Utilities.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KararAramaPage extends Base {

    By kararArama = new By.ByXPath("//span[@class='p-menuitem-text'][text()='Veri Arındırma']");
    By veriArindirmaBekleyenler = new By.ByXPath("//ul[@class='p-submenu-list p-panelmenu-root-submenu']//li[@class='p-menuitem font-medium'][5]//span[text()='Bekleyenler']");
    By incelemeyeAl = new By.ByXPath("//span[@class='p-button-label p-c'][text()='İncelemeye Al']");
    By anonimlestir = new By.ByXPath("//span[@class='p-button-label p-c'][text()='Anonimleştir']");
    By kaydet = new By.ByXPath("//span[@class='p-button-label p-c'][text()='Kaydet']");
    By onayla = new By.ByXPath("//span[@class='p-button-label p-c'][text()='Onayla']");
    By onaylaEvet = new By.ByXPath("//span[@class='p-button-label p-c'][text()='Evet']");

    public KararAramaPage(WebDriver driver) {
        super(driver);
    }
    public void clickKararArama() {
        fluentWait(kararArama);
        click(kararArama);
    }
    public void clickVeriArindirmaBekleyenler() {
        fluentWait(veriArindirmaBekleyenler);
        click(veriArindirmaBekleyenler);
    }
    public void clickIncelemeyeAl() {
        fluentWait(incelemeyeAl);
        click(incelemeyeAl);
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
