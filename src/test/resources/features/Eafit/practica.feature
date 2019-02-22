#Author: your.email@your.domain.com
@Regresion
Feature: Aplicacion Sisdepp
  Como estudiante
  Quiero navegar en la aplicacion
  A través de la pagina de sisdepp


Background: 
	  Given que un administrador quiere ingresar a SISDEPP y Probar el Modulo de Practica
    When el ingresa usuario "whenaoze" y clave "hola"
		And selecciona el rol Administrador
		 And el selecciona el menu Practica	
		

  Scenario: Menu Practica Actualizacion Datos Basicos.
  	When selecciona la opcion Actualizacion Datos Basicos
 	  Then el ve en la aplicacion el mensaje "Mentores"
 	  
 	  
 	Scenario: Menu Practica Reporte Vinculacion.
	 	When Escoje Reporte de Vinculacion
		Then el visualiza en pantalla el msj "Reporte de Vinculación"
	
	
	Scenario: Menu Practica Evaluacion.
		When selecciona la opcion Realizar Evaluacion
		Then el visualiza en pantalla el mensaje "Evaluación al estudiante de práctica"
		
		
	Scenario: Menu Practica  Administracion de Mentores.
		When utiliza la opcion Administracion de Mentores
		Then el visualiza en la app  el mensaje "Mentores"	
		
	Scenario: Menu Practica Ceacion de Grupos.
		When selecciona la opcion crear grupo
		Then el usuario visualiza en pantalla el mensaje "CREAR GRUPO"	
		
	
	Scenario: Menu Practica Consultar Grupo.
		When utiliza la opcion consultar grupo
		Then el Administrador visualiza en pantalla el mensaje "Consultar Grupo"	
		
	Scenario: Menu Practica Correspondencia.
		When selecciona la opcion correspondencia
		Then visualiza en pantalla el mensaje "Correspondencia PRÁCTICA"
		
		
	Scenario: Menu Practica Correspondencia Jefes.
		When selecciona la opcion correspondencia jefes
		Then se verifica en pantalla el mensaje "Correspondencia Jefes"	
		
		
	Scenario: Menu Practica Correspondencia Mentores.
		When selecciona la opcion correspondencia mentores
		Then se realiza la verificacaion el mensaje "Correspondencia Mentores"
		
	
	Scenario: Menu Practica Consultar Grupo Por Semestre.
	  When selecciona la opcion consultar grupo
		Then el visualiza en pantalla el mensaje "Consultar Grupo"
		
	Scenario: Menu Practica Consultar Estudiantes.
		When click la opcion Consultar Estudiantes
		Then el verifica en pantalla el mensaje "Consultar Estudiantes"