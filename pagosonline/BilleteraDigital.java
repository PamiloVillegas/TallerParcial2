package pagosonline;

public class BilleteraDigital extends MetodoPago {

    private double cashback;   // porcentaje que se devuelve, ej: 5.0 = 5%

    public BilleteraDigital(String titular, double montoDisponible, double cashback) {
        super(titular, montoDisponible);
        this.cashback = cashback;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("----- Recibo Billetera Digital -----");
        System.out.println("Titular       : " + titular);
        System.out.printf ("Saldo previo  : $%.2f%n", montoDisponible);
        System.out.printf ("Monto a pagar : $%.2f%n", monto);
        System.out.printf ("Cashback      : %.1f%%%n", cashback);

        if (monto <= montoDisponible) {
            montoDisponible -= monto;

            double montoCashback = monto * cashback / 100;
            montoDisponible += montoCashback;

            System.out.println("Estado        : APROBADO ✓");
            System.out.printf ("Cashback ganado: $%.2f%n", montoCashback);
            System.out.printf ("Saldo final   : $%.2f%n", montoDisponible);
        } else {
            System.out.println("Estado        : RECHAZADO — saldo insuficiente");
        }
        System.out.println("------------------------------------");
    }
}
