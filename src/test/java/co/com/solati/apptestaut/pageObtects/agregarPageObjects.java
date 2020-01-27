package co.com.solati.apptestaut.pageObtects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class agregarPageObjects extends PageObject {
    @FindBy(xpath="//input[@name='codigo']")
    WebElementFacade txtCodigo;

    @FindBy(xpath="//input[@name='nombres']")
    WebElementFacade txtNombres;

    @FindBy(xpath="//input[@name='lugar_nacimiento']")
    WebElementFacade txtLugarNacimiento;

    @FindBy(xpath="//input[@name='fecha_nacimiento']")
    WebElementFacade txtFechaNacimiento;

    @FindBy(xpath="//textarea[@name='direccion']")
    WebElementFacade txtDireccion;

    @FindBy(xpath="//input[@name='telefono']")
    WebElementFacade txtTelefono;

    @FindBy(xpath="//input[@name='puesto']")
    WebElementFacade txtPuesto;

    @FindBy(xpath="//select[@name='estado']")
    WebElementFacade selectEstado;

    @FindBy(xpath="//*[@class='alert alert-success alert-dismissable']")
    WebElementFacade lblRespuesta;

    @FindBy(xpath="//input[@name='add']")
    WebElementFacade btnGuardar;

    public void digitarCodigo(String codigo){
        if (!codigo.equals("")){
            txtCodigo.type(codigo);
        }
    }

    public void digitarNombres(String nombres){
        if (!nombres.equals("")){
            txtNombres.type(nombres);
        }
    }

    public void digitarLugarNacmiento(String lugar){
        if (!lugar.equals("")){
            txtLugarNacimiento.type(lugar);
        }
    }

    public void digitarFechaNacmiento(String fecha){
        if (!fecha.equals("")){
            txtFechaNacimiento.type(fecha);
        }
    }

    public void digitarDireccion(String direccion){
        if (!direccion.equals("")){
            txtDireccion.type(direccion);
        }
    }

    public void digitarTelefono(String telefono){
        if (!telefono.equals("")){
            txtTelefono.type(telefono);
        }
    }

    public void digitarPuesto(String puesto){
        if (!puesto.equals("")){
            txtPuesto.type(puesto);
        }
    }

    public void seleccionarEstado(String estado){
        if (!estado.equals("")){
            selectEstado.selectByVisibleText(estado);
        }
    }

    public void validarRespuesta(String respuesta){
        assertThat(respuesta, containsString(lblRespuesta.getText()));
    }

    public void guardar(){
        btnGuardar.click();
    }
}
