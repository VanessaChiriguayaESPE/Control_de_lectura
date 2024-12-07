public class Empleado {
    private String nombre;
    private String idEmpleado;

    public Empleado(String nombre, String idEmpleado) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
    }

    public void gestionarUsuario(Usuario usuario) {
        System.out.println("Gestionando usuario: " + usuario.getNombre());
    }

    public void registrarTransaccion(Transaccion transaccion) {
        transaccion.registrar();
    }
}
