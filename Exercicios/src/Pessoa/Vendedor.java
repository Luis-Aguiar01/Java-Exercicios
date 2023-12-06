package Pessoa;

public class Vendedor extends Empregado {

    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        setValorVendas(valorVendas);
        setComissao(comissao);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        if (comissao < 0.0) {
            throw new IllegalArgumentException("A taxa de comissão não pode ser negativa");
        }
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        if (valorVendas < 0.0) {
            throw new IllegalArgumentException("O valor de vendas não pode ser negativo.");
        }
        this.valorVendas = valorVendas;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (getValorVendas() * getComissao());
    }

    @Override
    public String toString() {
        return String.format("%sValor de vendas: R$%.2f\nComissao: %.2f\nSalário: R$%.2f\n", super.toString(), getValorVendas(), getComissao(), calcularSalario());
    }
}
