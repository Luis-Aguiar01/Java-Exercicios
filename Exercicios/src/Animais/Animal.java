package Animais;

public abstract class Animal {

    private String nome;
    private double comprimento;
    private int numeroDePatas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal(String nome, String cor, String ambiente, double comprimento, double velocidade, int patas) {
        alterarNome(nome);
        alterarCor(cor);
        alterarAmbiente(ambiente);
        alterarComprimento(comprimento);
        alterarVelocidade(velocidade);
        alterarPatas(patas);
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void alterarComprimento(double comprimento) {
        if (comprimento <= 0.0) {
            throw new IllegalArgumentException("O comprimento não pode ser nulo ou negativo.");
        }
        this.comprimento = comprimento;
    }

    public void alterarPatas(int patas) {
        if (patas < 0) {
            throw new IllegalArgumentException("O número de patas não pode ser negativo.");
        }
        this.numeroDePatas = patas;
    }

    public void alterarCor(String cor) {
        this.cor = cor;
    }

    public void alterarAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void alterarVelocidade(double velocidade) {
        if (velocidade < 0.0) {
            throw new IllegalArgumentException("A velocidade não pode ser negativa.");
        }
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    @Override
    public String toString() {
        return String.format("Animal: %s\nComprimento: %.2f m\nNúmero de patas: %d\nCor: %s\nAmbiente: %s\nVelocidade: %.2f km/h", getNome(), getComprimento(), getNumeroDePatas(), getCor(), getAmbiente(), getVelocidade());
    }
}