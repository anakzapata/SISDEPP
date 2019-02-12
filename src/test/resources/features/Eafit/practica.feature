#Author: your.email@your.domain.com

@Regresion
Feature: Contactenos Universidad EAFIT
Como estudiante
Quiero enviar un comentario a la Universidad EAFIT
A través de la pagina de contáctenos


Background: Login a la aplicacion SISDEPP
Given que un administrador quiere ingresar a SISDEPP
When el ingresa usuario "whenaoze" y clave "hola"
And selecciona el rol Administrador


@Login
Scenario: Login a la aplicacion SISDEPP
Then el muestra en pantalla el menú "Administrador"

@CargaManual
Scenario: Menú PREPRACTICA
Given que un administrador quiere verificar el menú Prepráctica
When selecciona la opción Carga de estudiantes
And selecciona la opción Carga manual
Then el ve en pantalla el mensaje "Carga Manual de Estudiante"

@Agenda
Scenario: opción Agenda  
Given que un administrador quiere verificar el menú Agenda
When el selecciona la opción Asesores
And selecciona la opción Agenda
Then el ve en pantalla el mensaje agenda "Agenda"
 