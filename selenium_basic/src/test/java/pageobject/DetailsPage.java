package pageobject;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Photographer;

public class DetailsPage {

    @FindBy(css = "div[class='ui-pdp-container__col col-1 ui-pdp-container--column-right mt-16 pr-16 ui-pdp--relative'] div[class='ui-pdp-price__second-line'] span[class='andes-visually-hidden']")
    private WebElement princeInDetails;
    @FindBy(css = "h1[class='ui-pdp-title']")
    private WebElement nameInDetail;
    private Photographer photographer;

    public DetailsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        photographer = new Photographer(driver);

    }
   @Step("obteniendo la informacion del detalle")
   @Description("Descripcion detallada")
    public ResultModel getDetailInformation() {
        photographer.takePhoto();
        ResultModel resultModel = new ResultModel();
        resultModel.setName(nameInDetail.getText());
        resultModel.setPrice(princeInDetails.getText());
        return resultModel;
    }

}
