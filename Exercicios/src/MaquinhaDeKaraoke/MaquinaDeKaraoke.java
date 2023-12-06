package MaquinhaDeKaraoke;

import java.util.ArrayList;

public class MaquinaDeKaraoke {

    private ArrayList<String> listaMusicas;

    public MaquinaDeKaraoke() {
        listaMusicas = new ArrayList<>();
    }

    public void adicionarMusica(String musica) {
        listaMusicas.add(musica);
    }

    public void listarMusicas() {
        for (int i = 0; i < listaMusicas.size(); i++) {
            System.out.printf("%-2d - %s\n", (i + 1), listaMusicas.get(i));
        }
    }

    public void tocarMusica() {
        String musica = listaMusicas.remove(0);
        System.out.printf("Tocando \"%s\"\n", musica);
    }

    public void remove(String musica) {
        int index = listaMusicas.lastIndexOf(musica);
        String titulo = listaMusicas.remove(index);

        if (titulo != null) {
            System.out.printf("\"%s\" retirada da lista.", musica);
        }
        else {
            System.out.println("Musica não disponível na lista.");
        }
    }

    public void removeTodas(String musica) {
        if (listaMusicas.contains(musica)) {
            while (listaMusicas.contains(musica)) {
                listaMusicas.remove(musica);
            }
            System.out.println("Todas as ocorrências da música foram retiradas.");
        }
        else {
            System.out.println("Não há nenhuma ocorrência da música para ser removida.");
        }
    }

    public void adiarMusica(String musica) {
        if (listaMusicas.contains(musica)) {
            int index = listaMusicas.indexOf(musica);

            if (index != (listaMusicas.size() - 1) ) {
                String guardarMusica = listaMusicas.get(index + 1);
                listaMusicas.set(index + 1, musica);
                listaMusicas.set(index, guardarMusica);
            }
            else {
                System.out.println("Não é possível adiar a última música.");
            }
        }
        else {
            System.out.println("A música informada não existe na lista.");
        }
    }

    public void adiantarMusica(String musica) {
        if (listaMusicas.contains(musica)) {
            int index = listaMusicas.indexOf(musica);

            if (index != 0) {
                String guardarMusica = listaMusicas.get(index - 1);
                listaMusicas.set(index - 1, musica);
                listaMusicas.set(index, guardarMusica);
            }
            else {
                System.out.println("Não é possível adiantar a primeira posição.");
            }
        }
        else {
            System.out.println("A música informada nao existe na lista.");
        }
    }

    @Override
    public String toString() {
        return String.format("%s", listaMusicas);
    }
}