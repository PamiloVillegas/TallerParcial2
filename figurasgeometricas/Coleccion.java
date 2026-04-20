package figurasgeometricas;

import java.util.Arrays;
import java.util.Comparator;

public class Coleccion {

    private Figura[] figuras;

    public Coleccion(Figura[] figuras) {
        this.figuras = figuras;
    }

    public Figura figuraConMayorArea() {
        Figura mayor = figuras[0];

        for (int i = 1; i < figuras.length; i++) {
            if (figuras[i].calcularArea() > mayor.calcularArea()) {
                mayor = figuras[i];
            }
        }
        return mayor;
    }

    public double areaTotal() {
        double total = 0;
        for (Figura f : figuras) {
            total += f.calcularArea();
        }
        return total;
    }

    public double perimetroPromedio() {
        double sumaPerimetros = 0;
        for (Figura f : figuras) {
            sumaPerimetros += f.calcularPerimetro();
        }
        return sumaPerimetros / figuras.length;
    }


    public void imprimirOrdenadaPorArea() {

        // copia para no alterar el arreglo original
        Figura[] copia = Arrays.copyOf(figuras, figuras.length);

        // Comparator.comparingDouble le dice a sort() que compare por calcularArea()
        Arrays.sort(copia, Comparator.comparingDouble(Figura::calcularArea));

        System.out.println("--- Figuras ordenadas de menor a mayor área ---");
        for (Figura f : copia) {
            System.out.printf("  Área: %8.2f  →  %s%n", f.calcularArea(), f);
        }
    }
}
