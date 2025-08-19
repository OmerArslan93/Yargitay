package Methods;

import Pages.YimEmsalKararPage;
import Utilities.Base;
import org.openqa.selenium.WebDriver;

public class YimEmsalKararSorgula extends Base {

    YimEmsalKararPage yimEmsalKararPage;

    public YimEmsalKararSorgula(WebDriver driver) {
        super(driver);
        yimEmsalKararPage = new YimEmsalKararPage(driver);
    }
    public void yimEmsalIsListesi () {
        yimEmsalKararPage.clickYimEmsalIsListesi();
    }
    public void yimEmsalOnayaGelenler() {
        yimEmsalKararPage.clickYimEmsalOnayaGelenler();
    }
    public void araButton() {
        yimEmsalKararPage.clickAraButton();
    }
    public void esasNoDoldur(String esasNo1, String esasYil1){
        yimEmsalKararPage.clickEsasBasYil();
        yimEmsalKararPage.sendKeyEsasBasYil(esasYil1);
        yimEmsalKararPage.clickEsasNoBas();
        yimEmsalKararPage.sendKeyEsasNoBas(esasNo1);
        yimEmsalKararPage.clickEsasBitYil();
        yimEmsalKararPage.sendKeyEsasBitYil(esasYil1);
        yimEmsalKararPage.clickEsasNoBit();
        yimEmsalKararPage.sendKeyEsasNoBit(esasNo1);
    }
    public void durumSirala(){
        yimEmsalKararPage.durumSirala();
    }
}