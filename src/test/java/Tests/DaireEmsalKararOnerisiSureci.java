package Tests;

import Methods.DaireEmsalKararSorgula;
import Methods.LoginIslemleri;
import Methods.KararDegerlendirmeIslemleri;
import Methods.VeriArindirmaIslemleri;
import Utilities.BaseTest;
import Utilities.Base;
import Utilities.Parameters;
import org.testng.annotations.Test;

public class DaireEmsalKararOnerisiSureci extends BaseTest {

    static String esasNo1 = "";
    static String esasYil1 = "";
    static int kanunMadde = Base.getRandomValue();

    LoginIslemleri login;
    DaireEmsalKararSorgula daireEmsalKararSorgula;
    KararDegerlendirmeIslemleri kararDegerlendirmeIslemleri;
    VeriArindirmaIslemleri veriArindirma;

    @Test(priority = 0, description = "Login İşlemi ve YİM-Hakim Rolü Seçimi", groups = "Karar Değerlendirme Süreçleri")
    public void Login() throws InterruptedException {
        login = new LoginIslemleri(driver);
        login.loginOl(Parameters.getEnvironmentParameters("superUser"), Parameters.getEnvironmentParameters("superPass"));
        login.rolSec7();
    }
    @Test(priority = 1, description = "Karar Sorgulama İşlemi - YİM-Hakim", groups = "Karar Değerlendirme Süreçleri")
    public void EmsalKararSorgula0() {
        daireEmsalKararSorgula = new DaireEmsalKararSorgula(driver);
        daireEmsalKararSorgula.daireEmsalKararIsListesiClick();
        daireEmsalKararSorgula.waitProcess();
        esasNo1 = Base.getEsasNo();
        System.out.println("Esas No : " + esasNo1);
        esasYil1 = Base.getEsasYil();
        System.out.println("Esas Yıl : " + esasYil1);
    }
    @Test(priority = 2, description = "Karar Değerlendirme İşlemi - YİM-Hakim", groups = "Karar Değerlendirme Süreçleri")
    public void KararDegerlendirme0() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.kararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        if (Parameters.getEnvironmentParameters("emsalDegil").equals("true")) {
            kararDegerlendirmeIslemleri.clickEmsalDegilIsaretle();
        }
        kararDegerlendirmeIslemleri.degerlendirmeFormuDoldur(kanunMadde);
        kararDegerlendirmeIslemleri.kaydet();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 3, description = "YİM-1 Rolüne Geçiş İşlemi", groups = "Karar Değerlendirme Süreçleri")
    public void rolSec1() {
        login = new LoginIslemleri(driver);
        login.rolSec1();
    }
    @Test(priority = 4, description = "Karar Sorgulama İşlemi - YİM-1", groups = "Karar Değerlendirme Süreçleri")
    public void EmsalKararSorgula1() {
        daireEmsalKararSorgula = new DaireEmsalKararSorgula(driver);
        daireEmsalKararSorgula.daireEmsalKararOnayaGelenler();
        daireEmsalKararSorgula.waitProcess();
        daireEmsalKararSorgula.esasNoDoldur(esasNo1, esasYil1);
        daireEmsalKararSorgula.araButton();
    }
    @Test(priority = 5, description = "Karar Değerlendirme İşlemi - YİM-1", groups = "Karar Değerlendirme Süreçleri")
    public void KararDegerlendirme1() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.kararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onaylayacakKisiSec();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 6, description = "YİM-2 Rolüne Geçiş İşlemi", groups = "Karar Değerlendirme Süreçleri")
    public void rolSec2() {
        login = new LoginIslemleri(driver);
        login.rolSec2();
    }
    @Test(priority = 7, description = "Karar Sorgulama İşlemi - YİM-2", groups = "Karar Değerlendirme Süreçleri")
    public void EmsalKararSorgula2() {
        daireEmsalKararSorgula = new DaireEmsalKararSorgula(driver);
        daireEmsalKararSorgula.daireEmsalKararOnayaGelenler();
    }
    @Test(priority = 8, description = "Karar Değerlendirme İşlemi - YİM-2", groups = "Karar Değerlendirme Süreçleri")
    public void KararDegerlendirme2() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.kararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onaylayacakKisiSec();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 9, description = "YİM-3 Rolüne Geçiş İşlemi", groups = "Karar Değerlendirme Süreçleri")
    public void rolSec3() {
        login = new LoginIslemleri(driver);
        login.rolSec3();
    }
    @Test(priority = 10, description = "Karar Sorgulama İşlemi - YİM-3", groups = "Karar Değerlendirme Süreçleri")
    public void EmsalKararSorgula3() {
        daireEmsalKararSorgula = new DaireEmsalKararSorgula(driver);
        daireEmsalKararSorgula.daireEmsalKararOnayaGelenler();
    }
    @Test(priority = 11, description = "Karar Değerlendirme İşlemi - YİM-3", groups = "Karar Değerlendirme Süreçleri")
    public void KararDegerlendirme3() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.kararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onaylayacakKisiSec();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 12, description = "YİM-4 Rolüne Geçiş İşlemi", groups = "Karar Değerlendirme Süreçleri")
    public void rolSec4() {
        login = new LoginIslemleri(driver);
        login.rolSec4();
    }
    @Test(priority = 13, description = "Karar Sorgulama İşlemi - YİM-4", groups = "Karar Değerlendirme Süreçleri")
    public void EmsalKararSorgula4() {
        daireEmsalKararSorgula = new DaireEmsalKararSorgula(driver);
        daireEmsalKararSorgula.daireEmsalKararIsListesiClick();
    }
    @Test(priority = 14, description = "Karar Değerlendirme İşlemi - YİM-4", groups = "Karar Değerlendirme Süreçleri")
    public void KararDegerlendirme4() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.kararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onaylayacakKisiSec();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 15, description = "YİM-5 Rolüne Geçiş İşlemi", groups = "Karar Değerlendirme Süreçleri")
    public void rolSec5() {
        login = new LoginIslemleri(driver);
        login.rolSec5();
    }
    @Test(priority = 16, description = "Karar Sorgulama İşlemi - YİM-5", groups = "Karar Değerlendirme Süreçleri")
    public void EmsalKararSorgula5() {
        daireEmsalKararSorgula = new DaireEmsalKararSorgula(driver);
        daireEmsalKararSorgula.daireEmsalKararOnayaGelenler();
    }
    @Test(priority = 17, description = "Karar Değerlendirme İşlemi - YİM-5", groups = "Karar Değerlendirme Süreçleri")
    public void KararDegerlendirme5() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.kararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onaylayacakKisiSec();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 18, description = "YİM-6 Rolüne Geçiş İşlemi", groups = "Karar Değerlendirme Süreçleri")
    public void rolSec6() {
        login = new LoginIslemleri(driver);
        login.rolSec6();
    }
    @Test(priority = 19, description = "Karar Sorgulama İşlemi - YİM-6", groups = "Karar Değerlendirme Süreçleri")
    public void EmsalKararSorgula6() {
        daireEmsalKararSorgula = new DaireEmsalKararSorgula(driver);
        daireEmsalKararSorgula.daireEmsalKararOnayaGelenler();
    }
    @Test(priority = 20, description = "Karar Değerlendirme İşlemi - YİM-6", groups = "Karar Değerlendirme Süreçleri")
    public void KararDegerlendirme6() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.kararAc();
        kararDegerlendirmeIslemleri.incelemeyeAl();
        kararDegerlendirmeIslemleri.onayla();
    }
    @Test(priority = 21, description = "Veri Arındırma Sorumlusu Rolüne Geçiş İşlemi", groups = "Veri Arındırma Süreçleri")
    public void rolSec8() {
        login = new LoginIslemleri(driver);
        login.rolSec8();
    }
    @Test(priority = 22, description="Veri Arındırma Karar Sorgulama İşlemi - Veri Arındırma Sorumlusu", groups="Veri Arındırma Süreçleri")
    public void VeriArindirma() {
        veriArindirma = new VeriArindirmaIslemleri(driver);
        veriArindirma.veriArindirmaBekleyenlerClick();
    }
    @Test(priority = 23, description="Veri Arındırma ve Onaylama İşlemi", groups="Veri Arındırma Süreçleri")
    public void VeriArindirmaIslemleri() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.kararAc();
        veriArindirma.veriArindir();
    }
    @Test(priority = 24, description = "Veri Arındırma Hakim Rolüne Geçiş İşlemi", groups = "Veri Arındırma Süreçleri")
    public void rolSec9() {
        login = new LoginIslemleri(driver);
        login.rolSec9();
    }
    @Test(priority = 25, description="Veri Arındırma Karar Sorgulama İşlemi - Veri Arındırma Hakim", groups="Veri Arındırma Süreçleri")
    public void VeriArindirma2() {
        veriArindirma = new VeriArindirmaIslemleri(driver);
        veriArindirma.veriArindirmaBekleyenlerClick();
        daireEmsalKararSorgula.araButton();
    }
    @Test(priority = 26, description="Veri Arındırma Onay İşlemi - Veri Arındırma Hakim", groups="Veri Arındırma Süreçleri")
    public void VeriArindirmaIslemleri2() {
        kararDegerlendirmeIslemleri = new KararDegerlendirmeIslemleri(driver);
        kararDegerlendirmeIslemleri.kararAc();
        veriArindirma.veriArindirmaOnayla();
    }
    @Test(priority = 27, description="Sistemden Çıkış İşlemi", groups="Veri Arındırma Süreçleri")
    public void Logout8() {
        login = new LoginIslemleri(driver);
        login.logout();
    }
}


