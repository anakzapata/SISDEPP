#Author: your.email@your.domain.com

@Regresion
Feature: Contactenos Universidad EAFIT
Como estudiante
Quiero enviar un comentario a la Universidad EAFIT
A través de la pagina de contáctenos


@Login
Scenario: Login a la aplicacion SISDEPP
Given que un administrador quiere ingresar a SISDEPP
When el ingresa usuario "whenaoze" y clave "hola"
And selecciona el rol Administrador
Then el muestra en pantalla el menú "Administrador"

@CargaManual
Scenario: Menú PREPRACTICA
Given que un administrador quiere verificar el menú Prepráctica
When el selecciona el menú Prepráctica
And selecciona la opción Carga de estudiantes
And selecciona la opción Carga manual
Then el ve en pantalla el mensaje Carga Manual de Estudiante

