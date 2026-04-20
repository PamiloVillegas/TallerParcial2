package vehiculos;

public class Automovil extends Vehiculo {

    private int numeroPuertas;

    public Automovil(String marca, String modelo, int velocidadMaxima, int numeroPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}

