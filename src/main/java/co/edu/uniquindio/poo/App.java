package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona("juan", 1);
        Persona persona2 = new Persona("Maria", 1);

        Libro libro1 = Libro.getInstance(1234567890, "El principito", "Antoine de Saint-Exupéry");
        Libro libro2 = Libro.getInstance(987654321, "Cien años de soledad", "Gabriel García Márquez");

        Reserva reserva1 = new Reserva(persona1, libro1, LocalDate.of(2022, 10, 1), LocalDate.of(2022, 10, 15));
        Reserva reserva2 = new Reserva(persona2, libro2, LocalDate.of(2022, 10, 5), LocalDate.of(2022, 10, 20));
        Reserva reserva3 = new Reserva(persona1, libro1, LocalDate.of(2022, 10, 12), LocalDate.of(2022, 10, 25)); // Intento de solapamiento

        Biblioteca biblioteca = new Biblioteca();

        try {
            biblioteca.agregarReserva(reserva1);
            biblioteca.agregarReserva(reserva2);
            biblioteca.agregarReserva(reserva3);
        } catch (ReservaSolapadaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
