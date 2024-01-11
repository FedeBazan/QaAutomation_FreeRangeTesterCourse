package pages;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;



    static {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver-win64/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public BasePage(WebDriver driver) {
        BasePage.driver=driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    private WebElement find(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void clickElement(By locator){
        find(locator).click();
    }

    public void write(By locator, String testWrite){
        find(locator).clear();
        find(locator).sendKeys(testWrite);
    }

}
