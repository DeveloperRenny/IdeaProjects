package pageobject;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Photographer;

import java.time.Duration;

public class HomeADR {

    private WebDriver driver;
    private Photographer photographer;

    @FindBy(xpath = "//*[@id=\"formRegistro\"]/div[5]/div/div[1]/div/span")
    private WebElement CustomerPerson;
    @FindBy(xpath = "//input[@id=\"TextPrimerNombre\"]")
    private WebElement YourFirstName;
    @FindBy(xpath = "//input[@id=\"TextSegundoNombre\"]")
    private WebElement YourMiddleName;
    @FindBy(xpath = "//input[@id=\"TextApellido\"]")
    private WebElement YourFirstLastName;
    @FindBy(xpath = "//input[@id=\"TextSegundoApellido\"]")
    private WebElement YourSecondLastName;
    @FindBy(xpath = "//input[@id=\"TextEmail\"]")
    private WebElement PutYourEmail;
    @FindBy(xpath = "//input[@id=\"TextNickName\"]")
    private WebElement CreateNickName;
    @FindBy(xpath = "//input[@id=\"txtPassword\"]")
    private WebElement EnterYourPassword;
    @FindBy(xpath = "//input[@id=\"TextRepetirPass\"]")
    private WebElement RepeatYourPassword;
    @FindBy(xpath = "//input[@id=\"CbxPolitica\"]")
    private WebElement CbxPolitica;
    @FindBy(xpath = "//input[@id=\"BtRegistro\"]")
    private WebElement BtRegistro;


    public HomeADR(WebDriver driver) {

        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        PageFactory.initElements(driver, this);
        photographer = new Photographer(driver);

    }

    @Step("registrar datos")
    @Description("escribiendo datos personales")
    public void writecustomerPerson() {
        photographer.takePhoto();
        WebElement customerPerson;

    }

    @Step("registrar datos")
    @Description("escribiendo primer nombre")
    public void writeEnterYourFirstName(String primerNombre) {
        photographer.takePhoto();
        //WebElement enterYourFirstName = driver.findElement(By.xpath(YourFirstName));
        YourFirstName.sendKeys(primerNombre);
        photographer.takePhoto();
    }

    @Step("registrar datos")
    @Description("escribiendo segundo nombre")
    public void writeEnterYourMiddleName(String segundoNombre) {
        photographer.takePhoto();
        //WebElement enterYourMiddleName = driver.findElement(By.xpath(YourMiddleName));
        YourMiddleName.sendKeys(segundoNombre);
        photographer.takePhoto();
    }

    @Step("registrar datos")
    @Description("escribiendo primer apellido")
    public void writeEnterYourFirstLastName(String primerApellido) {
        photographer.takePhoto();
        //WebElement enterYourFirstLastName = driver.findElement(By.xpath(YourFirstLastName));
        YourFirstLastName.sendKeys(primerApellido);
        photographer.takePhoto();
    }

    @Step("registrar datos")
    @Description("escribiendo segundoApellido")
    public void writeputYourSecondLastName(String segundoApellido) {
        photographer.takePhoto();
        //WebElement putYourSecondLastName = driver.findElement(By.xpath(YourSecondLastName));
        YourSecondLastName.sendKeys(segundoApellido);
        photographer.takePhoto();
    }

    @Step("registrar datos")
    @Description("escribiendo correo electronico")
    public void writeputYourEmail(String correo) {

        photographer.takePhoto();
        //WebElement putYourEmail = driver.findElement(By.xpath(PutYourEmail));
        PutYourEmail.sendKeys(correo);
        photographer.takePhoto();
    }

    @Step("registrar datos")
    @Description("escribiendo seudonimo")
    public void writecreateNickName(String seudonimo) {
        photographer.takePhoto();
        //WebElement createNickName = driver.findElement(By.xpath(CreateNickName));
        CreateNickName.sendKeys(seudonimo);
        photographer.takePhoto();
    }

    @Step("registrar datos")
    @Description("escribiendo contrasena")
    public void writeEnterYourPassword(String contrasena) {
        photographer.takePhoto();
        //WebElement enterYourPassword = driver.findElement(By.xpath(EnterYourPassword));
        EnterYourPassword.sendKeys(contrasena);
        photographer.takePhoto();

    }

    @Step("registrar datos")
    @Description("repitiendo contrasena")
    public void writerepeatYourPassword(String repiteContrasena) {
        photographer.takePhoto();
        //WebElement repeatYourPassword = driver.findElement(By.xpath(RepeatYourPassword));
        RepeatYourPassword.sendKeys(repiteContrasena);
        photographer.takePhoto();
    }

    @Step("registrar datos")
    @Description("aceptando politicas")
    public void writecbxPolitica() {
        photographer.takePhoto();
        //WebElement cbxPolitica = driver.findElement(By.xpath(CbxPolitica));
        CbxPolitica.click();
        photographer.takePhoto();

    }

    @Step("registrar datos")
    @Description("aceptando registro")
    public void writebtRegistro() {
        photographer.takePhoto();
        //WebElement btRegistro = driver.findElement(By.xpath(BtRegistro));
        BtRegistro.click();
        photographer.takePhoto();
    }


}
