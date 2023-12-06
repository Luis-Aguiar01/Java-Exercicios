package MaquinhaDeKaraoke;

public class TesteMaquinaDeKaraoke {

    public static void main(String[] args) {

        MaquinaDeKaraoke maquinaDeKaraoke = new MaquinaDeKaraoke();

        System.out.println("Músicas dentro da máquina depois de sua criação:");
        System.out.println(maquinaDeKaraoke);

        System.out.println("\nMúsicas na máquina de karaokê, depois de adicionar algumas musicas:");

        maquinaDeKaraoke.adicionarMusica("Enemy");
        maquinaDeKaraoke.adicionarMusica("Warriors");
        maquinaDeKaraoke.adicionarMusica("Imagine");
        maquinaDeKaraoke.adicionarMusica("Let it be");
        maquinaDeKaraoke.adicionarMusica("Enemy");

        System.out.println(maquinaDeKaraoke);

        System.out.println("\nMúsicas na máquina de karaokê depois de duas músicas serem tocadas:z");

        maquinaDeKaraoke.tocarMusica();
        maquinaDeKaraoke.tocarMusica();

        System.out.println(maquinaDeKaraoke);

        System.out.println("\nMúsicas na máquina de karaokê depois de adiantar duas músicas:");

        maquinaDeKaraoke.adiantarMusica("Imagine");
        maquinaDeKaraoke.adiantarMusica("Enemy");

        System.out.println(maquinaDeKaraoke);

        System.out.println("\nMúsicas na máquina de karaokê depois de adiar duas músicas:");

        maquinaDeKaraoke.adiarMusica("Imagine");
        maquinaDeKaraoke.adiarMusica("Let it be");

        System.out.println(maquinaDeKaraoke);
    }
}