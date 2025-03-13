
# Java Project - Exercises on Objects, Classes, and Interfaces

This project contains several exercises to practice object-oriented programming concepts in Java, including classes, static and final attributes, interfaces, and methods.

## Project Content

### Level 1

- Exercise 1: Musical Instruments

In this exercise, a class hierarchy is created to represent different types of musical instruments:

Instrument (abstract class):

Attributes: name (String), price (double)

Abstract method: play()

Child classes:

Wind: Displays "A wind instrument is playing" on the console

String: Displays "A string instrument is playing" on the console

Percussion: Displays "A percussion instrument is playing" on the console

Additionally, the process of loading a class in Java is demonstrated, which only occurs once, either through the creation of the first instance or access to a static member.

- Exercise 2: Car Class

The Car class is created with the following attributes:

brand: static and final

model: static

power: final

This structure allows us to see the differences between static and final attributes and understand which can be initialized in the constructor.

Methods:

brake(): static, displays "The vehicle is braking" on the console

accelerate(): non-static, displays "The vehicle is accelerating" on the console

It demonstrates how to invoke these methods from the main().

### Level 2

- Exercise 1: Telephone and Smartphone

The following classes and interfaces are created:

Class Telephone:

Attributes: brand, model

Method: call(String number) — Displays "Calling the number {number}" on the console

Interface Camera:

Method: takePhoto() — Displays "Taking a photo" on the console

Interface Watch:

Method: alarm() — Displays "The alarm is ringing" on the console

Class Smartphone:

Inherits from Telephone and implements Camera and Watch

From the main(), a Smartphone object is created, and all defined methods are called.

How to run the project

Clone this repository:

Open the project in your preferred Java IDE (IntelliJ, Eclipse, VSCode, etc.).

Compile and run the main class.

In IntelliJ, make sure to select the current file as the file to run.