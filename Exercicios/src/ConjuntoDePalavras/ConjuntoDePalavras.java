package ConjuntoDePalavras;

import java.util.ArrayList;

public class ConjuntoDePalavras {

    private ArrayList<String> palavras;

    public ConjuntoDePalavras() {
        palavras = new ArrayList<>();
    }

    public void add(String palavra) {
        palavra = palavra.toLowerCase();
        palavras.add(palavra);
    }

    public void remove() {
        palavras.remove(palavras.size() - 1);
    }

    public void remove(String palavra) {
        palavras.remove(palavra.toLowerCase());
    }

    public ArrayList<String> getPalavras() {
        return palavras;
    }

    public boolean contemTodas(String stringDePalavras) {

        String[] palavras = stringDePalavras.toLowerCase().split(" ");

        for (int i = 0; i < palavras.length; i++) {
            if (!this.palavras.contains(palavras[i])) {
                return false;
            }
        }

        return true;
    }

    public boolean contemTodas(ConjuntoDePalavras outro) {

        for (int i = 0; i < outro.getPalavras().size(); i++) {
            if (!this.palavras.contains(outro.getPalavras().get(i))) {
                return false;
            }
        }

        return true;
    }

    public void removeTodas(ConjuntoDePalavras outro) {

        String palavras[] = outro.getPalavras().toArray(new String[0]);

        for (int i = 0; i < palavras.length; i++) {
            this.palavras.remove(palavras[i].toLowerCase());
        }
    }

    public ConjuntoDePalavras interseccao(ConjuntoDePalavras outro) {
        ConjuntoDePalavras novaInstancia = new ConjuntoDePalavras();

        for (int i = 0; i < outro.getPalavras().size(); i++) {
            if (palavras.contains(outro.getPalavras().get(i))) {
                novaInstancia.getPalavras().add(outro.getPalavras().get(i));
            }
        }

        return novaInstancia;
    }

    public String toString() {
        return String.format("%s\n", palavras.toString());
    }
}