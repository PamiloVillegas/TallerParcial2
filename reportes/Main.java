package reportes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Empleado> equipo = new ArrayList<>();
        equipo.add(new Desarrollador("Ana Torres"));
        equipo.add(new Gerente("Carlos Ruiz"));
        equipo.add(new Disenador("Laura Gómez"));

        Reporte reporte = new Reporte();
        reporte.generarReporte(equipo);

    }
}
