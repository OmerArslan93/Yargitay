package Methods;

import Utilities.Base;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginIslemleri extends Base {

    LoginPage loginPage;

    public LoginIslemleri(WebDriver driver) {
        super(driver);
        loginPage = new LoginPage(driver);
    }
    public void loginOl(String username, String password) {
        loginPage.clickUsername();
        loginPage.sendKeyUsername(username);
        loginPage.clickPassword();
        loginPage.sendKeyPassword(password);
        loginPage.clickGirisButton();
        loginPage.uyariKontrol();
    }
    public void rolSec1 (){
        waitProcess();
        loginPage.rolSec1();
        loginPage.uyariKontrol();
    }
    public void rolSec2 (){
        waitProcess();
        loginPage.rolSec2();
        loginPage.uyariKontrol();
    }
    public void rolSec3 (){
        waitProcess();
        loginPage.rolSec3();
        loginPage.uyariKontrol();
    }
    public void rolSec4 (){
        waitProcess();
        loginPage.rolSec4();
        loginPage.uyariKontrol();
    }
    public void rolSec5 (){
        waitProcess();
        loginPage.rolSec5();
        loginPage.uyariKontrol();
    }
    public void rolSec6 (){
        waitProcess();
        loginPage.rolSec6();
        loginPage.uyariKontrol();
    }
    public void rolSec7 (){
        waitProcess();
        loginPage.rolSec7();
        loginPage.uyariKontrol();
    }
    public void rolSec8 (){
        waitProcess();
        loginPage.rolSec8();
        loginPage.uyariKontrol();
    }
    public void rolSec9 (){
        waitProcess();
        loginPage.rolSec9();
        loginPage.uyariKontrol();
    }
    public void rolSecAdmin (){
        waitProcess();
        loginPage.rolSecAdmin();
        loginPage.uyariKontrol();
    }
    public void kayitOl(String firmaAdi, String firmaNo, String telefon, String ePosta, String adres, String sifre, String sifreOnay){
        loginPage.clickKayitOlButton();
        loginPage.clickKayitOlButton();
        loginPage.clickFirmaAdi();
        loginPage.sendKeyFirmaAdi(firmaAdi);
        loginPage.clickFirmaNo();
        loginPage.sendKeyFirmaNo(firmaNo);
        loginPage.clickTelefon();
        loginPage.sendKeyTelefon(telefon);
        loginPage.clickEposta();
        loginPage.sendKeyEposta(ePosta);
        loginPage.clickAdres();
        loginPage.sendKeyAdres(adres);
        loginPage.clickSifre();
        loginPage.sendKeySifre(sifre);
        loginPage.clickFirmaAdi();
        loginPage.clickSifreOnay();
        loginPage.sendKeySifreOnay(sifreOnay);
        loginPage.clickKvkkCheck();
        loginPage.clickKvkkOnay();
        loginPage.clickKaydet();
    }
    public void logout (){
        loginPage.clickLogout();
    }
    public void logout (int time){
        waitProcess(time);
        loginPage.clickLogout();
    }
}
