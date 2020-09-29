import java.util.Scanner;

public class DiagonalDominante {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                matriz[i][j] = leitor.nextInt();
            }
        }

        modularizaMatriz(matriz);

        if (verificaMatriz(matriz)){
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }

    public static void modularizaMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++){
                if(matriz[i][j] < 0) {
                    matriz[i][j] = matriz[i][j] * (-1);
                }
            }
        }
    }

    public static boolean verificaMatriz(int[][] matriz){        
        for (int i = 0; i < matriz.length; i++){
            int somaAuxiliar = 0;
            for (int j = 0; j < matriz.length; j++) {
                if (j != i) {
                    somaAuxiliar += matriz[i][j];
                }
            }
            if (matriz[i][i] <= somaAuxiliar) {
                return false;
            }
        }
        return true;
    }
}



