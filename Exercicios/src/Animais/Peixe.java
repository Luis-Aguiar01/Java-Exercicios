package Animais;

public class Peixe extends Animal {

    private String caracteristica;

    public Peixe(String nome, String caracteristica, String cor, String ambiente, double velocidade, double comprimento) {
        super(nome, cor, ambiente, comprimento, velocidade, 0);
        alterarCaracteristica(caracteristica);
    }

    public void alterarCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return this.caracteristica;
    }

    @Override
    public String toString() {
        return String.format("%s\nCaracterística: %s\n", super.toString(), getCaracteristica());
    }
}