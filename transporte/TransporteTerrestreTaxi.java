package transporte;

public class TransporteTerrestreTaxi extends MedioTransporte {

    private static final double TARIFA_KM  = 950;
    private static final double BANDERAZO  = 5000;

    public TransporteTerrestreTaxi(String origen, String destino, double distanciaKm) {
        super(origen, destino, distanciaKm);
    }

    @Override
    public double calcularCosto() {
        return distanciaKm * TARIFA_KM + BANDERAZO;
    }

    @Override
    public String getNombre() { return "Taxi"; }
}
