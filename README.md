# bibliotecasinglenton

### Ejercicio: Implementación de un Sistema de Reservas de Libros para una Biblioteca

#### Contexto
La biblioteca "Lecturas del Saber" se enfrenta a un reto importante: gestionar eficientemente las reservas de libros por parte de sus usuarios, evitando solapamientos en las reservas y garantizando que cada libro solo pueda ser reservado por una persona a la vez durante un periodo específico. Para abordar este desafío, la biblioteca ha decidido implementar un nuevo sistema de gestión de reservas utilizando tecnología de software. Se te ha encomendado el desarrollo de este sistema.

#### Objetivos del Sistema
- Permitir a los usuarios de la biblioteca reservar libros disponibles por un rango de fechas específico.
- Asegurar que no se produzcan solapamientos en las reservas de los libros.
- Proporcionar mensajes claros de error en caso de intentos de reservas inválidas.

#### Requisitos del Sistema
1. **Modelado de Entidades**:
- **Persona**: Cada usuario de la biblioteca debe ser representado con un identificador único y un nombre.
- **Libro**: Los libros deben contener información como el ISBN (identificador único), título y autor.
- **Reserva**: Las reservas deben vincular un libro con una persona y definir un rango de fechas (inicio y fin) para la reserva.

2. **Gestión de Reservas**:
- El sistema debe permitir añadir nuevas reservas, asegurando que no haya solapamientos con otras reservas existentes para el mismo libro.
- Si se intenta realizar una reserva que se solapa con otra ya existente para el mismo libro, el sistema debe lanzar una excepción específica, informando del conflicto.

3. **Manejo de Excepciones**:
- Implementar una excepción personalizada para gestionar el caso de solapamientos de reservas.

4. **Interacción del Sistema**:
- Crear una clase principal con un método `main` que demuestre el funcionamiento del sistema, incluyendo la creación de personas, libros, y la gestión de reservas sin solapamientos y manejo adecuado de errores cuando se produzcan solapamientos.

#### Instrucciones
- Utiliza Lombok para simplificar el código de las entidades, evitando la necesidad de escribir manualmente getters, setters, y constructores.
- Asegúrate de separar las responsabilidades de tu código en diferentes clases, cada una representando una de las entidades del sistema y la lógica de gestión de reservas.
- Implementa un mecanismo para verificar la disponibilidad de los libros antes de aceptar una reserva, lanzando una excepción si el libro ya está reservado en el rango de fechas solicitado.

#### Evaluación
Se evaluará tu solución basándose en:
- La correcta implementación de las entidades y la lógica de negocio siguiendo los principios de la programación orientada a objetos.
- La eficiencia de tu solución en el manejo de solapamientos de reservas.
- El uso adecuado de Lombok para reducir la verbosidad del código.
- La claridad y mantenibilidad de tu código.

Este ejercicio te permitirá demostrar tu habilidad para modelar un sistema utilizando programación orientada a objetos, manejar excepciones de manera efectiva y utilizar herramientas que aumentan la productividad en el desarrollo de software.
# Autores

- Juan Nicolas Castro juann.castroh@uqvirtual.edu.co
- Autor 2

# Herramientas

- [java 17](https://adoptium.net/es)
- [junit 5.10.0](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.10.0)
- [maven](https://maven.apache.org)


# Construcción y pruebas

Para compilar el proyecto puede usar el comando:

```shell
mvn clean compile
```

Para ejecutar las pruebas puede usar el comando: 

```shell
 mvn clean test
```

Para generar el jar puede usar el comando: 

```shell
 mvn clean package
```

y para ejecutar el jar

```shell
 java -jar target/bibliotecasinglenton-1.0.jar
```
