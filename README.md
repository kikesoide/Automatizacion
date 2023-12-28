Autor: @<Jorge Enrique Torres Esquivel>  :construction_worker:
# Getting started with Selenium and Cucumber

[Tutorial de Serenity](https://www.udemy.com/course/selenium-con-java-y-cucumber-el-curso-definitivo/)

## configurar ambiente
### Configuración de ChromeDriver 
1. Descargar ChormeDriver.zip
2. ejecutar el .exe y dejar el servicio corriendo
### librerias a instalar
2. JDK 15

### Extensiones de VS Code
- Gradle Language Support 
- Gradle Tasks en VSCode.
- [Configure java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) y apuntar a la ruta del jdk15
- Cucumber (Gherkin) Full Support

4. [Instalar gradle](https://gradle.org/install/)

### por si no tiene permisos para variables de entorno
. set PATH=%PATH%;C:\Gradle\bin

### Extensiones para el navegador
- ChroPath: ChroPath helps to generate and validate selectors like relative xpath, cssSelector etc with iframe support.


## Iniciar pruebas
1. Iniciar front y back
## Pruebas basicas de integridad

XXXXXXX-tester tiene las siguientes pruebas de integridad

1	Validar que cuando se ingrese al aplicativo XXXXXXX, el sistema permita realizar la creación de un prospecto. 

2	Validar que cuando se ingrese al aplicativo XXXXXXX, el sistema permita realizar la busqueda y actualización de un prospecto. 

3	Validar que cuando se ingrese al aplicativo XXXXXXX, el sistema permita pasar un prospecto a negocio. 

## comandos para ejecutar proyecto

### ejecutar casos de prueba solo para rol director

```
set JAVA_HOME="C:\Javatemp\jdk-11.0.11"
gradle test -Dcucumber.filter.tags="@ROL_DIRECTOR" -Dtest.debug
gradle test -Dcucumber.filter.tags="@Prospecto"
gradle test -Dorg.gradle.java.home="C:\Program Files\Java\jdk-11.0.11"

```

tutorial: voy en la 5-49
