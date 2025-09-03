package br.com.exemplo.banco;

public class Banco {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente(101, "Rodrigo", 1000);
        Conta c2 = new ContaPoupanca(202, "Maria", 500);

        c1.depositar(200);
        c1.sacar(300);
        c1.exibirDados();

        c2.depositar(100);
        c2.sacar(50);
        if (c2 instanceof ContaPoupanca poupanca) {
            poupanca.aplicarJuros();
        }
        c2.exibirDados();

        Conta[] contas = { c1, c2, new ContaCorrente(303, "Ana", 250) };
        for (Conta conta : contas) {
            conta.exibirDados();
        }
    }
}
