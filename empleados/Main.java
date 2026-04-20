package empleados;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Empleado> nomina = new ArrayList<>();

        // empleados de tiempo completo
        nomina.add(new EmpleadoTiempoCompleto("Ana Torres",   "TC-001", 2500000, 300000));
        nomina.add(new EmpleadoTiempoCompleto("Carlos Ruiz",  "TC-002", 3000000, 400000));

        // empleados de medio tiempo
        nomina.add(new EmpleadoMedioTiempo("Laura Gómez",  "MT-001", 0, 80, 25000));
        nomina.add(new EmpleadoMedioTiempo("Diego Mora",   "MT-002", 0, 60, 30000));

        System.out.println("======= NÓMINA DEL MES =======");

        double totalNomina = 0;

        for (Empleado emp : nomina) {
            System.out.println(emp);

            totalNomina += emp.calcularSalarioMensual();

            System.out.println();
        }

        System.out.println("==============================");
        System.out.println("TOTAL NÓMINA DEL MES: $" + totalNomina);
    }
}
