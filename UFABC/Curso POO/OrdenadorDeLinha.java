import java.util.Scanner;

public class OrdenadorDeLinha {
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int numLinha = leitor.nextInt();
        int numCol = leitor.nextInt();
        int[][] matriz = montaMatriz(numLinha, numCol);
        int[][] matrizOrdenada = ordenaMatriz(matriz);
        imprimeMatriz(matrizOrdenada);
    }
    
    public static int[][] montaMatriz(int numLinha, int numCol) {
        int[][] matriz = new int[numLinha][numCol];
        for (int i = 0; i < numLinha; i++) {
            for (int j = 0; j < numCol; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }
        return matriz;
    }

    public static int[][] ordenaMatriz(int[][] matrizParaOrdenar) {
        int[] vetorAuxiliar = new int[matrizParaOrdenar[0].length];
        for (int i = 0; i < matrizParaOrdenar.length; i++) {
            for (int k = 0; k < matrizParaOrdenar.length; k++) {
                for (int j = 0; j < matrizParaOrdenar[0].length; j++) {
                    if (matrizParaOrdenar[i][j] < matrizParaOrdenar[k][j]) {
                        vetorAuxiliar = matrizParaOrdenar[i];
                        matrizParaOrdenar[i] = matrizParaOrdenar[k];
                        matrizParaOrdenar[k] = vetorAuxiliar;
                    }
                }
            }
        }
        return matrizParaOrdenar;
    }

    public static void imprimeMatriz(int[][] matrizImprimir) {
        for (int i = 0; i < matrizImprimir.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrizImprimir[0].length; j++) {
                System.out.print(matrizImprimir[i][j] + " ");
            }
            System.out.println("|");
        }
    }
}