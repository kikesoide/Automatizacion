@ROL_DIRECTOR
Feature: Actualizar Negocio

Rule: El director puede modificar el negocio sin generar otro si
Rule: url local "http://localhost:4200/#/login/sign_in" o "http://10.3.0.54:7013/grifus-web/#/login/sign_in" 
Rule: usuario local "JETORRESE" o "JORTORRES.EXT"

  Background: Autenticar correctamente
    Given usuario esta en "http://10.3.0.54:7013/grifus-web/#/login/sign_in"
    When usuario enter 'JORTORRES.EXT' as inUsuario
    And usuario enter "Estable2025*" as inPassword
    Then el "JORTORRES.EXT" ha sido autenticado
    
  @Test  
	Scenario Outline: Actualizar Negocio como director
    Given '<userName>' esta en "http://10.3.0.54:7013/grifus-web/#/home" page
    When usuario vaya a opcion negocio
    And Busque el <ccodigo>
    And usuario va a la pestana operacion
    And usuario actualice el formulario
    Then usuario actualiza el <nCodNegocio> sin otro si

		Examples:
		|userName     |ccodigo|nCodNegocio|
    |JORTORRES.EXT|1013005|210278			|
      