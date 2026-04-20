package figurasgeometricas;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base   = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return String.format(
                "Rectángulo  | Color: %-10s | Base: %5.1f | Altura: %5.1f | Área: %8.2f | Perímetro: %7.2f",
                color, base, altura, calcularArea(), calcularPerimetro()
        );
    }
}
