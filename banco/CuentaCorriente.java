package banco;

public class CuentaCorriente extends CuentaBancaria {

    private double sobregiroPermitido;

    public CuentaCorriente(String titular, String numeroCuenta, double saldoInicial, double sobregiroPermitido) {
        super(titular, numeroCuenta, saldoInicial);
        this.sobregiroPermitido = sobregiroPermitido;
    }

    @Override
    public void retirar(double monto) {

        if (monto > 0 && monto <= (saldo + sobregiroPermitido)) {

            saldo -= monto;
            System.out.println("Retiro realizado (con posible sobregiro): " + monto);

        } else {

            System.out.println("Límite de sobregiro excedido");
        }
    }
}

