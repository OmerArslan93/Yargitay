package Utilities;

import Pages.DaireEmsalKararPage;
import Pages.YimEmsalKararPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.Random;
import java.util.function.Function;


public class Base {

    public static WebDriver driver;

    public Base(WebDriver driver) {
        Base.driver = driver;
    }
    public static void fluentWait(By locator) {
        // Belirtilen süre içinde kontrol ederek bekleme yapılıyor.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10L))
                .pollingEvery(Duration.ofSeconds(1L))
                .ignoring(NoSuchElementException.class);
        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
    }

    public static WebElement find(By locator) {
        return driver.findElement(locator);
    }
    public static String getEsasNo(){
        String esasNoFull = getText(DaireEmsalKararPage.esasNoAl());;
        int ksayi = esasNoFull.length();
        String esasNo = esasNoFull.substring(5, ksayi);
        System.out.println(esasNo);
        return esasNo;
    }
    public static String getEsasYil(){
        String esasNoFull = getText(DaireEmsalKararPage.esasNoAl());;
        String esasYil = esasNoFull.substring(0, 4);
        System.out.println(esasYil);
        return esasYil;
    }
    public static String getYimEmsalEsasNo(){
        String esasNoFull = getText(YimEmsalKararPage.esasNoAl());;
        int ksayi = esasNoFull.length();
        String esasNo = esasNoFull.substring(5, ksayi);
        System.out.println(esasNo);
        return esasNo;
    }
    public static String getYimEmsalEsasYil(){
        String esasNoFull = getText(YimEmsalKararPage.esasNoAl());;
        String esasYil = esasNoFull.substring(0, 4);
        System.out.println(esasYil);
        return esasYil;
    }
    public static int getRandomValue() {
        Random random = new Random();
        return random.ints(1000, 9999)
                .findFirst()
                .getAsInt();
    }
    public void type(By locator, String text) {
        find(locator).sendKeys(text);
    }
    public static String getText(By locator) {
        return find(locator).getText();
    }
    public Boolean isDisplayed(By locator) {
        return find(locator).isDisplayed();
    }
    public void click(By locator) {
        find(locator).click();
    }
    public void waitProcess() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void waitProcess(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static Boolean checkElementExisting(By locator) {

        Boolean dsd = Boolean.FALSE;
        try {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(2))
                    .pollingEvery(Duration.ofSeconds(1))
                    //.ignoring(NoSuchElementException.class);
                    .ignoring(WebDriverException.class);
            WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(locator);
                }
            });
            return true;
        } catch (WebDriverException e) {
            //e.printStackTrace();
            return false;
        }
    }

}