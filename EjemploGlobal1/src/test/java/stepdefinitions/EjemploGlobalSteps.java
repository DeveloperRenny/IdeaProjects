package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.aspectj.apache.bcel.classfile.Module;
import org.openqa.selenium.WebDriver;
import tasks.AgregarProducto;
import tasks.BuscarProducto;
import userinterfaces.HomePage;

import java.util.List;

public class EjemploGlobalSteps {


    @Managed(driver = "chrome")
    private WebDriver navegador;

    private Actor actor = Actor.named("Renny Gonzalez");

    private HomePage homePage = new HomePage();
    private String cantidad;

    @Given("^que un nuevo cliente accede hasta la web de compras$")
    public void queUnNuevoClienteAccedeHastaLaWebDeCompras() {
         actor.can(BrowseTheWeb.with(navegador));
         actor.wasAbleTo(Open.browserOn(homePage));
    }


    @When("^el agrega (.*)unidades de(.*) al carro$")
    public void elAgregaUnProductosAlCarro(String descripcion) {
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(descripcion),
                AgregarProducto.cantidad(cantidad)
        );
    }

    @Then("^el ve los productos listado en el carro de compras$")
    public void elVeLosProductosListadoEnElCarroDeCompras() {

    }

    @When("^el agrega productos al carro$")
    public void elAgregaProductosAlCarro(List<String> datos) {

    }

}
