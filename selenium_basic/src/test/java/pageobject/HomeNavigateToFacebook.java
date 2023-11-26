package pageobject;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Photographer;

import static org.openqa.selenium.By.cssSelector;

public class HomeNavigateToFacebook {

    private WebDriver driver;

    private String emailLocator = "input#email";
    private String passwordLocator = "input#pass";
    private String button = "button[name='login']";
    private Photographer photographer;


    public HomeNavigateToFacebook(WebDriver driver) {
        this.driver = driver;
        photographer = new Photographer(driver);

    }
    @Step("Colocondo correo electronico")
    @Description("Coloca el Correo elctronico del Login")
    public void writeEmail(String emailText) {
        photographer.takePhoto();
        WebElement email = driver.findElement(By.cssSelector(emailLocator));
        email.sendKeys(emailText);
    }
    @Step("Coloca corro password")
    @Description("Coloca tu password")
    public void writePassword(String passwordText) {
        photographer.takePhoto();
        WebElement password = driver.findElement(By.cssSelector(passwordLocator));
        password.sendKeys(passwordText);
    }

    public void submit() {
        photographer.takePhoto();
        WebElement Submitlogin = driver.findElement(cssSelector(button));
        Submitlogin.click();
    }


}
  /*

    private Target SECURITY;
    public HomeNavigateToGoogle (Target SECURITY){
        this.SECURITY=SECURITY;
    }
       if(SECURITY==isVisible()){

    }*/