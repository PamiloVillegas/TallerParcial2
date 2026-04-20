package empleados;

public class Empleado {

    protected String nombre;
    protected String id;
    protected double salarioBase;

    public Empleado(String nombre, String id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioMensual() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre +
                " | Salario base: $" + salarioBase;
    }
}
