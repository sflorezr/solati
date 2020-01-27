package co.com.solati.apptestaut.Steps;

import co.com.solati.apptestaut.pageObtects.agregarPageObjects;
import net.thucydides.core.annotations.Step;

public class agregarDatosSteps {

    agregarPageObjects agregarPageObjects;
    @Step
    public void agregarDatos(String codigo,String nombres,String lugarNacimiento,String fechaNacimiento,String direccion,String telefono,String puesto,String estado){
        agregarPageObjects.digitarCodigo(codigo);
        agregarPageObjects.digitarNombres(nombres);
        agregarPageObjects.digitarLugarNacmiento(lugarNacimiento);
        agregarPageObjects.digitarFechaNacmiento(fechaNacimiento);
        agregarPageObjects.digitarDireccion(direccion);
        agregarPageObjects.digitarTelefono(telefono);
        agregarPageObjects.digitarPuesto(puesto);
        agregarPageObjects.seleccionarEstado(estado);
        agregarPageObjects.guardar();
    }
    @Step
    public void validarRespuesta(String respuesta){
        agregarPageObjects.validarRespuesta(respuesta);
    }
}
