import java.util.Date;

public class Transaccion {
    private String idTransaccion;
    private Libro libro;
    private Usuario usuario;
    private String metodo; //"Prestar" y "Devolver"

    public Transaccion(String idTransaccion, Libro libro, Usuario usuario, String metodo) {
        this.idTransaccion = idTransaccion;
        this.libro = libro;
        this.usuario = usuario;
        this.metodo = metodo;

    }

    public void registrar() {
        System.out.println("Transacción registrada:");
        System.out.println("ID: " + idTransaccion);
        System.out.println("Metodo: " + metodo);
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Usuario: " + usuario.getNombre());

    }
}
