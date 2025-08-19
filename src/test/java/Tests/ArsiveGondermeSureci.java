package Tests;

import Methods.*;
import Utilities.Base;
import Utilities.BaseTest;
import Utilities.Parameters;
import org.testng.annotations.Test;

public class ArsiveGondermeSureci extends BaseTest {

    static String esasNo1 = "";
    static String esasYil1 = "";
    static int kanunMadde = Base.getRandomValue();

    LoginIslemleri login;
    YimEmsalKararSorgula yimEmsalKararSorgula;
    KararDegerlendirmeIslemleri kararDegerlendirmeIslemleri;

    @Test(priority = 0, description="Login İşlemi ve YİM-4 Rolü Seçimi", groups="Arşive Gönderme Süreçleri")
    public void Login() throws InterruptedException {
        login = new LoginIslemleri(driver);
        login.loginOl(Parameters.getEnvironmentParameters("superUser"), Parameters.getEnvironmentParameters("superPass"));
        login.rolSec4();
    }
    @Test(priority = 1, description="Karar Sorgulama işlemi - YİM-4", groups="Arşive Gönderme Süreçleri")
    public void ArsivKararSorgula4() {
        yimEmsalKararSorgula = new YimEmsalKararSorgula(driver);
        yimEmsalKararSorgula.yimEmsalIsListesi();
        yimEmsalKararSorgula.waitProcess();
        esasNo1 = Base.getYimEmsalEsasNo();
        esasYil1 = Base.getYimEmsalEsasYil();
    }
    @Test(priority = 2, description="Karar Değerlendirme işlemi - YİM-4", groups="Arşive Gönderme Süreçleri")
    public void KararDegerlendirme4() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.yimKararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.degerlendirmeFormuDoldur(kanunMadde);
        kararDegerlendirmeIslemleri.kaydet();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 3, description = "YİM-5 Rolüne Geçiş İşlemi", groups = "Arşive Gönderme Süreçleri")
    public void rolSec5() {
        login = new LoginIslemleri(driver);
        login.rolSec5();
    }
    @Test(priority = 4, description="Karar Sorgulama işlemi - YİM-5", groups="Arşive Gönderme Süreçleri")
    public void yimEmsalKararSorgula5() {
        yimEmsalKararSorgula = new YimEmsalKararSorgula(driver);
        yimEmsalKararSorgula.yimEmsalOnayaGelenler();
        yimEmsalKararSorgula.esasNoDoldur(esasNo1,esasYil1);
        yimEmsalKararSorgula.araButton();
    }
    @Test(priority = 5, description="Karar Değerlendirme işlemi - YİM-5", groups="Arşive Gönderme Süreçleri")
    public void KararDegerlendirme5() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.yimKararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onaylayacakKisiSec();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 6, description = "YİM-6 Rolüne Geçiş İşlemi", groups = "Arşive Gönderme Süreçleri")
    public void rolSec6() {
        login = new LoginIslemleri(driver);
        login.rolSec6();
    }
    @Test(priority = 7, description="Karar Sorgulama işlemi - YİM-6", groups="Arşive Gönderme Süreçleri")
    public void yimEmsalKararSorgula6() {
        yimEmsalKararSorgula = new YimEmsalKararSorgula(driver);
        yimEmsalKararSorgula.yimEmsalOnayaGelenler();
    }
    @Test(priority = 8, description="Karar Değerlendirme işlemi - YİM-6", groups="Arşive Gönderme Süreçleri")
    public void KararDegerlendirme6() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.yimKararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onaylayacakKisiSec();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 9, description="YİM-4 Rolüne Geçiş İşlemi", groups="Arşive Gönderme Süreçleri")
    public void rolSec4() throws InterruptedException {
        login = new LoginIslemleri(driver);
        login.rolSec4();
    }
    @Test(priority = 10, description="Karar Sorgulama işlemi - YİM-4", groups="Arşive Gönderme Süreçleri")
    public void yimEmsalKararSorgula4() {
        yimEmsalKararSorgula = new YimEmsalKararSorgula(driver);
        yimEmsalKararSorgula.yimEmsalIsListesi();
        yimEmsalKararSorgula.waitProcess();
    }
    @Test(priority = 11, description="Arşive Gönderme İşlemi - YİM-4", groups="Arşive Gönderme Süreçleri")
    public void KararDegerlendirmee4() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.yimKararAc();
        kararDegerlendirmeIslemleri.arsiveGonder();
    }
    @Test(priority = 12, description="Sistemden Çıkış İşlemi", groups="Arşive Gönderme Süreçleri")
    public void Logout() {
        login = new LoginIslemleri(driver);
        login.logout();
    }
}
