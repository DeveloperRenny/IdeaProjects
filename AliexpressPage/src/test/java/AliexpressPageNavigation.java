import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import pageobjects.AliexpressObjects;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AliexpressPageNavigation {

    public WebDriver driver;


    @BeforeEach
    public void inicio() {

        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://es.aliexpress.com/");

    }

    @AfterEach
    public void fin() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }


    @Test
    public void navigateToAliexpress() throws InterruptedException {

        AliexpressObjects aliexpressObjects = new AliexpressObjects(driver);
        aliexpressObjects.writeemergenWindows1();
        aliexpressObjects.writeemergenWindows2();
        aliexpressObjects.writesearchbar("iphone13 pro max");
        aliexpressObjects.writemagnifyingGlassIcon();
        aliexpressObjects.writeorderbutton();
        aliexpressObjects.writeproductlist();

    }


}
