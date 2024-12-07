import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String idUsuario;
    private List<Libro> librosPrestados;

    public Usuario(String nombre, String idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void solicitarLibro(Libro libro) {
        if (libro.isDisponible()) {
            libro.prestar();
            librosPrestados.add(libro);
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no está disponible.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.remove(libro)) {
            libro.devolver();
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no está en la lista de libros prestados.");
        }
    }
}
