import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobject.*;

public class NavigationTest extends BaseWebTest {



    @Test
    public void navigateToGoogle() throws InterruptedException {


        driver.get("https://www.facebook.com");

        HomeNavigateToFacebook homeNavigatetofacebook = new HomeNavigateToFacebook(driver);
        homeNavigatetofacebook.writeEmail("rennyjoseg@hotmail.com");
        homeNavigatetofacebook.writePassword("password");
        homeNavigatetofacebook.submit();
        Thread.sleep(30000);

    }
    /*
    @Test
    public void navigateToColombia() throws InterruptedException {

        driver.get("https://www.mercadolibre.com/");

        driver.findElement(xpath("//nav/ul/li/a[@id='CO']")).click();

        String currenUrl = driver.getCurrentUrl();

        String expectedUrl = "https://www.mercadolibre.com.co/#from=homecom";

        assertTrue(currenUrl.contains(expectedUrl), "se esperaba que contenga" + expectedUrl + "pero se obtuvo" + currenUrl);


    }

    @Test

    public void workWithSelects() throws InterruptedException {


        driver.get("https://claro-promociones.co");

        driver.findElement(xpath("//*[@id=\"departamento-select\"]"));
        driver.findElement(xpath("//*[@id=\"departamento-select\"]/option[6]"));


    }

    @Test

    public void workWithSelects2() {

        driver.get("https://www.sisben.gov.co/Paginas/consulta-tu-grupo.aspx");

        //driver.findElement(xpath("//*[@id=\"TipoID\"]"));
        //driver.findElement(xpath("//*[@id=\"TipoID\"]/option[4]"));
        driver.findElements(By.xpath("//*[@id=\"TipoID\"]"));
        driver.findElements(By.xpath("//*[@id=\"TipoID\"]/option[4]"));


    }

    @Test

    public void implicitWaitExample() {

        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));

        Instant start = Instant.now();

        try {
            driver.findElement(By.id("algo que no es "));

        } catch (Exception exc) {
            Instant end = Instant.now();
            Duration timeElapsed = Duration.between(start, end);
            System.out.println("**********");
            System.out.println(" time 1: " + timeElapsed.getSeconds() + "seconds");
            System.out.println("**********");
        }

        start = Instant.now();

        try {
            driver.findElement(By.id("algo que no es 2"));

        } catch (Exception exc) {
            Instant end = Instant.now();
            Duration timeElapsed = Duration.between(start, end);
            System.out.println("**********");
            System.out.println(" time 2: " + timeElapsed.getSeconds() + "seconds");
            System.out.println("**********");
        }


    }

    @Test

    public void defaultImplicitWait() {

        driver.get("https://www.google.com");

        Instant start = Instant.now();

        try {
            driver.findElement(By.id("algo que no es "));

        } catch (Exception exc) {
            Instant end = Instant.now();
            Duration timeElapsed = Duration.between(start, end);
            System.out.println("**********");
            System.out.println(" time 1: " + timeElapsed.getSeconds() + "seconds");
            System.out.println("**********");


        }

    }

    @Test

    public void explicitWaitExample() {

        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));

        Instant start = Instant.now();

        try {
            driver.findElement(By.id("algo que no es "));

        } catch (Exception exc) {
            Instant end = Instant.now();
            Duration timeElapsed = Duration.between(start, end);
            System.out.println("**********");
            System.out.println(" time 1: " + timeElapsed.getSeconds() + "seconds");
            System.out.println("**********");
        }
        Instant start2 = Instant.now();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5L));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Algo4")));

        } catch (Exception exc) {
            Instant end = Instant.now();
            Duration timeElapsed = Duration.between(start2, end);
            System.out.println("**********");
            System.out.println(" time 1: " + timeElapsed.getSeconds() + "seconds");
            System.out.println("**********");
        }
    }

    @Test
    @Disabled

    public void explicitWaitExample4() {

        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);

        Instant start3 = Instant.now();

        try {
            driver.findElement(By.id("algo que no es "));

        } catch (Exception exc) {
            Instant end = Instant.now();
            Duration timeElapsed = Duration.between(start3, end);
            System.out.println("**********");
            System.out.println(" time 1: " + timeElapsed.getSeconds() + "seconds");
            System.out.println("**********");
        }
        Instant start4 = Instant.now();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5L));

        try {
            wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("Algo4")));

        } catch (Exception exc) {
            Instant end = Instant.now();
            Duration timeElapsed = Duration.between(start4, end);
            System.out.println("**********");
            System.out.println(" time 1: " + timeElapsed.getSeconds() + "seconds");
            System.out.println("**********");
        }
    }

    @Test

    public void explicitWaitExample5() {

        driver.get("https://www.google.com");


        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5L));

        wait3.until(ExpectedConditions.presenceOfElementLocated(By.id("Algo4")));


    }


    @Test

    public void fluentWaitExample() {


        driver.get("https://www.google.com");

        FluentWait fluentWait = new FluentWait(driver);

        fluentWait.withTimeout(Duration.ofSeconds(10L));
        fluentWait.pollingEvery(Duration.ofSeconds(2L));

        fluentWait.ignoring(NoSuchElementException.class);

        Instant start4 = Instant.now();

        try {
            fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.id("algo")));

        } catch (Exception ex) {
            System.out.println("***exception***" + ex.getMessage());
            Instant end = Instant.now();
            Duration timeElapsed = Duration.between(start4, end);
            System.out.println("**********");
            System.out.println(" time : " + timeElapsed.getSeconds() + "seconds");
            System.out.println("**********");

        }


    }*/

    @Test

    public void userRegisterADR() {

        driver.navigate().to("https://perfildeproyectos.adr.gov.co/Registro.aspx");

        HomeADR homeadr = new HomeADR(driver);
        homeadr.writecustomerPerson();
        homeadr.writeEnterYourFirstName("Jose");
        homeadr.writeEnterYourMiddleName("Mijares");
        homeadr.writeEnterYourFirstLastName("talabera");
        homeadr.writeputYourSecondLastName("Zapata");
        homeadr.writeputYourEmail("nexuzoidouwa-1377@yopmail.com");
        homeadr.writecreateNickName("TalaberaJose");
        homeadr.writeEnterYourPassword("0901MJL");
        homeadr.writerepeatYourPassword("0901MJL");
        homeadr.writecbxPolitica();
        homeadr.writebtRegistro();
    }
    /*
    @Test

    @Description("Busqueda de items para Buscar  iphone")

    public void getElementTest2() {

        driver.get("https://www.mercadolibre.com.co");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));


        WebElement searchBox = driver.findElement(By.id("cb1-edit"));
        searchBox.sendKeys("iphone");
        searchBox.sendKeys(Keys.ENTER);


        List<WebElement> results =
                driver.findElements(cssSelector("ol[class*='ui-search-layout ui-search-layout--stack'] li"));

        System.out.println("El numero es: " + results.size());
        By priceBy = cssSelector("div[class='ui-search-result__wrapper'] span[class='andes-money-amount ui-search-price__part ui-search-price__part--medium andes-money-amount--cents-superscript']");
        By nameBy = cssSelector("h2");

        for (WebElement result : results) {
            System.out.println("_______________");
            System.out.println(" el precio es: " + result.findElement(priceBy).getText());
            System.out.println(" el nombre es: " + result.findElement(nameBy).getText());
            System.out.println("_______________");
        }
    }

    @Test
    @Description("Busqueda de items para preguntar Kit de Pessas")
    public void getElementTest() {

        driver.get("https://www.mercadolibre.com.co");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));

        WebElement searchBox = driver.findElement(By.id("cb1-edit"));
        searchBox.sendKeys("kit de pesas");
        searchBox.sendKeys(Keys.ENTER);


        List<WebElement> results =
                driver.findElements(cssSelector("ol[class*='ui-search-layout ui-search-layout--stack'] li"));

        System.out.println("El numero es: " + results.size());
        By priceBy = By.cssSelector("div[class='ui-search-result__wrapper'] span[class='andes-money-amount ui-search-price__part ui-search-price__part--medium andes-money-amount--cents-superscript']");
        By nameBy = By.cssSelector("h2");

        for (WebElement result : results) {
            System.out.println("_______________");
            System.out.println(" el precio es: " + result.findElement(priceBy).getText());
            System.out.println(" el nombre es: " + result.findElement(nameBy).getText());
            System.out.println("_______________");
        }
    }*/

    @Test

    public void getElementMercadoLibre() {

        HomePage homepage = new HomePage(driver);

        homepage.searchFor("kit de pesas");


        ResultPage resultsPage = new ResultPage(driver);
        ResultModel expectedResultModel = resultsPage.clickOnRandomItem();

        DetailsPage datailsPage = new DetailsPage(driver);
        ResultModel actualResultModel = datailsPage.getDetailInformation();

        Assertions.assertAll(
                () -> Assertions.assertEquals(expectedResultModel.getPrice(), actualResultModel.getPrice(), "prices dont'n match"),
                () -> Assertions.assertEquals(expectedResultModel.getName(), actualResultModel.getName(), "product names dont'n match")


        );
    }


}