Proyecto Java - Ejercicios de Objetos, Clases e Interfaces

Este proyecto contiene varios ejercicios para practicar conceptos de programación orientada a objetos en Java, incluyendo clases, atributos estáticos y finales, interfaces y métodos.

Contenido del proyecto

Nivel 1

Ejercicio 1: Instrumentos musicales

En este ejercicio se crea una jerarquía de clases para representar diferentes tipos de instrumentos musicales:

Instrument (clase abstracta):

Atributos: name (String), price (double)

Método abstracto: play()

Clases hijas:

Wind: Muestra por consola "Está sonando un instrumento de viento"

Cuerda: Muestra por consola "Está sonando un instrumento de cuerda"

Percussion: Muestra por consola "Está sonando un instrumento de percusión"

Además, se demuestra el proceso de carga de una clase en Java, que solo se produce una vez, ya sea a través de la creación de la primera instancia o del acceso a un miembro estático.

Ejercicio 2: Clase Car

Se crea la clase Car con los siguientes atributos:

brand: estático y final

model: estático

power: final

Esta estructura permite ver las diferencias entre atributos estáticos y finales, y entender cuál se puede inicializar en el constructor.

Métodos:

brake(): estático, muestra por consola "El vehículo está frenando"

accelerate(): no estático, muestra por consola "El vehículo está acelerando"

Se demuestra cómo invocar estos métodos desde el main().

Nivel 2

Ejercicio 1: Teléfono y Smartphone

Se crean las siguientes clases e interfaces:

Clase Telephone:

Atributos: brand, model

Método: call(String number) — Muestra por consola "Se está llamando al número {number}"

Interfaz Camera:

Método: takePhoto() — Muestra por consola "Se está haciendo una foto"

Interfaz Watch:

Método: alarm() — Muestra por consola "Está sonando la alarma"

Clase Smartphone:

Hereda de Telephone e implementa Camera y Watch

Desde el main(), se crea un objeto Smartphone y se llaman a todos los métodos definidos.

Cómo ejecutar el proyecto

Clona este repositorio:

git clone <repositorio-url>

Abre el proyecto en tu IDE de Java preferido (IntelliJ, Eclipse, VSCode, etc.).

Compila y ejecuta la clase principal.

