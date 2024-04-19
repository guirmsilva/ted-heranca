public class Main {
    public static void main(String[] args) {
        Conta contaComum = new Conta(1000, "João");
        System.out.println("Conta comum:");
        contaComum.mostrarSaldo();
        contaComum.depositar(500);
        contaComum.sacar(200);
        contaComum.mostrarSaldo();

        ContaInvestimento contaInvestimento = new ContaInvestimento(2000, "Maria", 0.05);
        System.out.println("\nConta de investimento:");
        contaInvestimento.mostrarSaldo();
        contaInvestimento.calcularRendimento();
        contaInvestimento.mostrarSaldo();

        ContaEspecial contaEspecial = new ContaEspecial(3000, "Pedro", 1000);
        System.out.println("\nConta especial:");
        contaEspecial.mostrarSaldo();
        contaEspecial.depositar(200);
        contaEspecial.sacar(4000);
        contaEspecial.mostrarSaldo();
    }
}