package empleados;

public class EmpleadoMedioTiempo extends Empleado {

    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoMedioTiempo(String nombre, String id, double salarioBase,
                               int horasTrabajadas, double valorHora) {
        super(nombre, id, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalarioMensual() {
        return horasTrabajadas * valorHora;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Tipo: Medio tiempo" +
                " | Horas: " + horasTrabajadas +
                " | Valor/hora: $" + valorHora +
                " | Salario mensual: $" + calcularSalarioMensual();
    }
}
