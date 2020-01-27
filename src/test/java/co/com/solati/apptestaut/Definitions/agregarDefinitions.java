package co.com.solati.apptestaut.Definitions;

import co.com.solati.apptestaut.Steps.agregarDatosSteps;
import co.com.solati.apptestaut.Steps.indexSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class agregarDefinitions {
    @Steps
    agregarDatosSteps agregarDatosSteps;

    @Steps
    indexSteps index;
    @Dado("^Abro aplicativo testAuto$")
    public void abro_aplicativo_testAuto()  {
        index.abrirTestAut();
    }

    @Dado("^Abro modulo de agregar datos$")
    public void abro_modulo_de_agregar_datos()  {

        index.abrirAgregarDatos();
    }

    @Cuando("^Digito datos del usuario codigo: \"([^\"]*)\", nombres: \"([^\"]*)\",lugarNacimiento: \"([^\"]*)\", fechaNacimiento: \"([^\"]*)\", direccion: \"([^\"]*)\", telefono: \"([^\"]*)\", puesto:\"([^\"]*)\", estado:\"([^\"]*)\"$")
    public void digito_datos_del_usuario_codigo_nombres_lugarNacimiento_fechaNacimiento_direccion_telefono_puesto_estado(String codigo, String nombres, String lugarNacimiento, String fechaNacimiento, String direccion, String telefono, String puesto, String estado)  {
        agregarDatosSteps.agregarDatos(codigo,nombres,lugarNacimiento,fechaNacimiento,direccion,telefono,puesto,estado);
    }

    @Entonces("^valido respuesta \"([^\"]*)\"$")
    public void valido_respuesta(String respuesta)  {
        agregarDatosSteps.validarRespuesta(respuesta);
    }


}
