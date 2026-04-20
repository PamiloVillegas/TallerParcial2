package figurasgeometricas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Figura> figuras = new ArrayList<>();

        figuras.add(new Rectangulo("Rojo",     10,  5));
        figuras.add(new Rectangulo("Azul",      7,  3));
        figuras.add(new Circulo("Verde",         6   ));
        figuras.add(new Circulo("Amarillo",      4   ));
        figuras.add(new TrianguloRectangulo("Naranja",  3,  4));
        figuras.add(new TrianguloRectangulo("Morado",   6,  8));

        System.out.println("=".repeat(85));
        System.out.println(" LISTA DE FIGURAS GEOMÉTRICAS");
        System.out.println("=".repeat(85));

        double areaTotal = 0;

        for (Figura f : figuras) {
            System.out.println(f);              // llama a toString() de cada subclase
            areaTotal += f.calcularArea();      // polimorfismo: cada figura sabe su área
        }

        System.out.println("=".repeat(85));
        System.out.printf("ÁREA TOTAL ACUMULADA: %.2f unidades²%n", areaTotal);
        System.out.println("=".repeat(85));
    }
}
