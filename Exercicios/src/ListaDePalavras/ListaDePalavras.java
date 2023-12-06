package ListaDePalavras;

import java.util.ArrayList;
import java.util.Objects;

public class ListaDePalavras {

    private ArrayList<String> palavras;

    public ListaDePalavras() {
        palavras = new ArrayList<>();
    }

    public void add(String palavra) {
        palavras.add(palavra.toLowerCase());
    }

    public int contar(String palavra) {
        int contador = 0;

        if (this.palavras.contains(palavra.toLowerCase())) {

            for (int i = 0; i < palavras.size(); i++) {
                if (Objects.equals(palavras.get(i), palavra.toLowerCase())) {
                    contador++;
                }
            }
        }

        return contador;
    }
}