# Sprint3Tasca_S301Nivel1 - Patrón Singleton: Sistema de Comandos Undo

## Descripción - Enunciado del ejercicio

Este proyecto implementa en **Java** un sistema de gestión de comandos con **historial tipo Undo**, utilizando el **patrón de diseño Singleton** como requerimiento principal.  
La clase `Undo` es una instancia única global que almacena las últimas órdenes introducidas por el usuario, permitiendo **añadir**, **deshacer** y **listar** comandos, similar al historial de `bash` (`history`).

El sistema permite:

- **Singleton estricto**: Solo existe **una instancia** de `Undo` en toda la aplicación.
- **Añadir comandos**: mediante entrada validada por consola.
- **Deshacer (Undo)**: elimina y muestra el último comando.
- **Listar historial**: muestra todas las órdenes en orden cronológico.
- **Interfaz de menú interactiva**: en consola, clara y robusta.
- **Validación de entrada**: no permite comandos vacíos ni `null`.

El ejercicio demuestra:

- Uso correcto del **patrón Singleton** (inicialización estática segura).
- Encapsulación y separación de responsabilidades.
- Diseño orientado a objetos con métodos de instancia.
- Manejo seguro de entrada/salida con validación.

---

## Tecnologías Utilizadas

- **Java 8+** (compatible hasta Java 23, sin características avanzadas)
- **JDK estándar** (sin dependencias externas)
- **IntelliJ IDEA / VS Code / Eclipse** (opcional)

---

## Requisitos

- Tener instalado **Java JDK 8 o superior**
- Un IDE o terminal para compilar y ejecutar Java

---

## Estructura del Proyecto
sprint3Tasca_S301Nivel1/
├── EntryString_Int.java     → Utilidad de entrada con validación
├── Undo.java                → Clase Singleton (núcleo del patrón)
├── Operation.java           → Lógica del menú (métodos de instancia)
└── UndoMain.java            → Clase con main() – punto de entrada
text---

## Instalación

Clona o descarga el proyecto:

```
git clone https://github.com/jrffruit518-enrich/JavaSprint3_1Patterns1.git
cd Sprint3Tasca_S301Nivel1
```
Abre en tu IDE o usa la terminal.

Ejecución
Opción 1: Desde terminal
```
javac sprint3Tasca_S301Nivel1/*.java
java sprint3Tasca_S301Nivel1.UndoMain
```
Opción 2: En IDE
Ejecuta directamente la clase UndoMain


## Despliegue
Proyecto educativo. Opcionalmente empaquetar como .jar:
bashjar cfe UndoSystem.jar sprint3Tasca_S301Nivel1.UndoMain sprint3Tasca_S301Nivel1/*.class
java -jar UndoSystem.jar

Implementación del Patrón Singleton
javaprivate static class UndoInstance {
    private static final Undo undo = new Undo();
}
public static Undo getInstance() {
    return UndoInstance.undo;
}

Inicialización perezosa y segura en hilos (sin synchronized)
Constructor privado → imposible instanciar desde fuera
Instancia única garantizada


## ontribuciones
¡Bienvenidas! Sigue estos pasos:

Haz un fork
Crea una rama:
```
git checkout -b feature/mejora-menu
```
```
git commit -m "Añade soporte para redo"
```
Push y Pull Request