#@Prospecto
#Feature: Validar que cuando se ingrese al aplicativo GRIFUS, el sistema permita realizar la creación de un prospecto. 

#Background: Autenticar correctamente
#    Given usuario esta en "http://localhost:4200/#/login/sign_in"
#    When usuario enter "JETORRESE" as inUsuario
#    And usuario enter "Pitufa2023*" as inPassword
#    Then el "DIESANCHEZ" ha sido autenticado
    
#	Scenario Outline: Crear un prospecto
#    Given es coordinador
#    When usuario vaya a opcion CrearProspecto
#    And usuario llena los campos <agencia> <clasComercial> <clasComercialSub> <estadoTipoCom> <nombrePros> <estadoSubTipoCom> <rolCom> obligatorios
#    Then usuario crea un nuevo prospecto

 #   Examples:
 #   |agencia	|clasComercial|clasComercialSub	|estadoTipoCom|nombrePros	|estadoSubTipoCom	|rolCom|
 #   |61				|1						|1								|1						|Elegante		|1								|1|