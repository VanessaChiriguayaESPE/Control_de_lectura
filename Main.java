public class Main {
    public static void main(String[] args) {
        //Creamos el listado de libros
        Libro libro1 = new Libro("La Odisea", "Homero", "12345");
        Libro libro2 = new Libro("Las crónicas de Narnia", "C.S. Lewis", "67890");
        Libro libro3 = new Libro("La culpa es de la vaca", "J.L. Gutierrez", "24680");

        //Creamos los usuarios
        Usuario usuario1 = new Usuario("Alejandro Sánchez", "U001");
        Usuario usuario2 = new Usuario("Mónica Angamarca", "U002");

        //Creamos biblioteca y agregamos los libros
        Biblioteca biblioteca = new Biblioteca("Biblioteca Alejandro Segovia");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        //Creamos empleados
        Empleado empleado1 = new Empleado("Nathaly Castillo", "E001");
        Empleado empleado2 = new Empleado("Bladimir Lapo", "E002");

        //Realizamos préstamo de libro
        usuario2.solicitarLibro(libro1);

        //Creamos la transacción de préstamo del libro
        Transaccion transaccion = new Transaccion("T001", libro1, usuario2, "Préstamo");
        empleado2.registrarTransaccion(transaccion);

        //Creamos la transacción de devolución del libro
        usuario1.devolverLibro(libro2);
        Transaccion devolucion = new Transaccion("T002", libro2, usuario1, "Devolución");
        empleado1.registrarTransaccion(devolucion);
    }
}