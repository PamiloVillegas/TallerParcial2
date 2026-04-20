package pagosonline;

public class TarjetaDebito extends MetodoPago {

    public TarjetaDebito(String titular, double montoDisponible) {
        super(titular, montoDisponible);
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("------ Recibo Tarjeta Débito ------");
        System.out.println("Titular      : " + titular);
        System.out.printf ("Saldo previo : $%.2f%n", montoDisponible);
        System.out.printf ("Monto a pagar: $%.2f%n", monto);

        if (monto <= montoDisponible) {
            montoDisponible -= monto;
            System.out.println("Estado       : APROBADO ✓");
            System.out.printf ("Saldo final  : $%.2f%n", montoDisponible);
        } else {
            System.out.println("Estado       : RECHAZADO — saldo insuficiente");
            System.out.printf ("Faltante     : $%.2f%n", monto - montoDisponible);
        }
        System.out.println("-----------------------------------");
    }
}
