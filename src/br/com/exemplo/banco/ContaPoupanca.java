package br.com.exemplo.banco;

// Conta poupança permite aplicar juros sobre o saldo
public class ContaPoupanca extends Conta {
    private final double taxaJuros = 0.05; // 5%

    public ContaPoupanca(int numero, String titular, double saldoInicial) {
        super(numero, titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque deve ser positivo.");
            return;
        }
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque na conta poupança.");
        }
    }

    public void aplicarJuros() {
        saldo += saldo * taxaJuros;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Conta Poupança - Titular: %s, Número: %d, Saldo: %.2f%n",
                getTitular(), getNumero(), getSaldo());
    }
}
