package Empregado;

public class VendedorTeste {

    public static void main(String[] args) {

        Empregado[] empregados = new Empregado[2];
        Gerente gerente = new Gerente("Luis", 2000, "Financeiro");
        Vendedor vendedor = new Vendedor("Henrique", 1500, 0.10);

        empregados[0] = gerente;
        empregados[1] = vendedor;

        System.out.println("Informações dos empregados:\n");

        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < empregados.length; i++) {
            System.out.println(empregados[i].toString());
            System.out.println("-----------------------------------------------------");
        }
    }
}