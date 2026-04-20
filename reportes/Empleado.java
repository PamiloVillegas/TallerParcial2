package reportes;

public class Empleado {

    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Ya NO existe getTipo() — no se necesita
    public void imprimirEnReporte() {
        System.out.println("Emp: " + nombre);
    }
}
