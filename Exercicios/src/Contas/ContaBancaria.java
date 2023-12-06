package Contas;

public abstract class ContaBancaria {

    private String cliente;
    private int numeroDaConta;
    private double saldo;

    public ContaBancaria(String cliente, int numeroDaConta) {
        setCliente(cliente);
        setNumeroDaConta(numeroDaConta);
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Você não possui este valor para o saque.");
        }
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor <= 0.0) {
            throw new IllegalArgumentException("Valor inválido para o saque. Digite um valor > 0.0");
        }
        this.saldo += valor;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    private void setNumeroDaConta(int numero) {
        this.numeroDaConta = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getCliente() {
        return this.cliente;
    }

    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }

    @Override
    public String toString() {
        return String.format("Cliente: %s\nNúmero da conta: %d\nSaldo: %.2f\n", cliente, numeroDaConta, saldo);
    }
}