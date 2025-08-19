package Tests;

import Methods.GenelTematikNotIslemleri;
import Methods.LoginIslemleri;
import Utilities.Base;
import Utilities.BaseTest;
import Utilities.Parameters;
import org.testng.annotations.Test;

public class GenelTematikNotSureci extends BaseTest {

    LoginIslemleri login;
    GenelTematikNotIslemleri gTematikNot;

    static String kavram = "Tematik Not "+ Base.getRandomValue();

    @Test(priority = 0, description="Login İşlemi ve YİM-1 Rolü Seçimi", groups="Genel Tematik Not Süreçleri")
    public void Login() throws InterruptedException {
        login = new LoginIslemleri(driver);
        login.loginOl(Parameters.getEnvironmentParameters("superUser"),Parameters.getEnvironmentParameters("superPass"));
        login.rolSec1();
    }

    @Test(priority = 1, description="Yeni Tematik Not Ekleme İşlemi - YİM-1", groups="Genel Tematik Not Süreçleri")
    public void gTematikNotEkle() throws InterruptedException {
        gTematikNot = new GenelTematikNotIslemleri(driver);
        gTematikNot.gTematikNotBekleyenlerClick();
        gTematikNot.gtematikNotEkle(kavram);
    }
    @Test(priority = 2, description="YİM-2 Rolüne Geçiş İşlemi", groups="Genel Tematik Not Süreçleri")
    public void rolSec2(){
        login = new LoginIslemleri(driver);
        login.rolSec2();
    }
    @Test(priority = 3, description="Tematik Not Onaylama İşlemi - YİM-2", groups="Genel Tematik Not Süreçleri")
    public void gTematikNotBulOnayla() throws InterruptedException {
        gTematikNot = new GenelTematikNotIslemleri(driver);
        gTematikNot.gTematikNotBekleyenlerClick();
        gTematikNot.gTematikNotBul(kavram);
        gTematikNot.gTematikNotAc();
        gTematikNot.gTematikNotOnayla();
    }
    @Test(priority = 4, description="YİM-3 Rolüne Geçiş İşlemi", groups="Genel Tematik Not Süreçleri")
    public void rolSec3(){
        login = new LoginIslemleri(driver);
        login.rolSec3();
    }
    @Test(priority = 5, description="Tematik Not Onaylama İşlemi - YİM-3", groups="Genel Tematik Not Süreçleri")
    public void gTematikNotBulOnayla3() throws InterruptedException {
        gTematikNot = new GenelTematikNotIslemleri(driver);
        gTematikNot.gTematikNotBekleyenlerClick();
        gTematikNot.gTematikNotAc();
        gTematikNot.gTematikNotOnayla();
    }
    @Test(priority = 6, description="YİM-4 Rolüne Geçiş İşlemi", groups="Genel Tematik Not Süreçleri")
    public void rolSec4(){
        login = new LoginIslemleri(driver);
        login.rolSec4();
    }
    @Test(priority = 7, description="Tematik Not Onaylama İşlemi - YİM-4", groups="Genel Tematik Not Süreçleri")
    public void gTematikNotBulOnayla4() throws InterruptedException {
        gTematikNot = new GenelTematikNotIslemleri(driver);
        gTematikNot.gTematikNotBekleyenlerClick();
        gTematikNot.gTematikNotAc();
        gTematikNot.gTematikNotOnayla();
    }
    @Test(priority = 8, description="YİM-5 Rolüne Geçiş İşlemi", groups="Genel Tematik Not Süreçleri")
    public void rolSec5(){
        login = new LoginIslemleri(driver);
        login.rolSec5();
    }
    @Test(priority = 9, description="Tematik Not Onaylama İşlemi - YİM-5", groups="Genel Tematik Not Süreçleri")
    public void gTematikNotBulOnayla5() throws InterruptedException {
        gTematikNot = new GenelTematikNotIslemleri(driver);
        gTematikNot.gTematikNotBekleyenlerClick();
        gTematikNot.gTematikNotAc();
        gTematikNot.gTematikNotOnayla();
    }
    @Test(priority = 10, description="YİM-6 Rolüne Geçiş İşlemi", groups="Genel Tematik Not Süreçleri")
    public void rolSec6(){
        login = new LoginIslemleri(driver);
        login.rolSec6();
    }
    @Test(priority = 16, description="Tematik Not Onaylama İşlemi - YİM-6", groups="Genel Tematik Not Süreçleri")
    public void gTematikNotBulOnayla6() throws InterruptedException {
        gTematikNot = new GenelTematikNotIslemleri(driver);
        gTematikNot.gTematikNotBekleyenlerClick();
        gTematikNot.gTematikNotAc();
        gTematikNot.gTematikNotOnayla();
    }
    @Test(priority = 17, description="Logout İşlemi - YİM-6", groups="Genel Tematik Not Süreçleri")
    public void Logout6(){
        login = new LoginIslemleri(driver);
        login.logout();
    }
}
