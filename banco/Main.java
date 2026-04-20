package banco;

public class Main {

    public static void main(String[] args) {

        // Cuenta de ahorros
        CuentaAhorros ahorro = new CuentaAhorros("Laura", "001", 1000, 0.05);

        ahorro.depositar(500);
        ahorro.aplicarInteres();
        System.out.println("Saldo ahorro: " + ahorro.consultarSaldo());

        System.out.println("\n------------------\n");

        // Cuenta corriente
        CuentaCorriente corriente = new CuentaCorriente("Carlos", "002", 1000, 500);

        corriente.retirar(1200); // usa sobregiro
        System.out.println("Saldo corriente: " + corriente.consultarSaldo());

        corriente.retirar(400); // excede límite
    }
}

