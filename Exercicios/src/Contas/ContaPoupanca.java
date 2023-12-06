package Contas;

public class ContaPoupanca extends ContaBancaria {

    private int diaDeRendimento;

    public ContaPoupanca(String cliente, int numeroDaConta, int diaDeRendimento) {
        super(cliente, numeroDaConta);
        setDiaDeRendimento(diaDeRendimento);
    }

    public void calcularNovoSaldo(double taxa) {
        double valor = getSaldo() * taxa;
        super.depositar(valor);
    }

    private void setDiaDeRendimento(int dia) {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Valor de dia inválido.");
        }
        this.diaDeRendimento = dia;
    }

    @Override
    public String toString() {
        return String.format("%sDia do rendimento: %d\n", super.toString(), diaDeRendimento);
    }
}