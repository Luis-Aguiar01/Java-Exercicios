package MatrizEsparsaDeDoubles;

public class MatrizEsparsaDeDoublesTeste {

    public static void main(String[] args) {

        MatrizEsparsaDeDoubles matriz = new MatrizEsparsaDeDoubles(5, 5);
        MatrizEsparsaDeDoubles matriz2 = new MatrizEsparsaDeDoubles(2, 2, 5.5);
        double[][] matriz3;

        matriz.exibirMatriz();

        System.out.println();

        matriz2.setValor(0, 0, 2.55);
        matriz2.setValor(0, 1, 3.8);
        matriz2.setValor(1, 0, 5.85);
        matriz2.setValor(1, 1, 2.55);

        matriz2.exibirMatriz();

        matriz3 = matriz2.criaTransposta();

        System.out.println();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%5.2f ", matriz3[i][j]);
            }
            System.out.println();
        }
    }
}