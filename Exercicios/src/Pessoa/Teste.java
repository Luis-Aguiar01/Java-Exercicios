package Pessoa;

public class Teste {

    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[4];
        Administrador administrador = new Administrador("João", "Av. Sol", "1111-1111", 10, 2000, 0.10, 500);
        Fornecedor fornecedor = new Fornecedor("Maria", "Av. Lua", "2222-2222", 2000, 1000);
        Operario operario = new Operario("Luis", "Av. Jupiter", "3333-3333", 12, 2000, 0.10, 1000, 0.15);
        Vendedor vendedor = new Vendedor("Henrique", "Av. Estrela", "4444-4444", 15, 1000, 0.10, 1500, 0.20);

        pessoas[0] = administrador;
        pessoas[1] = fornecedor;
        pessoas[2] = operario;
        pessoas[3] = vendedor;

        System.out.println("Dados das contas:\n");

        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i]);
            System.out.println("-------------------------------------------------------");
        }

    }

}
