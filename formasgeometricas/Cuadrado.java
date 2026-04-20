package formasgeometricas;

public class Cuadrado extends Forma {
    public void dibujar() {
        System.out.println("Cuadrado");
    }

    public void calcularArea(int lado) {
        System.out.println(lado * lado);

    }
}
