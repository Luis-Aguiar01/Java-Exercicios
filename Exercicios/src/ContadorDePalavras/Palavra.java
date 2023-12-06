package ContadorDePalavras;

public class Palavra {

    private String palavra;
    private int contador;

    public Palavra(String palavra) {
        setPalavra(palavra);
        setContador(1);
    }

    public String getPalavra() {
        return palavra;
    }

    public int getContador() {
        return contador;
    }

    private void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void incrementarContador() {
        this.contador++;
    }

    public void decrementarContador() {
        this.contador--;
    }

    @Override
    public String toString() {
        return String.format("%-15s | %2d", getPalavra(), getContador());
    }
}