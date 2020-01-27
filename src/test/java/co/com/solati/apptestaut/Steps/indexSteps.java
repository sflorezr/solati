package co.com.solati.apptestaut.Steps;

import co.com.solati.apptestaut.pageObtects.indexPageObjects;
import net.thucydides.core.annotations.Step;

public class indexSteps {
    indexPageObjects index;

    @Step
    public void abrirTestAut(){
        index.open();
    }

    @Step
    public void abrirAgregarDatos(){
        index.clicAgregarDatos();
    }
}
