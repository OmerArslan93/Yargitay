package Tests;

import Methods.HukukiKavramIslemleri;
import Methods.LoginIslemleri;
import Utilities.Base;
import Utilities.BaseTest;
import Utilities.Parameters;
import org.testng.annotations.Test;

public class HukukiKavramSureci extends BaseTest {

    LoginIslemleri login;
    HukukiKavramIslemleri hukukiKavramIslemleri;

    static String hukukiKavramNo = "Kavram "+ Base.getRandomValue();

    @Test(priority = 0, description="Login İşlemi ve YİM-1 Rolü Seçimi", groups="Hukuki Kavram Süreçleri")
    public void rolSec1() throws InterruptedException {
        login = new LoginIslemleri(driver);
        login.loginOl(Parameters.getEnvironmentParameters("superUser"),Parameters.getEnvironmentParameters("superPass"));
        login.rolSec1();
    }
    @Test(priority = 1, description="Hukuki Kavram Ekleme İşlemi - YİM-1", groups="Hukuki Kavram Süreçleri")
    public void hukukiKavramEkle() throws InterruptedException {
        hukukiKavramIslemleri = new HukukiKavramIslemleri(driver);
        hukukiKavramIslemleri.digerMenuKapat();
        hukukiKavramIslemleri.hukukiKavramMenuClick();
        hukukiKavramIslemleri.hukukiKavramMenuBekleyenlerClick();
        hukukiKavramIslemleri.hukukiKavramEkle(hukukiKavramNo);
    }
    @Test(priority = 2, description="YİM-2 Rolüne Geçiş İşlemi", groups="Hukuki Kavram Süreçleri")
    public void rolSec2() throws InterruptedException {
        login = new LoginIslemleri(driver);
        login.rolSec2();
    }
    @Test(priority = 3, description="Hukuki Kavram Onaylama İşlemi - YİM-2", groups="Hukuki Kavram Süreçleri")
    public void hukukiKavramBulOnayla() throws InterruptedException {
        hukukiKavramIslemleri = new HukukiKavramIslemleri(driver);
        hukukiKavramIslemleri.digerMenuKapat();
        hukukiKavramIslemleri.hukukiKavramMenuBekleyenlerClick();
        hukukiKavramIslemleri.hukukiKavramBul(hukukiKavramNo);
        hukukiKavramIslemleri.HukukiKavramOnayla();
    }
    @Test(priority = 4, description="YİM-3 Rolüne Geçiş İşlemi", groups="Hukuki Kavram Süreçleri")
    public void rolSec3() throws InterruptedException {
        login = new LoginIslemleri(driver);
        login.rolSec3();
    }
    @Test(priority = 5, description="Hukuki Kavram Onaylama İşlemi - YİM-3", groups="Hukuki Kavram Süreçleri")
    public void hukukiKavramBulOnayla3() throws InterruptedException {
        hukukiKavramIslemleri = new HukukiKavramIslemleri(driver);
        hukukiKavramIslemleri.digerMenuKapat();
        hukukiKavramIslemleri.hukukiKavramMenuBekleyenlerClick();
        hukukiKavramIslemleri.hukukiKavramBul(hukukiKavramNo);
        hukukiKavramIslemleri.HukukiKavramOnayla();
    }
    @Test(priority = 6, description="YİM-4 Rolüne Geçiş İşlemi", groups="Hukuki Kavram Süreçleri")
    public void rolSec4() throws InterruptedException {
        login = new LoginIslemleri(driver);
        login.rolSec4();
    }
    @Test(priority = 7, description="Hukuki Kavram Onaylama İşlemi - YİM-4", groups="Hukuki Kavram Süreçleri")
    public void hukukiKavramBulOnayla4() throws InterruptedException {
        hukukiKavramIslemleri = new HukukiKavramIslemleri(driver);
        hukukiKavramIslemleri.digerMenuKapat();
        hukukiKavramIslemleri.hukukiKavramMenuBekleyenlerClick();
        hukukiKavramIslemleri.hukukiKavramBul(hukukiKavramNo);
        hukukiKavramIslemleri.HukukiKavramOnayla();
    }
    @Test(priority = 8, description="YİM-5 Rolüne Geçiş İşlemi", groups="Hukuki Kavram Süreçleri")
    public void rolSec5() throws InterruptedException {
        login = new LoginIslemleri(driver);
        login.rolSec5();
    }
    @Test(priority = 9, description="Hukuki Kavram Onaylama İşlemi - YİM-5", groups="Hukuki Kavram Süreçleri")
    public void hukukiKavramBulOnayla5() throws InterruptedException {
        hukukiKavramIslemleri = new HukukiKavramIslemleri(driver);
        hukukiKavramIslemleri.digerMenuKapat();
        hukukiKavramIslemleri.hukukiKavramMenuBekleyenlerClick();
        hukukiKavramIslemleri.hukukiKavramBul(hukukiKavramNo);
        hukukiKavramIslemleri.HukukiKavramOnayla();
    }
    @Test(priority = 10, description="YİM-6 Rolüne Geçiş İşlemi", groups="Hukuki Kavram Süreçleri")
    public void rolSec6() throws InterruptedException {
        login = new LoginIslemleri(driver);
        login.rolSec6();
    }
    @Test(priority = 11, description="Hukuki Kavram Onaylama ve Kontrol İşlemi - YİM-6", groups="Hukuki Kavram Süreçleri")
    public void hukukiKavramBulOnayla6() throws InterruptedException {
        hukukiKavramIslemleri = new HukukiKavramIslemleri(driver);
        hukukiKavramIslemleri.digerMenuKapat();
        hukukiKavramIslemleri.hukukiKavramMenuBekleyenlerClick();
        hukukiKavramIslemleri.hukukiKavramBul(hukukiKavramNo);
        hukukiKavramIslemleri.HukukiKavramOnayla();
        hukukiKavramIslemleri.hukukiKavramOnaylananlarClick();
        hukukiKavramIslemleri.hukukiKavramBul(hukukiKavramNo);
    }
    @Test(priority = 12, description="Sistemden Çıkış İşlemi", groups="Hukuki Kavram Süreçleri")
    public void Logout() {
        login = new LoginIslemleri(driver);
        login.logout();
    }
}
