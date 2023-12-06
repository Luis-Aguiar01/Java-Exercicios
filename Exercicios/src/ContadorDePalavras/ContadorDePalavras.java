package ContadorDePalavras;

import java.util.ArrayList;
import java.util.Objects;

public class ContadorDePalavras {

    private ArrayList<Palavra> palavras;

    public ContadorDePalavras() {
        palavras = new ArrayList<Palavra>();
    }

    public int adicionar(String palavra) {
        String palavraLowerCase = palavra.toLowerCase();

        for (int i = 0; i < palavras.size(); i++) {
            if (Objects.equals(palavras.get(i).getPalavra(), palavraLowerCase)) {
                palavras.get(i).incrementarContador();
                return 1;
            }
        }

        Palavra novaPalavra = new Palavra(palavraLowerCase);
        palavras.add(novaPalavra);

        return 0;
    }

    public Palavra pesquisarPalavra(String palavra) {
        for (int i = 0; i < palavras.size(); i++) {
            if (Objects.equals(palavras.get(i), palavra)) {
                return palavras.get(i);
            }
        }

        return null;
    }

    public void remove(String palavra) {
        String palavraLowerCase = palavra.toLowerCase();

        for (int i = 0; i < palavras.size(); i++) {
            if (Objects.equals(palavras.get(i).getPalavra(), palavraLowerCase)) {
                if (palavras.get(i).getContador() > 1) {
                    palavras.get(i).decrementarContador();
                }
                else {
                    palavras.remove(i);
                }
            }
        }
    }

    public void imprimirLista() {
        for (int i = 0; i < palavras.size(); i++) {
            System.out.println(palavras.get(i));
        }
    }
}
