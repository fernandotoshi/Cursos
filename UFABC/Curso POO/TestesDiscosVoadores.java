import java.util.Scanner;

public class TestesDiscosVoadores {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int numLinhas = leitor.nextInt();
        int numCol = leitor.nextInt();
        int[][] matriz = construirMatriz(numLinhas, numCol);
        int[][] matrizLinha = ordenarLinhas(matriz);
        int[][] matrizColuna = ordenarColunas(matrizLinha);
        imprimeMatriz(matrizColuna);
    }

    public static int[][] construirMatriz(int linhas, int colunas) {
        int[][] matriz = new int[numLinhas][numCol];
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numCol; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }
        return matriz;
    }

    public static int[][] ordenarLinhas(int[][] matriz) {
        int[] vetorAuxiliar = new int[numCol];
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numCol; j++) {
                if (matriz[i][j] > matriz[i+1][j]) {
                    vetorAuxiliar[i] = matriz[i];
                    matriz[i] = matriz[i+1];
                    matriz[i+1] = vetorAuxiliar[i];

                }
            }
        }
    }

    public static int[][] ordenarColunas(int[][] matrizOrdLinhas) {

    }

    public static void imprimeMatriz(int[][] matrizOrdColunas) {

    }
}