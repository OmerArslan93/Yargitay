package Tests;

import Methods.*;
import Utilities.Base;
import Utilities.BaseTest;
import Utilities.Parameters;
import org.testng.annotations.Test;

public class ArsivdenAlmaSureci extends BaseTest {

    static String esasNo1 = "";
    static String esasYil1 = "";
    static int kanunMadde = Base.getRandomValue();

    LoginIslemleri login;
    ArsivSorgula arsivSorgula;
    YimEmsalKararSorgula yimEmsalKararSorgula;
    KararDegerlendirmeIslemleri kararDegerlendirmeIslemleri;
    VeriArindirmaIslemleri veriArindirmaIslemleri;
    Base base;

    @Test(priority = 0, description = "Login İşlemi ve YİM-4 Rolü Seçimi", groups = "Arşivden Alma Süreçleri")
    public void Login() throws InterruptedException {
        login = new LoginIslemleri(driver);
        login.loginOl(Parameters.getEnvironmentParameters("superUser"), Parameters.getEnvironmentParameters("superPass"));
        login.rolSec4();
    }
    @Test(priority = 1, description = "Karar Sorgulama İşlemi - YİM-4", groups = "Arşivden Alma Süreçleri")
    public void ArsivSorgula() {
        arsivSorgula = new ArsivSorgula(driver);
        arsivSorgula.clickIsListesi();
        arsivSorgula.clickArsivMenu();
        arsivSorgula.clickArsivTumu();
        arsivSorgula.clickSirala();
        esasNo1 = Base.getEsasNo();
        System.out.println("Esas No : " + esasNo1);
        esasYil1 = Base.getEsasYil();
        System.out.println("Esas Yıl : " + esasYil1);
    }
    @Test(priority = 2, description = "Karar Değerlendirme İşlemi - YİM-4", groups = "Arşivden Alma Süreçleri")
    public void KararDegerlendirme() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.kararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.clickEmsalDegilKaldir();
        kararDegerlendirmeIslemleri.degerlendirmeFormuDoldur(kanunMadde);
        kararDegerlendirmeIslemleri.kaydet();
        kararDegerlendirmeIslemleri.sureceDahilEt();
    }
    @Test(priority = 3, description = "YİM-5 Rolüne Geçiş İşlemi", groups = "Arşivden Alma Süreçleri")
    public void rolSec5() {
        login = new LoginIslemleri(driver);
        login.rolSec5();
    }
    @Test(priority = 4, description="Karar Sorgulama işlemi - YİM-5", groups="Arşivden Alma Süreçleri")
    public void yimEmsalKararSorgula5() {
        yimEmsalKararSorgula = new YimEmsalKararSorgula(driver);
        yimEmsalKararSorgula.yimEmsalOnayaGelenler();
        yimEmsalKararSorgula.esasNoDoldur(esasNo1,esasYil1);
        yimEmsalKararSorgula.araButton();
    }
    @Test(priority = 5, description="Karar Değerlendirme işlemi - YİM-5", groups="Arşivden Alma Süreçleri")
    public void KararDegerlendirme5() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.yimKararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onaylayacakKisiSec();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 6, description = "YİM-6 Rolüne Geçiş İşlemi", groups = "Arşivden Alma Süreçleri")
    public void rolSec6() {
        login = new LoginIslemleri(driver);
        login.rolSec6();
    }
    @Test(priority = 7, description="Karar Sorgulama işlemi - YİM-6", groups="Arşivden Alma Süreçleri")
    public void yimEmsalKararSorgula6() {
        yimEmsalKararSorgula = new YimEmsalKararSorgula(driver);
        yimEmsalKararSorgula.yimEmsalOnayaGelenler();
    }
    @Test(priority = 8, description="Karar Değerlendirme işlemi - YİM-6", groups="Arşivden Alma Süreçleri")
    public void KararDegerlendirme6() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.yimKararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 9, description = "Veri Arındırma Sorumlusu Rolüne Geçiş İşlemi", groups = "Veri Arındırma Süreçleri")
    public void rolSec8() {
        login = new LoginIslemleri(driver);
        login.rolSec8();
    }
    @Test(priority = 10, description="Veri Arındırma Karar Sorgulama İşlemi - Veri Arındırma Sorumlusu", groups="Veri Arındırma Süreçleri")
    public void VeriArindirma() {
        veriArindirmaIslemleri = new VeriArindirmaIslemleri(driver);
        veriArindirmaIslemleri.veriArindirmaBekleyenlerClick();
    }
    @Test(priority = 11, description="Veri Arındırma ve Onaylama İşlemi", groups="Veri Arındırma Süreçleri")
    public void VeriArindirmaIslemleri() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.kararAc();
        veriArindirmaIslemleri.veriArindir();
    }
    @Test(priority = 12, description = "Veri Arındırma Hakim Rolüne Geçiş İşlemi", groups = "Veri Arındırma Süreçleri")
    public void rolSec9() {
        login = new LoginIslemleri(driver);
        login.rolSec9();
    }
    @Test(priority = 13, description="Veri Arındırma Karar Sorgulama İşlemi - Veri Arındırma Hakim", groups="Veri Arındırma Süreçleri")
    public void VeriArindirma2() {
        veriArindirmaIslemleri = new VeriArindirmaIslemleri(driver);
        veriArindirmaIslemleri.veriArindirmaBekleyenlerClick();
        yimEmsalKararSorgula.araButton();
    }
    @Test(priority = 14, description="Veri Arındırma Onay İşlemi - Veri Arındırma Hakim", groups="Veri Arındırma Süreçleri")
    public void VeriArindirmaIslemleri2() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.kararAc();
        veriArindirmaIslemleri.veriArindirmaOnayla();
    }
    @Test(priority = 15, description="Sistemden Çıkış İşlemi", groups="Veri Arındırma Süreçleri")
    public void Logout() {
        login = new LoginIslemleri(driver);
        login.logout();
    }
}
