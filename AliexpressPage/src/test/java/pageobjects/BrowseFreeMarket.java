package pageobjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class BrowseFreeMarket {

    public WebDriver driver;


    @BeforeEach
    public void inicio() {

        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mercadolibre.com/");

    }

    @AfterEach
    public void fin() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void freemarket()throws InterruptedException{

        FreeMarketObjects freeMarketObjects = new FreeMarketObjects(driver);
        freeMarketObjects.selectcontry();
        freeMarketObjects.Writesearchbar("iphone 13 max ");
        freeMarketObjects.clicksearchbutton();
        freeMarketObjects.writeproductlist();
    }

}
