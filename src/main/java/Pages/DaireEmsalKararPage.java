package Pages;

import Utilities.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;

public class DaireEmsalKararPage extends Base {

    By daireEmsalIsListesi = new By.ByXPath("//ul[@class='p-submenu-list p-panelmenu-root-submenu']//li[@class='p-menuitem font-medium'][1]//span[contains(text(),'İş Listesi')]");
    By daireEmsalOnayaGelenler = new By.ByXPath("//ul[@class='p-submenu-list p-panelmenu-root-submenu']//li[@class='p-menuitem font-medium'][1]//span[contains(text(),'Onaya Gelenler')]");
    By mahkemeTuruClick = By.id("mahkemeTuru");
    By mahkemeTuruSec = new By.ByXPath("//span[text()='Aile Mahkemesi']");
    By daireClick = By.id("yargiOrgan");
    By daireSec = new By.ByXPath("//span[text()='2. Hukuk Dairesi']");
    By esasBasYil = By.id("esasNoBasYili");
    By esasNoBas = By.id("esasNoBaslangic");
    By esasBitYil = By.id("esasNoBitYili");
    By esasNoBit = By.id("esasNoBitis");
    By araButton = new ByCssSelector(".p-button[aria-label='Ara']");
    By temizleButton = new ByCssSelector(".p-button[aria-label='Temizle']");
    static By esasNoAl = new By.ByXPath("//tr[@role='row' and @tabindex='0']//td[4]");

    public DaireEmsalKararPage(WebDriver driver) {
        super(driver);
    }
    public void clickDaireEmsalIsListesi() {
        fluentWait(daireEmsalIsListesi);
        click(daireEmsalIsListesi);
    }
    public void clickDaireEmsalOnayaGelenler() {
        fluentWait(daireEmsalOnayaGelenler);
        click(daireEmsalOnayaGelenler);
    }
    public void mahkemeTuruSec() {
        fluentWait(mahkemeTuruClick);
        click(mahkemeTuruClick);
        fluentWait(mahkemeTuruSec);
        click(mahkemeTuruSec);
    }
    public void daireSec(){
        fluentWait(daireClick);
        click(daireClick);
        fluentWait(daireSec);
        click(daireSec);
    }
    public void clickAraButton (){
        fluentWait(araButton);
        click(araButton);
    }
    public void clickTemizleButton (){
        fluentWait(temizleButton);
        click(temizleButton);
    }
    public void clickEsasBasYil (){
        fluentWait(esasBasYil);
        click(esasBasYil);
    }
    public void sendKeyEsasBasYil(String esasBasYil){
        fluentWait(this.esasBasYil);
        type(this.esasBasYil, esasBasYil);
    }
    public void clickEsasNoBas (){
        fluentWait(esasNoBas);
        click(esasNoBas);
    }
    public void sendKeyEsasNoBas(String esasNoBas){
        fluentWait(this.esasNoBas);
        type(this.esasNoBas, esasNoBas);
    }
    public void clickEsasBitYil (){
        fluentWait(esasBitYil);
        click(esasBitYil);
    }
    public void sendKeyEsasBitYil(String esasNoBitYil){
        fluentWait(this.esasBitYil);
        type(this.esasBitYil, esasNoBitYil);
    }
    public void clickEsasNoBit (){
        fluentWait(esasNoBit);
        click(esasNoBit);
    }
    public void sendKeyEsasNoBit(String esasNoBit){
        fluentWait(this.esasNoBit);
        type(this.esasNoBit, esasNoBit);
    }
    public static By esasNoAl(){
        fluentWait(esasNoAl);
        getText(esasNoAl);
        return esasNoAl;
    }
}
