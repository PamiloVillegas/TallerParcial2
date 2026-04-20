package vehiculos;

public class Motocicleta extends Vehiculo {

    private String tipoManillar;

    public Motocicleta(String marca, String modelo, int velocidadMaxima, String tipoManillar) {
        super(marca, modelo, velocidadMaxima);
        this.tipoManillar = tipoManillar;
    }

    public String getTipoManillar() {
        return tipoManillar;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Tipo de manillar: " + tipoManillar);
    }
}

