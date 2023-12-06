package Animais;

public class TesteAnimais {

    public static void main(String[] args) {

        Animal[] animais = new Animal[2];

        Mamifero mamifero = new Mamifero("Gato", "Várias", "Terra", 0.50, 5, "Peixe");

        Peixe peixe = new Peixe("Atum", "O atum é considerado um dos peixes mais hidrodinâmicos", "Branco", "Mar", 200, 0.90);

        animais[0] = mamifero;
        animais[1] = peixe;

        System.out.println("\nExibindo os dados dos animais:\n");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < animais.length; i++) {
            System.out.println(animais[i].toString());
            System.out.println("----------------------------------------------------------");
        }
    }
}