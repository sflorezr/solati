# language: es
Característica: Pruebas funcionales al modulo agregar datos

  Esquema del escenario: : Caso cuando se digitan todos los datos
    Dado Abro aplicativo testAuto
    Y Abro modulo de agregar datos
    Cuando Digito datos del usuario codigo: "<codigo>", nombres: "<nombres>",lugarNacimiento: "<lugar_nacimiento>", fechaNacimiento: "<fecha_nacimiento>", direccion: "<direccion>", telefono: "<telefono>", puesto:"<puesto>", estado:"<estado>"
    Entonces valido respuesta "<respuesta>"

    Ejemplos:
      | codigo | nombres | lugar_nacimiento | fecha_nacimiento | direccion      | telefono | puesto        | estado | respuesta                                           |
      | 001    | prueba  | medellin         | 01-01-1991       | calle 20 bello | 4502030  | automatizador | Fijo   | Bien hecho! Los datos han sido guardados con éxito. |
