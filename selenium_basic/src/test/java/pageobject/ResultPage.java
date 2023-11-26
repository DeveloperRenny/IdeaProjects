package pageobject;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class ResultPage {

    private WebDriver driver;

    @FindBy(css = "ol[class*='ui-search-layout ui-search-layout--stack'] li")
    private List<WebElement> results;

    private By price = By.cssSelector("div[class='ui-search-result__wrapper'] div[class='ui-search-result__content-column ui-search-result__content-column--left'] span[class='andes-money-amount ui-search-price__part ui-search-price__part--medium andes-money-amount--cents-superscript'] span[class='andes-money-amount__fraction']");

    private By name = By.tagName("h2");

    public ResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //driver.findElements(cssSelector("ol[class*='ui-search-layout ui-search-layout--stack'] li"));
    @Step("Obteniendo item aleatorio")

    @Description("Resultado Aleatorio")

    public WebElement getRandomResult() {

        Random rand = new Random();
        WebElement ramdomElememt = results.get(rand.nextInt(results.size()));
        return ramdomElememt;
    }

    @Step("Seleccion aleatoria de uno de los item")

    @Description("Seleccion aleatoria de un Item")
    public ResultModel clickOnRandomItem() {

        WebElement ramdomElememt = getRandomResult();

        ResultModel expectedResultModel = new ResultModel();
        expectedResultModel.setName(ramdomElememt.findElement(name).getText());
        expectedResultModel.setPrice(ramdomElememt.findElement(price).getText());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", ramdomElememt);
        ramdomElememt.findElement(name).click();
        return expectedResultModel;
    }


}
