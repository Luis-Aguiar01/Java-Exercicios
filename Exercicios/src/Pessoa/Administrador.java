package Pessoa;

public class Administrador extends Empregado {

    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        setAjudaDeCusto(ajudaDeCusto);
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        if (ajudaDeCusto < 0.0) {
            throw new IllegalArgumentException("A ajuda de custo não pode ser negativa.");
        }
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + getAjudaDeCusto();
    }

    @Override
    public String toString() {
        return String.format("%sAjuda de custo: %.2f\nSalário: R$%.2f\n", super.toString(), getAjudaDeCusto(), calcularSalario());
    }
}