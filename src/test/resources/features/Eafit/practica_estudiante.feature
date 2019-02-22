#Author: your.email@your.domain.com

@Estudiante
Feature: SISDEPP


Background: Login a la aplicacion SISDEPP
Given que un administrador quiere ingresar a SISDEPP
When el ingresa usuario "avalen45" y clave "hola"

@Login
Scenario: Login a la aplicacion SISDEPP

@ComprobarPantallaInfoPersonal
Scenario: Menu PREPRACTICA
Given que un estudiante quiere verificar el menu Prepractica
When selecciona la opcion Hojas de Vida
And selecciona la opcion Diligenciar Hoja de Vida
Then se ve en pantalla el mensaje "INFORMACIÓN PERSONAL"


@ComprobarPantallaInfoAcademica
Scenario: Menu PREPRACTICA Info Acad
Given que un estudiante quiere verificar el menu Prepractica
When selecciona la opcion Hojas de Vida
And selecciona la opcion Diligenciar Hoja de Vida
And selecciona la opcion Informacion Academica
Then se ve en pantalla el mensaje de Info Acad "INFORMACIÓN ACADÉMICA"

@ComprobarPantallaExperienciaLaboral
Scenario: Menu PREPRACTICA Exper Laboral
Given que un estudiante quiere verificar el menu Prepractica
When selecciona la opcion Hojas de Vida
And selecciona la opcion Diligenciar Hoja de Vida
And selecciona la opcion Experiencia Laboral
Then se ve en pantalla el mensaje "EXPERIENCIA LABORAL"

@ComprobarPantallaFormacion
Scenario: Menu PREPRACTICA Formacion
Given que un estudiante quiere verificar el menu Prepractica
When selecciona la opcion Hojas de Vida
And selecciona la opcion Diligenciar Hoja de Vida
And selecciona la opcion Formacion y Habilidades Complementarias
Then se ve en pantalla el mensaje "COMPETENCIAS"


@ComprobarPantallaOtrasActividades
Scenario: Menu PREPRACTICA Otras Actividades
Given que un estudiante quiere verificar el menu Prepractica
When selecciona la opcion Hojas de Vida
And selecciona la opcion Diligenciar Hoja de Vida
And selecciona la opcion Otras Actividades
Then se ve en pantalla el mensaje "OTRAS ACTIVIDADES"


@ComprobarPantallaReferenciasPersonales
Scenario: Menu PREPRACTICA Referencias Personales
Given que un estudiante quiere verificar el menu Prepractica
When selecciona la opcion Hojas de Vida
And selecciona la opcion Diligenciar Hoja de Vida
And selecciona la opcion Referencias Personales
Then se ve en pantalla el mensaje "REFERENCIAS PERSONALES"