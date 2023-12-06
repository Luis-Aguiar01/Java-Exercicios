package Pessoa;

public abstract class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome, String endereco) {
        this(nome, endereco, "");
    }

    public Pessoa(String nome) {
        this(nome, "", "");
    }

    public Pessoa(String nome, String endereco, String telefone) {
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nEndereço: %s\nTelefone: %s", getNome(), getEndereco(), getTelefone());
    }
}