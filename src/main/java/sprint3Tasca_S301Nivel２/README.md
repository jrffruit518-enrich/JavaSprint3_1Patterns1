# Sprint3Tasca_S301Nivel2 - Patrón Abstract Factory: Gestor de Direcciones y Números de Teléfono Internacionales
## Descripción - Enunciado del ejercicio

Este proyecto implementa en Java un gestor de contactos internacionales utilizando el patrón de diseño Abstract Factory.
La aplicación permite añadir contactos con direcciones y números de teléfono de distintos países, formateando la información según el país correspondiente.

El sistema permite:

Abstract Factory: cada país tiene su propia fábrica que produce una familia de productos (Address y PhoneNumber).

Direcciones internacionales: cada país puede tener un formato diferente para la dirección.

Números de teléfono internacionales: cada país tiene su propio código y formato de teléfono.

Gestión de contactos global: GlobalContactBook almacena todos los contactos, permitiendo añadir nuevos y cambiar la fábrica activa (país) dinámicamente.

Encapsulación y separación de responsabilidades: Address, PhoneNumber y Contact se gestionan por separado, mientras la fábrica se encarga de crear objetos específicos según el país.

El ejercicio demuestra:

Uso correcto del patrón Abstract Factory para productos relacionados.

Encapsulación y diseño orientado a objetos.

Flexibilidad para añadir nuevos países con mínima modificación del código.

## Tecnologías Utilizadas

Java 8+ (compatible hasta Java 23)

JDK estándar (sin dependencias externas)

IDE recomendado: IntelliJ IDEA / VS Code / Eclipse (opcional)

## Requisitos

Tener instalado Java JDK 8 o superior

IDE o terminal para compilar y ejecutar Java

Estructura del Proyecto
```
sprint3Tasca_S301Nivel2/
├── Address.java               → Interfaz para direcciones
├── AddressData.java           → Clase que almacena datos de dirección (street, city, postcode, province)
├── AddressSpain.java          → Implementación de dirección para España
├── AddressUSA.java            → Implementación de dirección para USA
├── PhoneNumber.java           → Interfaz para números de teléfono
├── PhoneNumberSpain.java      → Implementación de teléfono para España
├── PhoneNumberUSA.java        → Implementación de teléfono para USA
├── Factory.java               → Interfaz Abstract Factory
├── FactorySpain.java          → Fábrica concreta para España
├── FactoryUSA.java            → Fábrica concreta para USA
├── Contact.java               → Clase que combina Address y PhoneNumber
├── GlobalContactBook.java     → Gestión de contactos globales usando la fábrica activa
└── GlobalContactBookMain.java → Clase principal con main() – punto de entrada
```
## Instalación

Clona o descarga el proyecto:
```
git clone https://github.com/jrffruit518-enrich/JavaSprint3_1Patterns1.git
cd Sprint3Tasca_S301Nivel2
```

Abre en tu IDE o usa la terminal.

## Ejecución
```
Opción 1: Desde terminal
javac sprint3Tasca_S301Nivel2/*.java
java sprint3Tasca_S301Nivel2.GlobalContactBookMain
```
Opción 2: En IDE

Ejecuta directamente la clase GlobalContactBookMain.

Uso del Sistema

Se crea un GlobalContactBook con una fábrica inicial (por ejemplo, FactorySpain).

Se añaden contactos mediante AddressData y número de teléfono.

Se puede cambiar la fábrica activa a otro país (FactoryUSA) y añadir nuevos contactos.

Al mostrar el contenido del GlobalContactBook, cada contacto muestra la dirección y el teléfono formateados según el país.

Ejemplo de salida en consola:
```
Contact{address=pont 15,08155,Barcelona,Barcelona,Spain, phoneNumber=+34 6954321}
Contact{address=san15,NewYork,NY,231245,USA, phoneNumber=+1 23514845}
```
Implementación del Patrón Abstract Factory
```
Factory → Interfaz que define createAddress(AddressData data) y createPhoneNumber(String phoneNumber).

FactorySpain y FactoryUSA → Fábricas concretas que crean Address y PhoneNumber según el país.

GlobalContactBook → Utiliza la fábrica activa para crear y almacenar contactos.

AddressData → Contenedor de datos de dirección, pasado a las fábricas para producir objetos específicos.

Contact → Combina Address y PhoneNumber.
```

## Contribuciones

¡Bienvenidas! Sigue estos pasos:

Haz un fork del proyecto

Crea una rama para tu mejora:
```
git checkout -b feature/nuevo-pais
```

Realiza tus cambios y haz commit:
```
git commit -m "Añade soporte para direcciones de Francia"
```

Haz push y Pull Request