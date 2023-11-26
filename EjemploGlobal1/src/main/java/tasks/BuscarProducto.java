package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static userinterfaces.HomePage.*
        ;


public class BuscarProducto implements Task{

    private String descripcion;
    //private String tipoCategoria;

    public  BuscarProducto (String descripcion){
       this.descripcion = descripcion;
       //this.tipoCategoria= tipoCategoria;

    }



    @Override
    public <T extends Actor> void performAs(T actor) {


        if (Visibility.of(BUTTON_CERRAR_VENTANA1).viewedBy(actor).asBoolean())
            actor.attemptsTo(Click.on(BUTTON_CERRAR_VENTANA1));

        actor.attemptsTo(
                Enter.theValue(descripcion).into(INPUT_BUSCAR_ARTICULO), //Diligenciar campo de búsqueda
                //SelectFromOptions.byVisibleText(tipoCategoria).from(SELECT_TIPO_CATEGORIA),
                Hit.the(Keys.ENTER).into(INPUT_BUSCAR_ARTICULO)); //Seleccionar producto a agregar
                Click.on();// Selecccionar producto a agregar

            }

    public static Performable conDescripcion(String descripcion) {
        return instrumented(BuscarProducto.class,descripcion);
    }

    }




