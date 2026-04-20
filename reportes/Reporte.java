package reportes;

import java.util.List;

public class Reporte {

    public void generarReporte(List<Empleado> empleados) {
        for (Empleado e : empleados) {
            e.imprimirEnReporte();
        }
    }
}
