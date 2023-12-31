package Pessoa;

public class Fornecedor extends Pessoa {

    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        setValorCredito(valorCredito);
        setValorDivida(valorDivida);
    }


    public double obterSaldo() {
        return getValorCredito() - getValorDivida();
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    @Override
    public String toString() {
        return String.format("%s\nValor de crédito: %.2f\nValor de dívida: %.2f\nSaldo: %.2f\n", super.toString(), getValorCredito(), getValorDivida(), obterSaldo());
    }
}
