#Author: your.email@your.domain.com

@Regresion
Feature: SISDEPP


Background: Login a la aplicacion SISDEPP
Given que un administrador quiere ingresar a SISDEPP
When el ingresa usuario "whenaoze" y clave "hola"
And selecciona el rol Administrador


@Login
Scenario: Login a la aplicacion SISDEPP
Then el muestra en pantalla el menu "Administrador"
And el ve el mensaje "Bienvenido(a) Willy Henao Zea"


@CargaManual
Scenario: Opcion Carga Manual estudiantes
Given que un administrador quiere verificar el menu Prepractica
When selecciona la opcion Carga de estudiantes
And selecciona la opcion Carga manual
Then el ve en pantalla el mensaje "Carga Manual de Estudiante"

@Agenda
Scenario: opcion Agenda  
Given que un administrador quiere verificar el menu Agenda
When el selecciona la opcion Asesores
And selecciona la opcion Agenda
Then el ve en pantalla el mensaje agenda "Agenda"
 
 @ModificarAsesor
Scenario: Modificar Asesor 
Given que un administrador quiere verificar el menu Modificar Asesor
When  selecciona la opcion Asesores
And selecciona la opcion Modificar Asesor
Then el ve en pantalla el mensaje Asesores "Asesores"

@RegistrarAsesor
Scenario: Opcion Registrar Asesor 
Given que un administrador quiere verificar el menu Registrar Asesor
When selecciona la opcion Asesores
And selecciona la opcion Registrar Asesor
Then el ve en pantalla el mensaje Registrar Asesor "Registro Asesor"

