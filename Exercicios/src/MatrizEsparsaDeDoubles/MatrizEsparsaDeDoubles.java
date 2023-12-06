package MatrizEsparsaDeDoubles;
public class MatrizEsparsaDeDoubles {

    private int linhas;
    private int colunas;
    private double matriz[][];

    public MatrizEsparsaDeDoubles(int linhas, int colunas) {
        this(linhas, colunas, 0.0);
    }

    public MatrizEsparsaDeDoubles(int linhas, int colunas, double valor) {
        setLinhas(linhas);
        setColunas(colunas);
        matriz = new double[linhas][colunas];
        preencherMatriz(valor);
    }

    private void setLinhas(int linhas) {
        if (linhas > 0) {
            this.linhas = linhas;
        }
    }

    private void setColunas(int colunas) {
        if (colunas > 0) {
            this.colunas = colunas;
        }
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public double[][] getMatriz() {
        return matriz;
    }

    public boolean eIgual(MatrizEsparsaDeDoubles outro) {

        if (colunas != outro.getColunas()) {
            return false;
        }

        if (linhas != outro.getLinhas()) {
            return false;
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] != outro.getMatriz()[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public double[][] criaTransposta() {

        double[][] matrizTransposta = new double[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        return matrizTransposta;
    }

    public void exibirMatriz() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%5.2f ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public void setValor(int linha, int coluna, double valor) {
        matriz[linha][coluna] = valor;
    }

    public double getValor(int linha, int coluna) {
        return matriz[linha][coluna];
    }

    public void preencherMatriz(double valor) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = valor;
            }
        }
    }
}