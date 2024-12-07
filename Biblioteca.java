import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> catalogo;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.catalogo = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
        System.out.println("El libro '" + libro.getTitulo() + "' ha sido agregado al catálogo.");
    }

    public void eliminarLibro(Libro libro) {
        if (catalogo.remove(libro)) {
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido eliminado del catálogo.");
        } else {
            System.out.println("El libro no se encuentra en el catálogo.");
        }
    }

    public Libro buscarLibro(String isbn) {
        for (Libro libro : catalogo) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        System.out.println("No se encontró un libro con ISBN: " + isbn);
        return null;
    }
}
