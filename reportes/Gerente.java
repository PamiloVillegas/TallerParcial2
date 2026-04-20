package reportes;

public class Gerente extends Empleado {

    public Gerente(String nombre) {
        super(nombre);
    }

    @Override
    public void imprimirEnReporte() {
        System.out.println("Ger: " + nombre);
    }
}
