package Empregado;

public abstract class Empregado {

    private String nome;
    private double salario;

    public Empregado(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0.0) {
            throw new IllegalArgumentException("O valor do salário não pode ser negativo.");
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nSalário: %.2f", getNome(), getSalario());
    }
}