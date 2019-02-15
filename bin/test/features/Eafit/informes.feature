#Author: your.email@your.domain.com

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

#@Minformes
#Scenario: Abrir menu informes
#Then el hace clic en el menu Informes

#@CargaManual
#Scenario: Menú PREPRACTICA
#Given que un administrador quiere verificar el menú Prepráctica
#When selecciona la opción Carga de estudiantes
#And selecciona la opción Carga manual
#Then el ve en pantalla el mensaje "Carga Manual de Estudiante"

#@Agenda
#Scenario: opción Agenda  
#Given que un administrador quiere verificar el menú Agenda
#When el selecciona la opción Asesores
#And selecciona la opción Agenda
#Then el ve en pantalla el mensaje agenda "Agenda"


Scenario Outline: Verificar que un usuario pueda navegar a traves de las funcionalidades de sisdepp
When  el hace clic en el menu Informes
And hace clic en la opcion "<Opcion>"
Then el usuario visuzaliza el titulo "<Titulo>"

Examples:
	|Opcion |Titulo																										|
	|MA     |Informe Mosaico																					| # Mosaico Asesor 
	|MM     |Informe Mosaico Mentor  																	| # Mosaico Mentor
	|RP     |CONSULTAR ESTUDIANTES POR VINCULACIÓN										| # Reporte de Vinculación
	|CP	    |RESUMEN CANDIDATOS A PRÁCTICA POR CARRERA - PREPRÁCTICA  | # Candidatos Práctica
 	|IP	    |Estudiantes																							| # Idioma y Promedio
 	|S 			|Solicitudes																							| # Solicitudes
 	|EE			|ENTREVISTAS POR ESTUDIANTE																| # Entrevistas Estudiantes
 	|P			|PROCESOS POR ESTUDIANTE																	| # Procesos
 	|CE			|																													| # Consultar Evaluaciones DEPP

#@MosaicoAsesor
#Scenario:  Verificar que un usuario administrador pueda observar la pantalla de Mosaico Asesor
#Given que un usuario administrador quiere visualizar los mosaicos de los asesores
#When  hace clic en el menú "//a[@href='/sisdepp/prepractica/reportes/index.do']"
#And hace clic en la opción "Mosaico Asesor"
#Then el usuario visuzaliza el título "Informe Mosaico"

#@MosaicoMentor
#Scenario: Verificar que un usuario administrador pueda observar la pantalla de Mosaico Mentor
#Given que un usuario administrador quiere visualizar los mosaicos de los mentores
#When  hace clic en el menú "Informes"
#And hace clic en la opción "Mosaico Mentor"
#Then el usuario visuzaliza el título "Informe Mosaico Mentor"

#@ReporteVinculacion
#Scenario: Verificar que un usuario administrador pueda observar la pantalla de Reportes de Vinculación
#Given que un usuario administrador quiere visualizar los reportes de vinculación
#When  hace clic en el menú "Informes"
#And hace clic en la opción "Reporte de Vinculación"
#Then el usuario visuzaliza el título "CONSULTAR ESTUDIANTES POR VINCULACIÓN"

#@CandidatosPractica
#Scenario: Verificar que un usuario administrador pueda observar la pantalla de candidatos a prácticas
#Given que un usuario administrador quiere visualizar los candidatos a prácticas
#When  hace clic en el menú "Informes"
#And hace clic en la opción "Candidatos Práctica"
#Then el usuario visuzaliza el título "RESUMEN CANDIDATOS A PRÁCTICA POR CARRERA - PREPRÁCTICA"

#@IdiomaPromedio
#Scenario: Verificar que un usuario administrador pueda observar la pantalla de candidatos a prácticas
#Given que un usuario administrador quiere visualizar los mosaicos de asesores
#When  hace clic en el menú "Informes"
#And hace clic en la opción "Idioma y Promedio"
#Then el usuario visuzaliza el título "Estudiantes"