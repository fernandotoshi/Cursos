import java.util.Scanner;
public class MatrizDobrada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] matriz = geraMatriz(leitor.nextInt());
        System.out.println(dobraMatriz(matriz));
    }

    public static int[][] geraMatriz(int tamanhoMatriz){
        Scanner leitor = new Scanner(System.in);
        int[][] matrizGerada = new int[tamanhoMatriz][tamanhoMatriz];
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++){
                matrizGerada[i][j] = leitor.nextInt();
            }
        }
        return matrizGerada;
    }

    public static int[][] dobraMatriz(int[][] matrizParaDobrar){
        int[][] matrizMetadeCol = new int[matrizParaDobrar.length][matrizParaDobrar.length/2];
        int[][] matrizMetade = new int[matrizParaDobrar.length/2][matrizParaDobrar.length/2];
        if(matrizParaDobrar[0].length == matrizParaDobrar.length) {
            for (int i = 0; i < matrizParaDobrar.length; i++){
                for (int j = 0; j < matrizParaDobrar.length/2; j ++){
                    matrizMetadeCol[i][j] = matrizParaDobrar[i][j] + matrizParaDobrar[i][matrizParaDobrar.length - j];
                }
            }
            for(int i = 0; i < matrizParaDobrar.length/2; i ++){
                for(int j = 0; j < matrizParaDobrar[0].length/2; j++){
                    matrizMetade[i][j] = matrizMetadeCol[i][j] + matrizMetadeCol[matrizMetadeCol.length - i][j];
                }
            }
        }
        return matrizMetade;
    }
}