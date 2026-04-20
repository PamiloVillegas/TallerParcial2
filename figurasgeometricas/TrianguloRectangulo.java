package figurasgeometricas;

public class TrianguloRectangulo extends Figura {

    private double cateto1;
    private double cateto2;

    public TrianguloRectangulo(String color, double cateto1, double cateto2) {
        super(color);
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    // La hipotenusa se calcula con Pitágoras: √(c1² + c2²)
    // Math.sqrt() calcula la raíz cuadrada
    // Math.pow(n, 2) eleva n al cuadrado
    private double calcularHipotenusa() {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    @Override
    public double calcularArea() {
        return (cateto1 * cateto2) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return cateto1 + cateto2 + calcularHipotenusa();
    }

    @Override
    public String toString() {
        return String.format(
                "Triángulo   | Color: %-10s | C1: %5.1f  | C2: %5.1f  | Área: %8.2f | Perímetro: %7.2f",
                color, cateto1, cateto2, calcularArea(), calcularPerimetro()
        );
    }
}
