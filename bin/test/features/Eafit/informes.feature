
@Informes
Feature: Informes sisdepp
Como usuario administrador
Quiero verificar que todas las funcionalidades de informes estén disponibles
A través de Sisdepp.

Background: Login a la aplicacion SISDEPP
Given que un administrador quiere ingresar a SISDEPP
When el ingresa usuario "whenaoze" y clave "hola"
And selecciona el rol Administrador

@Login
Scenario: Login a la aplicacion SISDEPP
Then el muestra en pantalla el menu "Administrador"


Scenario Outline: Verificar que un usuario pueda navegar a traves de las funcionalidades de sisdepp
When  el hace clic en el menu Informes
And hace clic en la opcion "<Opcion>"
Then el usuario visuzaliza el titulo "<Titulo>"

Examples:
	|Opcion |Titulo																										|
	|MA     |Informe Mosaico																					| # Mosaico Asesor 
	|MM     |Informe Mosaico Mentor  																	| # Mosaico Mentor
	|RP     |CONSULTAR ESTUDIANTES POR VINCULACIÓN 										| # Reporte de Vinculación
	|CP	    |RESUMEN CANDIDATOS A PRÁCTICA POR CARRERA - PREPRÁCTICA	| # Candidatos Práctica
 	|IP	    |Estudiantes																							| # Idioma y Promedio
 	|S 			|Solicitudes																							| # Solicitudes
 	|EE			|ENTREVISTAS POR ESTUDIANTE																| # Entrevistas Estudiantes
 	|P			|PROCESOS POR ESTUDIANTE																	| # Procesos
