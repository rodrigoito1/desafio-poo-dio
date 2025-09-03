package br.com.exemplo.banco;

// Conta corrente cobra taxa fixa em cada saque
public class ContaCorrente extends Conta {
    private final double taxaSaque = 2.5;

    public ContaCorrente(int numero, String titular, double saldoInicial) {
        super(numero, titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque deve ser positivo.");
            return;
        }
        double valorComTaxa = valor + taxaSaque;
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
        } else {
            System.out.println("Saldo insuficiente para saque na conta corrente.");
        }
    }

    @Override
    public void exibirDados() {
        System.out.printf("Conta Corrente - Titular: %s, Número: %d, Saldo: %.2f%n",
                getTitular(), getNumero(), getSaldo());
    }
}
