# Conversor de Monedas

Este proyecto es una aplicación de consola desarrollada en Java que permite realizar conversiones entre diferentes tipos de monedas utilizando tasas de cambio actualizadas proporcionadas por la API de [ExchangeRate-API](https://www.exchangerate-api.com/).

## Introducción

El Conversor de Monedas es una herramienta útil para aquellos que necesitan realizar conversiones monetarias con precisión y rapidez. La aplicación se basa en las tasas de cambio en tiempo real para proporcionar resultados precisos y actualizados.

## Arquitectura y Diseño

El proyecto sigue el patrón de diseño MVC (Modelo-Vista-Controlador) para una estructura modular y organizada:

- **Modelo (Model)**: Representa los datos y la lógica de negocio. Incluye las siguientes clases:
  - `Conversion`: Contiene la lógica principal para realizar las conversiones de moneda.
  - `Consultas`: Realiza consultas a la API de ExchangeRate-API para obtener las tasas de cambio actualizadas.
  - `Moneda`: Representa los datos de las tasas de cambio obtenidas de la API.
  - `GeneradorDeArchivos`: Se encarga de generar archivos JSON que contienen información sobre las conversiones realizadas.
- **Vista (View)**: Responsable de la interacción con el usuario. Implementada en la clase `Menu`.
- **Controlador (Controller)**: Coordina las interacciones entre el modelo y la vista. Implementado en la clase `Main`.

## Funcionalidades

### Conversión de Monedas

La aplicación permite convertir entre los siguientes pares de monedas:

- Dólar estadounidense (USD) a Peso argentino (ARS)
- Peso argentino (ARS) a Dólar estadounidense (USD)
- Dólar estadounidense (USD) a Real brasileño (BRL)
- Real brasileño (BRL) a Dólar estadounidense (USD)
- Dólar estadounidense (USD) a Peso colombiano (COP)
- Peso colombiano (COP) a Dólar estadounidense (USD)

### Interacción de Usuario

El usuario interactúa con la aplicación a través de un menú en la consola. Se le presentan opciones para elegir el par de monedas a convertir y se le solicita la cantidad a convertir.

### Generación de Archivos JSON

La aplicación incluye la funcionalidad para generar archivos JSON que contienen información detallada sobre las conversiones realizadas. Estos archivos se guardan localmente en el sistema de archivos del usuario.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado para desarrollar la aplicación.
- **Gson**: Biblioteca utilizada para manejar los datos JSON devueltos por la API de ExchangeRate-API.
- **ExchangeRate-API**: API utilizada para obtener las tasas de cambio actualizadas entre las diferentes monedas.

## Requisitos

- Java Development Kit (JDK) instalado en el sistema.
- Acceso a internet para obtener los valores de cambio de la API.

## Instalación y Uso

1. Clona o descarga el repositorio del proyecto.
2. Abre el proyecto en tu IDE preferido.
3. Ejecuta la clase `Main` para iniciar la aplicación.
4. Sigue las instrucciones en la consola para realizar las conversiones de moneda.

## Contribución

Si deseas contribuir a este proyecto, por favor crea un pull request detallando los cambios propuestos.



¡Gracias por contribuir al proyecto!

