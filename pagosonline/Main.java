package pagosonline;

public class Main {
    public static void main(String[] args) {

        // Crédito: $500.000 en saldo + $300.000 de límite
        TarjetaCredito  credito   = new TarjetaCredito("Ana Torres", 500000, 300000);
        // Débito: $400.000 en cuenta
        TarjetaDebito   debito    = new TarjetaDebito("Carlos Ruiz", 400000);
        // Billetera: $600.000 con 5% de cashback
        BilleteraDigital billetera = new BilleteraDigital("Laura Gómez", 600000, 5);

        // --- 3 pagos con Tarjeta Crédito ---
        System.out.println("========== TARJETA CRÉDITO ==========");
        credito.procesarPago(200000);   // paga con saldo
        credito.procesarPago(400000);   // agota saldo y usa crédito
        credito.procesarPago(250000);   // sin capacidad

        // --- 3 pagos con Tarjeta Débito ---
        System.out.println("========== TARJETA DÉBITO ===========");
        debito.procesarPago(150000);    // aprobado
        debito.procesarPago(100000);    // aprobado
        debito.procesarPago(300000);    // rechazado — no alcanza

        // --- 3 pagos con Billetera Digital ---
        System.out.println("========== BILLETERA DIGITAL =========");
        billetera.procesarPago(200000); // aprobado + cashback
        billetera.procesarPago(100000); // aprobado + cashback
        billetera.procesarPago(400000); // rechazado

        // --- Resumen final ---
        System.out.println("============= SALDOS FINALES =============");
        System.out.printf("%-20s $%.2f%n", credito.getTitular(),   credito.getSaldo());
        System.out.printf("%-20s $%.2f%n", debito.getTitular(),    debito.getSaldo());
        System.out.printf("%-20s $%.2f%n", billetera.getTitular(), billetera.getSaldo());
    }
}
