package Ingresso;

public abstract class Ingresso {

    private double valor;
    private String nome;

    public Ingresso(String nome, double valor) {
        setNome(nome);
        setValor(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0.0) {
            throw new IllegalArgumentException("O valor do ingresso não pode ser negativo.");
        }
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nValor: R$%.2f", getNome(), getValor());
    }
}