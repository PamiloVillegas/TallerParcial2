package figurasgeometricas;

public class Figura {

    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public double calcularArea() {
        return 0.0;
    }

    public double calcularPerimetro() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Figura | Color: " + color;
    }
}
