package figurasgeometricas;

public class Circulo extends Figura {

    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return String.format(
                "Círculo     | Color: %-10s | Radio: %5.1f              | Área: %8.2f | Perímetro: %7.2f",
                color, radio, calcularArea(), calcularPerimetro()
        );
    }
}
