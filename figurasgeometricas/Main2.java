package figurasgeometricas;

public class Main2 {
    public static void main(String[] args) {

        Figura[] figuras = {
                new Circulo("Rojo",                    7),
                new Rectangulo("Azul",                 4, 9),
                new TrianguloRectangulo("Verde",        5, 12),
                new Rectangulo("Amarillo",             15, 3),
                new Circulo("Naranja",                  2),
                new TrianguloRectangulo("Morado",       8, 6)
        };

        Coleccion col = new Coleccion(figuras);

        // --- Todas las figuras ---
        System.out.println("=".repeat(75));
        System.out.println(" COLECCIÓN COMPLETA");
        System.out.println("=".repeat(75));
        for (Figura f : figuras) {
            System.out.println(f);
        }

        // --- Resultados ---
        System.out.println();
        System.out.println("=".repeat(75));
        System.out.println(" ANÁLISIS DE LA COLECCIÓN");
        System.out.println("=".repeat(75));

        Figura mayor = col.figuraConMayorArea();
        System.out.printf("Figura con mayor área  : %s%n", mayor);
        System.out.printf("Área total             : %.2f unidades²%n", col.areaTotal());
        System.out.printf("Perímetro promedio     : %.2f unidades%n",  col.perimetroPromedio());

        System.out.println();
        col.imprimirOrdenadaPorArea();
    }
}
