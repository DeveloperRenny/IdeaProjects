package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Photographer;

public class HomePage {

    @FindBy(id = "cb1-edit")
    private WebElement searchBox;

    private Photographer photographer;

    public HomePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        photographer = new Photographer(driver);

    }

    @Step("Busqueda del producto")
    public void searchFor(String item) {

        photographer.takePhoto();
        searchBox.sendKeys(item);
        searchBox.sendKeys(Keys.ENTER);
    }


}
