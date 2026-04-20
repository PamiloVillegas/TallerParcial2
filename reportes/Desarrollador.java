package reportes;

public class Desarrollador extends Empleado {

    public Desarrollador(String nombre) {
        super(nombre);
    }

    @Override
    public void imprimirEnReporte() {
        System.out.println("Dev: " + nombre);
    }
}
