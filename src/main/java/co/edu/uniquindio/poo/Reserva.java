package co.edu.uniquindio.poo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Reserva {
    private Persona persona;
    private Libro libro;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
}
