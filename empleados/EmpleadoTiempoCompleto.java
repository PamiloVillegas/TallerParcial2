package empleados;

public class EmpleadoTiempoCompleto extends Empleado {

    private double beneficiosSalud;

    public EmpleadoTiempoCompleto(String nombre, String id,
                                  double salarioBase, double beneficiosSalud) {
        super(nombre, id, salarioBase);
        this.beneficiosSalud = beneficiosSalud;
    }

    @Override
    public double calcularSalarioMensual() {
        return salarioBase + beneficiosSalud;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Tipo: Tiempo completo" +
                " | Beneficios salud: $" + beneficiosSalud +
                " | Salario mensual: $" + calcularSalarioMensual();
    }
}
