package reportes;

public class Disenador extends Empleado {

    public Disenador(String nombre) {
        super(nombre);
    }

    @Override
    public void imprimirEnReporte() {
        System.out.println("Dis: " + nombre);
    }
}