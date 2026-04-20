package transporte;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String origen  = "Manizales";
        String destino = "Bogotá";
        double distancia = 300;

        List<MedioTransporte> opciones = new ArrayList<>();
        opciones.add(new TransporteAereo(origen, destino, distancia));
        opciones.add(new TransporteTerrestreBus(origen, destino, distancia));
        opciones.add(new TransporteTerrestreTaxi(origen, destino, distancia));

        // --- Tabla comparativa ---
        System.out.println("Trayecto : " + origen + " -> " + destino);
        System.out.println("Distancia: " + distancia + " km");
        System.out.println();
        System.out.printf("%-10s %-20s %-15s%n", "Medio", "Costo", "Precio final");
        System.out.println("─".repeat(48));

        MedioTransporte masEconomico = opciones.get(0);

        for (MedioTransporte t : opciones) {
            double costo = t.calcularCosto();

            System.out.printf("%-10s $%-19.0f $%.0f%n",
                    t.getNombre(), costo, costo);

            if (costo < masEconomico.calcularCosto()) {
                masEconomico = t;
            }
        }

        System.out.println("─".repeat(48));
        System.out.println();
        System.out.println("Opción más económica : " + masEconomico.getNombre());
        System.out.printf("Costo                : $%.0f%n", masEconomico.calcularCosto());
    }
}