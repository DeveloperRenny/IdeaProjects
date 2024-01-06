package pageobjects;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;


public class AliexpressObjects {

    private WebDriver driver;
    private Wait wait;

    @FindBy(css = "img.pop-close-btn")
    private WebElement EmergenWindow1Locator;

    @FindBy(css = "img._24EHh")
    private WebElement EmergenWindow2Locator;

    @FindBy(css = "input.search--keyword--15P08Ji")
    private WebElement searchbarLocator;

    @FindBy(css = "input.search--submit--2VTbd-T")
    private WebElement magnifyingGlassIconLocator;

    @FindBy(xpath = "//div[@ae_object_value='number_of_orders']")
    private WebElement orderbutton;

    @FindBy(xpath = "//div[@id='card-list']/")
    private List<WebElement> productlist;

    @FindBy(xpath = "//h1[@class='multi--titleText--nXeOvyr']")
    private List<WebElement> Productdescription;

    private String Priceoftheproduct = "div[class='list--galleryWrapper--29HRJT4']";

    private String productdescription = "h1";

    private String priceoftheproduct = "div[class='multi--price-sale--U-S0jtj']";

    private String productdescription2 = "h1";

    private String nameDetails ="h1";

    private String priceDetails= "//div[@class='pdp-info-right']//div[@class='es--wrap--erdmPRe notranslate']";

    public AliexpressObjects(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, 5L);
        PageFactory.initElements(driver, this);
    }

    public void writeemergenWindows1() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img.pop-close-btn")));
        //WebElement EmergenWindow1 = driver.findElement(By.cssSelector(EmergenWindow1Locator));
        EmergenWindow1Locator.click();
    }

    public void writeemergenWindows2() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img._24EHh")));
        //WebElement EmergenWindow2 = driver.findElement(By.cssSelector(EmergenWindow2Locator));
        EmergenWindow2Locator.click();
    }


    public void writesearchbar(String Productname) {

        //WebElement searchbar = driver.findElement(By.cssSelector(searchbarLocator));
        searchbarLocator.sendKeys(Productname);

    }

    public void writemagnifyingGlassIcon() {

        //WebElement magnifyingGlassIcon = driver.findElement(By.cssSelector(magnifyingGlassIconLocator));
        magnifyingGlassIconLocator.click();

    }

    public void writeorderbutton() {
        orderbutton.click();
    }

    public void writeproductlist() {

        List<WebElement> results = driver.findElements(By.cssSelector(Priceoftheproduct));

        Random random = new Random();
        WebElement randomElement = results.get(random.nextInt(results.size()));

        System.out.println(" Los Productos mas pedidos son: " + results.size());

        By Productdescription = By.cssSelector(productdescription);
        By Priceoftheproduct = By.cssSelector(priceoftheproduct);
        wait = new WebDriverWait(driver, 20L);

        for (WebElement result : results) {
            System.out.println("________________________");
            System.out.println(" La descripcion del producto es: " + result.findElement(Productdescription).getText());
            System.out.println(" El precio del producto es: " + result.findElement(Priceoftheproduct).getText());
            System.out.println("________________________");
        }
        String expectedPrice = randomElement.findElement(By.cssSelector(priceoftheproduct)).getText();
        String expectedDescription = randomElement.findElement(By.cssSelector(productdescription)).getText();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", randomElement);

        randomElement.findElement(By.cssSelector(productdescription2)).click();

        By nameInDetailBy = By.cssSelector(nameDetails);
        By priceInDetailBy = By.xpath(priceDetails);
        wait = new WebDriverWait(driver, 5L);

        String actualDescription = driver.findElement(nameInDetailBy).getText();
        //String priceactual = driver.findElement(priceInDetailBy).getText();


        Assertions.assertAll(
                () -> Assertions.assertEquals(expectedDescription, actualDescription, "the description is not the same")
                //() -> Assertions.assertEquals(expectedPrice, priceactual, "price don't match")

        );


    }


}
