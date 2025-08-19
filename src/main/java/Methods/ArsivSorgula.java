package Methods;

import Pages.ArsivPage;
import Pages.DaireEmsalKararPage;
import Utilities.Base;
import org.openqa.selenium.WebDriver;

public class ArsivSorgula extends Base {

    ArsivPage arsivPage;

    public ArsivSorgula(WebDriver driver) {
        super(driver);
        arsivPage = new ArsivPage(driver);
    }
    public void clickIsListesi() {
        arsivPage.clickIsListesi();
        waitProcess(500);
    }
    public void clickArsivMenu() {
        arsivPage.clickArsivMenu();
    }
    public void clickArsivTumu() {
        waitProcess(300);
        arsivPage.clickArsivTumu();
    }
    public void clickSirala() {
        waitProcess();
        arsivPage.clickSirala();
        waitProcess();
    }
}
