package vehiculos;

public class Camion extends Vehiculo {

    private double capacidadToneladasCarga;

    public Camion(String marca, String modelo, int velocidadMaxima, double capacidadToneladasCarga) {
        super(marca, modelo, velocidadMaxima);
        this.capacidadToneladasCarga = capacidadToneladasCarga;
    }

    public double getCapacidadToneladasCarga() {
        return capacidadToneladasCarga;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Capacidad de carga: " + capacidadToneladasCarga + " toneladas");
    }
}

