package Pessoa;

public abstract class Empregado extends Pessoa {

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        setImposto(imposto);
        setCodigoSetor(codigoSetor);
        setSalarioBase(salarioBase);
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0.0) {
            throw new IllegalArgumentException("O salário não pode ser nulo ou negativo.");
        }
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        if (imposto < 0.0) {
            throw new IllegalArgumentException("A percentual do imposto não pode ser negativo.");
        }
        this.imposto = imposto;
    }

    public double calcularSalario() {
        return getSalarioBase() * (1 - getImposto());
    }

    @Override
    public String toString() {
        return String.format("%s\nCodigo do setor: %d\nSalário base: %.2f\nImposto: %.2f\n", super.toString(), getCodigoSetor(), getSalarioBase(), getImposto());
    }
}