import java.util.Scanner;

public class OrdenadorVetor {
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetor = montaVetor();
        imprimeVetor(vetor);
        ordenaVetor(vetor);
        imprimeVetor(vetor);
    }

    public static int[] montaVetor() {
        int tamanhoVetor = leitor.nextInt();
        int[] vetor = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = leitor.nextInt();
        }
        return vetor;
    }

    public static void imprimeVetor(int[] vetor){
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++){
            if(i == vetor.length - 1) {
                System.out.print(vetor[i]);
            } else {
                System.out.print(vetor[i] + ",");
            }
        }
        System.out.println("]");
    }

    public static int[] ordenaVetor(int[] vetor) {
        int aux = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        return vetor;
    }
}