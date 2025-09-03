package br.com.exemplo.banco;

// Classe abstrata representa o modelo geral de uma conta
public abstract class Conta {
    private final int numero;
    private final String titular;
    protected double saldo; // protegido para permitir acesso pelas subclasses

    public Conta(int numero, String titular, double saldoInicial) {
        if (numero <= 0) throw new IllegalArgumentException("Número da conta inválido");
        if (titular == null || titular.isBlank()) throw new IllegalArgumentException("Titular inválido");
        if (saldoInicial < 0) throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito deve ser positivo.");
            return;
        }
        saldo += valor;
    }

    public abstract void sacar(double valor);
    public abstract void exibirDados();

    public int getNumero() { return numero; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
}
