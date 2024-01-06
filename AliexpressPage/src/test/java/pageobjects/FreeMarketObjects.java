package pageobjects;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class FreeMarketObjects {

    private WebDriver driver;
    private Wait wait;

    @FindBy(css = "a[id=CO]")
    private WebElement contryselect;


    @FindBy(css = "input[id='cb1-edit']")
    private WebElement searchbar;

    @FindBy(css = "div[class='nav-icon-search']")
    private WebElement searchbutton;

    @FindBy(css = "ol[class*='ui-search-layout'] li")
    private List<WebElement> itemlist;


    private String productdescription = "div[class='ui-search-item__group ui-search-item__group--title']";

    private String priceoftheproduct = "div[class='ui-search-price__second-line']";

    private String productdescription2 = "h2";

    private String nameDetails = "h1[class='ui-pdp-title']";

    private String priceDetails = "span[class='andes-money-amount ui-pdp-price__part andes-money-amount--cents-superscript andes-money-amount--compact']";

    public FreeMarketObjects(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, 5L);
        PageFactory.initElements(driver, this);
    }

    public void selectcontry() {
        contryselect.click();
    }





    public void Writesearchbar(String Productname) {
        searchbar.sendKeys(Productname);
    }

    public void clicksearchbutton() {
        searchbutton.click();
    }

    public void writeproductlist() {

        List<WebElement> results = itemlist;

        Random random = new Random();
        WebElement randomElement = results.get(random.nextInt(results.size()));


        System.out.println(" el numero de productos hallados es: " + results.size());
        By Productdescription = By.cssSelector(productdescription);
        By Priceoftheproduct = By.cssSelector(priceoftheproduct);
        wait = new WebDriverWait(driver, 20L);

        for (WebElement result : results) {
            System.out.println("________________________");
            System.out.println(" La descripcion del producto es: " + result.findElement(Productdescription).getText());
            System.out.println(" el precio del producto es " + result.findElement(Priceoftheproduct).getText());
            System.out.println("________________________");
        }
        String expectedPrice = randomElement.findElement(By.cssSelector(productdescription)).getText();
        String expectedDescription = randomElement.findElement(By.cssSelector(priceoftheproduct)).getText();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", randomElement);

        randomElement.findElement(By.cssSelector(productdescription2)).click();

        By nameInDetailBy = By.cssSelector(nameDetails);
        By priceInDetailBy = By.cssSelector(priceDetails);

        String priceactual = driver.findElement(nameInDetailBy).getText();
        String actualDescription = driver.findElement(priceInDetailBy).getText();

        Assertions.assertAll(
                () -> Assertions.assertEquals(expectedDescription, actualDescription, "the description is not the same"),
                () -> Assertions.assertEquals(expectedPrice, priceactual, "price don't match")

        );

    }
}
