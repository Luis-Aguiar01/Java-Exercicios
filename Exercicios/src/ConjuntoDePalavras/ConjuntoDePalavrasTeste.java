package ConjuntoDePalavras;

public class ConjuntoDePalavrasTeste {

    public static void main(String[] args) {

        ConjuntoDePalavras conjunto = new ConjuntoDePalavras();
        ConjuntoDePalavras conjunto2 = new ConjuntoDePalavras();
        ConjuntoDePalavras conjunto3;

        conjunto.add("Java");
        conjunto.add("CANETA");
        conjunto.add("garrafa");

        System.out.println(conjunto);

        conjunto.remove("JAVA");
        conjunto.remove("GaRRaFa");

        System.out.println(conjunto);
        System.out.println(conjunto.getPalavras());
        System.out.println(conjunto.contemTodas("Caneta Java"));
        System.out.println(conjunto.contemTodas("Caneta"));

        conjunto2.add("Caneta");

        System.out.println(conjunto.contemTodas(conjunto2));

        conjunto2.add("Java");

        System.out.println(conjunto.contemTodas(conjunto2));

        conjunto.removeTodas(conjunto2);
        System.out.println(conjunto);

        conjunto.add("Java");
        conjunto.add("Mouse");
        conjunto2.add("Java");

        conjunto3 = conjunto2.interseccao(conjunto);

        System.out.println(conjunto3);
    }
}