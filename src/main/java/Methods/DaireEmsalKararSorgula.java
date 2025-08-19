package Methods;

import Pages.DaireEmsalKararPage;
import Utilities.Base;
import org.openqa.selenium.WebDriver;

public class DaireEmsalKararSorgula extends Base {

    DaireEmsalKararPage emsalKararlarPage;

    public DaireEmsalKararSorgula(WebDriver driver) {
        super(driver);
        emsalKararlarPage = new DaireEmsalKararPage(driver);
    }
    public void daireEmsalKararIsListesiClick() {
        emsalKararlarPage.clickDaireEmsalIsListesi();
    }
    public void daireEmsalKararOnayaGelenler() {
        emsalKararlarPage.clickDaireEmsalOnayaGelenler();
    }
    public void mahkemeTuruSec() {
        emsalKararlarPage.mahkemeTuruSec();
    }
    public void daireSec() {
        emsalKararlarPage.daireSec();
    }
    public void araButton() {
        emsalKararlarPage.clickAraButton();
    }
    public void esasNoDoldur(String esasNo1, String esasYil1){
        emsalKararlarPage.clickEsasBasYil();
        emsalKararlarPage.sendKeyEsasBasYil(esasYil1);
        emsalKararlarPage.clickEsasNoBas();
        emsalKararlarPage.sendKeyEsasNoBas(esasNo1);
        emsalKararlarPage.clickEsasBitYil();
        emsalKararlarPage.sendKeyEsasBitYil(esasYil1);
        emsalKararlarPage.clickEsasNoBit();
        emsalKararlarPage.sendKeyEsasNoBit(esasNo1);
    }
}