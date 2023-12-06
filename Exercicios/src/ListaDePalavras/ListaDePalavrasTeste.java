package ListaDePalavras;

public class ListaDePalavrasTeste {

    public static void main(String[] args) {

        ListaDePalavras lista = new ListaDePalavras();

        lista.add("java");
        lista.add("java");
        lista.add("jAvA");
        lista.add("JAVA");
        lista.add("GARRAFA");

        System.out.println(lista.contar("java"));
        System.out.println(lista.contar("JAVA"));
        System.out.println(lista.contar("oi"));
    }
}