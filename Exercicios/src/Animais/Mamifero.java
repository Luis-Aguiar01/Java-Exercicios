package Animais;

public class Mamifero  extends Animal {

    private String alimentoPreferido;

    public Mamifero(String nome, String cor, String ambiente, double comprimento, double velocidade, String alimentoPreferido) {
        super(nome, cor, ambiente, comprimento, velocidade, 4);
        alterarAlimentoPreferido(alimentoPreferido);
    }

    public void alterarAlimentoPreferido(String alimento) {
        this.alimentoPreferido = alimento;
    }

    public String getAlimentoPreferido() {
        return this.alimentoPreferido;
    }

    @Override
    public String toString() {
        return String.format("%s\nAlimento preferido: %s\n", super.toString(), getAlimentoPreferido());
    }
}