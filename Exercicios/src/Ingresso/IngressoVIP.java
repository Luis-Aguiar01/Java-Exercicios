package Ingresso;

public class IngressoVIP extends Ingresso {

    private double valorAdicional;

    public IngressoVIP(String nome, double valor, double valorAdicional) {
        super(nome, valor);
        setValorAdicional(valorAdicional);
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        if (valorAdicional < 0.0) {
            throw new IllegalArgumentException("O valor adicional não pode ser negativo.");
        }
        this.valorAdicional = valorAdicional;
    }

    public double retornarValorTotal() {
        return getValor() + getValorAdicional();
    }

    @Override
    public String toString() {
        return String.format("%s\nValor adicional: R$%.2f\nValor total: R$%.2f\n", super.toString(), getValorAdicional(), retornarValorTotal());
    }
}
