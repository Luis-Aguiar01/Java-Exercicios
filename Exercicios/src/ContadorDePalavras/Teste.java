package ContadorDePalavras;

public class Teste {

    public static void main(String[] args) {

        ContadorDePalavras contadorDePalavras = new ContadorDePalavras();

        contadorDePalavras.adicionar("Java");
        contadorDePalavras.adicionar("Java");
        contadorDePalavras.adicionar("JAVA");
        contadorDePalavras.adicionar("Mesa");
        contadorDePalavras.adicionar("Caderno");
        contadorDePalavras.adicionar("Teclado");

        contadorDePalavras.remove("Java");
        contadorDePalavras.remove("Teclado");

        contadorDePalavras.imprimirLista();
    }
}