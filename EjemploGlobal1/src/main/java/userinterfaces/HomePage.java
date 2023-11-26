package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://best.aliexpress.com/")
public class HomePage extends PageObject {




    public static final Target BUTTON_CERRAR_VENTANA1 = Target.the("Botón cerrar ventana emergente").located(By.className("//img[@class=('_24EHh')]"));
    public static final Target INPUT_BUSCAR_ARTICULO = Target.the("Input donde se realizar la búsqueda").located(By.id("//input[@name=('SearchText')]"));
    public static final Target SELECT_TIPO_CATEGORIA = Target.the("Select tipo de categoría").located(By.id("a2g0o.home.category.i0.cd2870e5itThbW"));
    public static final Target BUTTON_BUSCAR_ARTICULO = Target.the("Botón buscar artículo").located(By.className("//input[@class=('search-button')]"));
    public static final Target LNK_ARTICULO_ENCONTRADO = Target.the("Link objeto encontrado").locatedBy("//a[starts-with(@title,'{0}')]");


}
