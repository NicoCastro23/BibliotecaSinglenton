package co.edu.uniquindio.poo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Libro {
    private String author;
    private String title;
    private int ISBN;
    private static Libro libro;

    private static Libro instance;

    private Libro(int ISBN, String titulo, String autor) {
        this.ISBN = ISBN;
        this.title = titulo;
        this.author = autor;
    }

    public static Libro getInstance(int ISBN, String titulo, String autor) {
        if (instance == null) {
            instance = new Libro(ISBN, titulo, autor);
        }
        return instance;
    }
}
