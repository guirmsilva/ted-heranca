public class ContaInvestimento extends Conta {
    private double taxaRendimento;

    public ContaInvestimento(double saldoInicial, String titular, double taxaRendimento) {
        super(saldoInicial, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public void calcularRendimento() {
        double rendimento = saldo * taxaRendimento;
        saldo += rendimento;
        System.out.println("Rendimento calculado: " + rendimento + ". Saldo atual: " + saldo);
    }
}
