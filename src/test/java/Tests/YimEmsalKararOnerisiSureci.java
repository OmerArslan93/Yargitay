package Tests;

import Methods.*;
import Utilities.Base;
import Utilities.BaseTest;
import Utilities.Parameters;
import org.testng.annotations.Test;

public class YimEmsalKararOnerisiSureci extends BaseTest {

    static String esasNo1 = "";
    static String esasYil1 = "";
    static int kanunMadde = Base.getRandomValue();

    LoginIslemleri login;
    YimEmsalKararSorgula yimEmsalKararSorgula;
    KararDegerlendirmeIslemleri kararDegerlendirmeIslemleri;
    VeriArindirmaIslemleri veriArindirmaIslemleri;

    @Test(priority = 0, description="Login İşlemi ve YİM-4 Rolü Seçimi", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void Login() throws InterruptedException {
        login = new LoginIslemleri(driver);
        login.loginOl(Parameters.getEnvironmentParameters("superUser"), Parameters.getEnvironmentParameters("superPass"));
        login.rolSec4();
    }
    @Test(priority = 1, description="Karar Sorgulama işlemi - YİM-4", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void yimEmsalKararSorgula4() {
        yimEmsalKararSorgula = new YimEmsalKararSorgula(driver);
        yimEmsalKararSorgula.yimEmsalIsListesi();
        yimEmsalKararSorgula.durumSirala();
        yimEmsalKararSorgula.durumSirala();
        yimEmsalKararSorgula.waitProcess();
        esasNo1 = Base.getYimEmsalEsasNo();
        esasYil1 = Base.getYimEmsalEsasYil();
    }
    @Test(priority = 2, description="Karar Değerlendirme işlemi - YİM-4", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void KararDegerlendirme4() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.yimKararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.clickEmsalDegilKaldir();
        kararDegerlendirmeIslemleri.degerlendirmeFormuDoldur(kanunMadde);
        kararDegerlendirmeIslemleri.kaydet();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 3, description = "YİM-5 Rolüne Geçiş İşlemi", groups = "YİM Emsal Karar Değerlendirme Süreçleri")
    public void rolSec5() {
        login = new LoginIslemleri(driver);
        login.rolSec5();
    }
    @Test(priority = 4, description="Karar Sorgulama işlemi - YİM-5", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void yimEmsalKararSorgula5() {
        yimEmsalKararSorgula = new YimEmsalKararSorgula(driver);
        yimEmsalKararSorgula.yimEmsalOnayaGelenler();
        yimEmsalKararSorgula.esasNoDoldur(esasNo1,esasYil1);
        yimEmsalKararSorgula.araButton();
    }
    @Test(priority = 5, description="Karar Değerlendirme işlemi - YİM-5", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void KararDegerlendirme5() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.yimKararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onaylayacakKisiSec();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 6, description = "YİM-6 Rolüne Geçiş İşlemi", groups = "YİM Emsal Karar Değerlendirme Süreçleri")
    public void rolSec6() {
        login = new LoginIslemleri(driver);
        login.rolSec6();
    }
    @Test(priority = 7, description="Karar Sorgulama işlemi - YİM-6", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void yimEmsalKararSorgula6() {
        yimEmsalKararSorgula = new YimEmsalKararSorgula(driver);
        yimEmsalKararSorgula.yimEmsalOnayaGelenler();
        yimEmsalKararSorgula.araButton();
    }
    @Test(priority = 8, description="Karar Değerlendirme işlemi - YİM-6", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void KararDegerlendirme6() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.yimKararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onaylayacakKisiSec();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 9, description = "YİM-1 Rolüne Geçiş İşlemi", groups = "YİM Emsal Karar Değerlendirme Süreçleri")
    public void rolSec1() {
        login = new LoginIslemleri(driver);
        login.rolSec1();
    }
    @Test(priority = 10, description="Karar Sorgulama işlemi - YİM-1", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void yimEmsalKararSorgula1() {
        yimEmsalKararSorgula = new YimEmsalKararSorgula(driver);
        yimEmsalKararSorgula.yimEmsalOnayaGelenler();
        yimEmsalKararSorgula.araButton();
    }
    @Test(priority = 11, description="Karar Değerlendirme işlemi - YİM-1", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void KararDegerlendirme1() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.yimKararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onaylayacakKisiSec();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 12, description = "YİM-2 Rolüne Geçiş İşlemi", groups = "YİM Emsal Karar Değerlendirme Süreçleri")
    public void rolSec2() {
        login = new LoginIslemleri(driver);
        login.rolSec2();
    }
    @Test(priority = 13, description="Karar Sorgulama işlemi - YİM-2", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void yimEmsalKararSorgula2() {
        yimEmsalKararSorgula = new YimEmsalKararSorgula(driver);
        yimEmsalKararSorgula.yimEmsalOnayaGelenler();
        yimEmsalKararSorgula.araButton();
    }
    @Test(priority = 14, description="Karar Değerlendirme işlemi - YİM-2", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void KararDegerlendirme2() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.yimKararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onaylayacakKisiSec();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 15, description = "YİM-3 Rolüne Geçiş İşlemi", groups = "YİM Emsal Karar Değerlendirme Süreçleri")
    public void rolSec3() {
        login = new LoginIslemleri(driver);
        login.rolSec3();
    }
    @Test(priority = 16, description="Karar Sorgulama işlemi - YİM-3", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void yimEmsalKararSorgula3() {
        yimEmsalKararSorgula = new YimEmsalKararSorgula(driver);
        yimEmsalKararSorgula.yimEmsalOnayaGelenler();
        yimEmsalKararSorgula.araButton();
    }
    @Test(priority = 17, description="Karar Değerlendirme işlemi - YİM-3", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void KararDegerlendirme3() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.yimKararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onaylayacakKisiSec();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 18, description = "YİM-4 Rolüne Geçiş İşlemi", groups = "YİM Emsal Karar Değerlendirme Süreçleri")
    public void rolSec7() {
        login = new LoginIslemleri(driver);
        login.rolSec4();
    }
    @Test(priority = 19, description="Karar Sorgulama işlemi - YİM-4", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void yimEmsalKararSorgula7() {
        yimEmsalKararSorgula = new YimEmsalKararSorgula(driver);
        yimEmsalKararSorgula.yimEmsalIsListesi();
        yimEmsalKararSorgula.araButton();
    }
    @Test(priority = 20, description="Karar Değerlendirme işlemi - YİM-4", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void KararDegerlendirme7() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.yimKararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onaylayacakKisiSec();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 21, description = "YİM-5 Rolüne Geçiş İşlemi", groups = "YİM Emsal Karar Değerlendirme Süreçleri")
    public void rolSec8() {
        login = new LoginIslemleri(driver);
        login.rolSec5();
    }
    @Test(priority = 22, description="Karar Sorgulama işlemi - YİM-5", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void yimEmsalKararSorgula8() {
        yimEmsalKararSorgula = new YimEmsalKararSorgula(driver);
        yimEmsalKararSorgula.yimEmsalIsListesi();
        yimEmsalKararSorgula.araButton();
    }
    @Test(priority = 23, description="Karar Değerlendirme işlemi - YİM-5", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void KararDegerlendirme8() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.yimKararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onaylayacakKisiSec();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 24, description = "YİM-6 Rolüne Geçiş İşlemi", groups = "YİM Emsal Karar Değerlendirme Süreçleri")
    public void rolSec9() {
        login = new LoginIslemleri(driver);
        login.rolSec6();
    }
    @Test(priority = 25, description="Karar Sorgulama işlemi - YİM-6", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void yimEmsalKararSorgula9() {
        yimEmsalKararSorgula = new YimEmsalKararSorgula(driver);
        yimEmsalKararSorgula.yimEmsalIsListesi();
        yimEmsalKararSorgula.araButton();
    }
    @Test(priority = 26, description="Karar Değerlendirme işlemi - YİM-6", groups="YİM Emsal Karar Değerlendirme Süreçleri")
    public void KararDegerlendirme9() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.yimKararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onaylayacakKisiSec();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 27, description = "Veri Arındırma Sorumlusu Rolüne Geçiş İşlemi", groups = "Veri Arındırma Süreçleri")
    public void rolSec10() {
        login = new LoginIslemleri(driver);
        login.rolSec8();
    }
    @Test(priority = 28, description="Veri Arındırma Karar Sorgulama İşlemi - Veri Arındırma Sorumlusu", groups="Veri Arındırma Süreçleri")
    public void VeriArindirma() {
        veriArindirmaIslemleri = new VeriArindirmaIslemleri(driver);
        veriArindirmaIslemleri.veriArindirmaBekleyenlerClick();
    }
    @Test(priority = 29, description="Veri Arındırma ve Onaylama İşlemi", groups="Veri Arındırma Süreçleri")
    public void VeriArindirmaIslemleri() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.kararAc();
        veriArindirmaIslemleri.veriArindir();
    }
    @Test(priority = 30, description = "Veri Arındırma Hakim Rolüne Geçiş İşlemi", groups = "Veri Arındırma Süreçleri")
    public void rolSec11() {
        login = new LoginIslemleri(driver);
        login.rolSec9();
    }
    @Test(priority = 31, description="Veri Arındırma Karar Sorgulama İşlemi - Veri Arındırma Hakim", groups="Veri Arındırma Süreçleri")
    public void VeriArindirma2() {
        veriArindirmaIslemleri = new VeriArindirmaIslemleri(driver);
        veriArindirmaIslemleri.veriArindirmaBekleyenlerClick();
        yimEmsalKararSorgula.araButton();
    }
    @Test(priority = 32, description="Veri Arındırma Onay İşlemi - Veri Arındırma Hakim", groups="Veri Arındırma Süreçleri")
    public void VeriArindirmaIslemleri2() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.kararAc();
        veriArindirmaIslemleri.veriArindirmaOnayla();
    }
    @Test(priority = 33, description="Sistemden Çıkış İşlemi", groups="Veri Arındırma Süreçleri")
    public void Logout8() {
        login = new LoginIslemleri(driver);
        login.logout();
    }
}

