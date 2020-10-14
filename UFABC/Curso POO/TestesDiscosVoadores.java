import java.util.Scanner;
public class TestesDiscosVoadores {
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int numLinha = leitor.nextInt();
        int numCol = leitor.nextInt();

        int[][] matriz = montaMatriz(numLinha, numCol);

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

}