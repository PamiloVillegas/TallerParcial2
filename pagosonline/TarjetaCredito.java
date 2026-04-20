package pagosonline;

public class TarjetaCredito extends MetodoPago {

    private double limiteCredito;

    public TarjetaCredito(String titular, double montoDisponible, double limiteCredito) {
        super(titular, montoDisponible);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void procesarPago(double monto) {
        double capacidadTotal = montoDisponible + limiteCredito;

        System.out.println("---- Recibo Tarjeta Crédito ----");
        System.out.println("Titular       : " + titular);
        System.out.printf ("Saldo previo  : $%.2f%n", montoDisponible);
        System.out.printf ("Límite crédito: $%.2f%n", limiteCredito);
        System.out.printf ("Capacidad total: $%.2f%n", capacidadTotal);
        System.out.printf ("Monto a pagar : $%.2f%n", monto);

        if (monto <= capacidadTotal) {
            if (monto <= montoDisponible) {
                montoDisponible -= monto;
            } else {
                double resto = monto - montoDisponible;
                montoDisponible = 0;
                limiteCredito  -= resto;
            }
            System.out.println("Estado        : APROBADO ✓");
            System.out.printf ("Saldo final   : $%.2f%n", montoDisponible);
            System.out.printf ("Crédito restante: $%.2f%n", limiteCredito);
        } else {
            System.out.println("Estado        : RECHAZADO — sin capacidad suficiente");
        }
        System.out.println("--------------------------------");
    }
}
