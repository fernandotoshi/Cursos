import java.util.Scanner;

public class MatrizDobrada {
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int tamanhoMatriz = leitor.nextInt();
        int[][] matriz = montaMatriz(tamanhoMatriz);
        int[][] matrizAuxiliar = dobraMatrizColuna(matriz);
        int[][] matrizFinal = dobraMatrizLinha(matrizAuxiliar);
        imprimeMatriz(matrizFinal);
    }

    public static int[][] montaMatriz(int tamanhoMatriz) {
        int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }
        return matriz;
    }

    public static int[][] dobraMatrizColuna(int[][] matriz) {
        int[][] matrizColuna = new int[matriz.length][matriz[0].length/2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length/2; j++) {
                //System.out.println("i: " + i + " j: " + j + "matriz[0].length - j = " + (matriz[0].length - j));
                matrizColuna[i][j] = matriz[i][j] + matriz[i][matriz[0].length - j - 1];
            }
        }
        return matrizColuna;
    }

    public static int[][] dobraMatrizLinha(int[][] matrizColuna) {
        int[][] matrizLinha = new int[matrizColuna.length/2][matrizColuna[0].length];
        for (int i = 0; i < matrizColuna.length/2; i++) {
            for (int j = 0; j < matrizColuna[0].length; j++) {
                matrizLinha[i][j] = matrizColuna[i][j] + matrizColuna[matrizColuna.length - i - 1][j];
            }
        }
        return matrizLinha;
    }

    public static void imprimeMatriz(int[][] matrizImprimir) {
        for (int i = 0; i < matrizImprimir.length; i++) {
            for (int j = 0; j < matrizImprimir.length; j++) {
                System.out.print(matrizImprimir[i][j] + " ");
            }
            if (i != matrizImprimir.length - 1) {
                System.out.println("");
            }            
        }
    }
}