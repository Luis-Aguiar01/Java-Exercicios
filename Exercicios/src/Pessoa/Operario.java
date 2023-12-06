package Pessoa;

public class Operario extends Empregado {

    private double valorDeProducao;
    private double comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorDeProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        setValorDeProducao(valorDeProducao);
        setComissao(comissao);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        if (comissao < 0.0) {
            throw new IllegalArgumentException("A comissão não pode ser negativa.");
        }
        this.comissao = comissao;
    }

    public double getValorDeProducao() {
        return valorDeProducao;
    }

    public void setValorDeProducao(double valorDeProducao) {
        if (valorDeProducao < 0.0) {
            throw new IllegalArgumentException("O valor de produção não pode ser negativo.");
        }
        this.valorDeProducao = valorDeProducao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (getValorDeProducao() * getComissao());
    }
    
    @Override
    public String toString() {
        return String.format("%sValor de produção: R$%.2f\nTaxa de comissao: %.2f\nSalário: R$%.2f\n", super.toString(), getValorDeProducao(), getComissao(), calcularSalario());
    }
}