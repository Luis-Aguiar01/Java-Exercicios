package Ingresso;

public class IngressoTeste {

    public static void main(String[] args) {

        Ingresso[] ingressos = new Ingresso[3];
        IngressoVIP ingresso1 = new IngressoVIP("Show", 500, 200);
        IngressoVIP ingresso2 = new IngressoVIP("Jogo", 200, 150);
        IngressoVIP ingresso3 = new IngressoVIP("Filme", 10.00, 20);

        ingressos[0] = ingresso1;
        ingressos[1] = ingresso2;
        ingressos[2] = ingresso3;

        System.out.println("Ingressos:\n");

        System.out.println("----------------------------------------------------");

        for (int i = 0; i < ingressos.length; i++) {
            System.out.println(ingressos[i].toString());
            System.out.println("----------------------------------------------------");
        }
    }
}