# CI-proyect
## Descripcion de proyecto
Este proyecto utiliza GitHub Actions para automatizar el proceso de ejecución de pruebas y generación de reportes con Allure. Los flujos de trabajo (workflows) definidos incluyen la configuración del entorno, la ejecución de pruebas, y la publicación de reportes en GitHub Pages con historial de ejecuciones.
En esta sencilla prueba de automatizacion web que consiste en hacer logIn y luego logOut se implemento los ajustes necesarios para aplicarle el CI y de manera local funciona muy bien la generación de reportes.

## Características Principales

- Flujo de trabajo automatizado con GitHub Actions
- Ejecución de pruebas parametrizable por navegador
- Generación de reportes Allure
- Despliegue automático de resultados de pruebas

## Tecnologías Utilizadas

- Java
- Maven
- GitHub Actions
- Selenium
- Allure

## Instrucciones de uso

Se tiene que usar en este orden:
- mvn clean verify
- mvn allure:report
- mvn allure:serve
Con esto el proyecto funcionará y generará el reporte.

# Allure
Herramienta que se usó para generar los reportes, a continuación una muestra de como localmente lo generó sin problemas:
<img width="941" alt="{091927E4-8D3C-4EAF-AA4C-2C0ECFACCE5A}" src="https://github.com/user-attachments/assets/1118dac1-430f-4cb7-a5d7-792ceeff6209">
