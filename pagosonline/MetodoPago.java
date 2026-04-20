package pagosonline;

public class MetodoPago {

    protected String titular;
    protected double montoDisponible;

    public MetodoPago(String titular, double montoDisponible) {
        this.titular          = titular;
        this.montoDisponible  = montoDisponible;
    }

    public void procesarPago(double monto) {
        if (monto <= montoDisponible) {
            montoDisponible -= monto;
            System.out.println("Pago de $" + monto + " procesado. Saldo: $" + montoDisponible);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public String getTitular() { return titular; }
    public double getSaldo()   { return montoDisponible; }
}
