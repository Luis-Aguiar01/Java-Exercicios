package Empregado;

public class Vendedor extends Empregado {

    private double percentualComissao;

    public Vendedor(String nome, double salario, double percentualComissao) {
        super(nome, salario);
        setPercentualComissao(percentualComissao);
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        if (percentualComissao < 0.0) {
            throw new IllegalArgumentException("O percentual não pode ser negativo.");
        }
        this.percentualComissao = percentualComissao;
    }

    public double retornarSalario() {
        return getSalario() * (1 + getPercentualComissao());
    }

    @Override
    public String toString() {
        return String.format("%s\nPercentual de Comissao: %.2f\nSalário: %.2f\n", super.toString(), getPercentualComissao(), retornarSalario());
    }
}