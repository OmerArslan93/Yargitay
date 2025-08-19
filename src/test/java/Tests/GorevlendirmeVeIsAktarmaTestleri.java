package Tests;

import Methods.DaireEmsalKararSorgula;
import Methods.KararDegerlendirmeIslemleri;
import Methods.KullaniciIslemleri;
import Methods.LoginIslemleri;
import Utilities.Base;
import Utilities.BaseTest;
import Utilities.Parameters;
import org.testng.annotations.Test;

public class GorevlendirmeVeIsAktarmaTestleri extends BaseTest {

    LoginIslemleri login;
    KullaniciIslemleri kullaniciIslemleri;
    KullaniciIslemleri kullaniciBul;
    KullaniciIslemleri gorevlendirme;
    KullaniciIslemleri isAktarma;
    DaireEmsalKararSorgula daireEmsalKararSorgula;
    KararDegerlendirmeIslemleri kararAc;
    KararDegerlendirmeIslemleri incelemeyeAl;

    String firmaNo =  "";

    @Test(priority = 0, description="Sisteme Giriş ve Rol Seçme İşlemi", groups="Kullanıcı Görevlendirme ve İş Aktarma Süreçleri")
    public void Login() throws InterruptedException {
        login = new LoginIslemleri(driver);
        login.loginOl(Parameters.getEnvironmentParameters("superUser"),Parameters.getEnvironmentParameters("superPass"));
        login.rolSecAdmin();
    }

    @Test(priority = 1, description="Kullanıcı Sorgulama ve Görevlendirme İşlemi", groups="Kullanıcı Görevlendirme ve İş Aktarma Süreçleri")
    public void kullaniciIslemleri(){
        kullaniciIslemleri = new KullaniciIslemleri(driver);
        kullaniciIslemleri.kullaniciIslemleriButton();
        kullaniciIslemleri.clickYargitayTab();
        kullaniciBul.kullaniciBul("77777777777");
        gorevlendirme = new KullaniciIslemleri(driver);
        gorevlendirme.gorevlendirme();
    }
    @Test(priority = 2, description="Yim-Hakim Rolüne Geçiş İşlemi", groups="Kullanıcı Görevlendirme ve İş Aktarma Süreçleri")
    public void rolSec7() throws InterruptedException {
        login = new LoginIslemleri(driver);
        login.rolSec7();
    }

    @Test(priority = 3, description="Kullanıcı İş Aktarma İşlemi", groups="Kullanıcı Görevlendirme ve İş Aktarma Süreçleri")
    public void isAktarmaIslemleri(){
        daireEmsalKararSorgula = new DaireEmsalKararSorgula(driver);
        daireEmsalKararSorgula.daireEmsalKararIsListesiClick();
        daireEmsalKararSorgula.araButton();
        daireEmsalKararSorgula.waitProcess();
        kararAc = new KararDegerlendirmeIslemleri(driver);
        kararAc.kararAc();
        incelemeyeAl.incelemeyeAl();
        kullaniciIslemleri = new KullaniciIslemleri(driver);
        kullaniciIslemleri.kullaniciIslemleriButton();
        kullaniciBul.kullaniciBul("77777777777");
        isAktarma = new KullaniciIslemleri(driver);
        isAktarma.isAktarma();
    }

    @Test(priority = 3, description="Sistemden Çıkış İşlemi", groups="Kullanıcı Görevlendirme ve İş Aktarma Süreçleri")
    public void Logout(){
        login = new LoginIslemleri(driver);
        login.logout();
    }
}