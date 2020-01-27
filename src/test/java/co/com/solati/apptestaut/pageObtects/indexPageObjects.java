package co.com.solati.apptestaut.pageObtects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost/apptestaut/index.php")
public class indexPageObjects extends PageObject {

    @FindBy(xpath="//*[@id='navbar']/ul/li[2]/a")
    WebElementFacade btnAgregarDatos;

    public void clicAgregarDatos(){
        btnAgregarDatos.click();
    }
}
