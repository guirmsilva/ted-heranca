public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(double saldoInicial, String titular, double limite) {
        super(saldoInicial, titular);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Limite excedido.");
        }
    }
}