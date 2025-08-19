package Pages;

import Utilities.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArsivPage extends Base {

    By isListesi = new By.ByXPath("//div[@class='p-component p-panelmenu-header']");
    By arsivMenu = new By.ByXPath("//span[@class='p-menuitem-text'][text()='Arşiv']");
    By arsivTumu = new By.ByXPath("//ul[@class='p-submenu-list p-panelmenu-root-submenu']//li[@class='p-menuitem font-medium'][5]//div//span[@class='p-menuitem-text'][text()='Tümü']");
    By sirala = new By.ByXPath("//span[@class='p-column-title'][text()='İş Listesine Düşme Tarihi']");
    static By esasNoAl = new By.ByXPath("//tr[@role='row' and @tabindex='0']//td[4]");

    public ArsivPage(WebDriver driver) {
        super(driver);
    }
    public void clickIsListesi() {
        fluentWait(isListesi);
        click(isListesi);
    }
    public void clickArsivMenu() {
        fluentWait(arsivMenu);
        click(arsivMenu);
    }
    public void clickArsivTumu() {
        fluentWait(arsivTumu);
        click(arsivTumu);
    }
    public void clickSirala() {
        fluentWait(sirala);
        click(sirala);
    }
    public static By esasNoAl(){
        fluentWait(esasNoAl);
        getText(esasNoAl);
        return esasNoAl;
    }
}
