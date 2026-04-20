package banco;

public class CuentaAhorros extends CuentaBancaria {

    private double tasaInteres;

    public CuentaAhorros(String titular, String numeroCuenta, double saldoInicial, double tasaInteres) {
        super(titular, numeroCuenta, saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {

        double interes = saldo * tasaInteres;
        saldo += interes;

        System.out.println("Interés aplicado: " + interes);
    }
}

