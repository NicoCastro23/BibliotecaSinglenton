package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Biblioteca {
    
     private final List<Reserva> reservas = new ArrayList<>();

    public void agregarReserva(Reserva reserva) throws ReservaSolapadaException {
        for (Reserva r : reservas) {
            if (r.getLibro().getISBN() == (reserva.getLibro().getISBN())) {
                if (r.getFechaInicio().isBefore(reserva.getFechaFin()) && r.getFechaFin().isAfter(reserva.getFechaInicio())) {
                    throw new ReservaSolapadaException("La reserva para el libro '" + reserva.getLibro().getTitle() + "' se solapa con otra reserva existente.");
                }
            }
        }
        reservas.add(reserva);
    }
}
