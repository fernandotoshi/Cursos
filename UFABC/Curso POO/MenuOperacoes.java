import java.util.Scanner;

public class MenuOperacoes {
    public static void main(String[] args){
        int[] vetorDeRespostas = operacoes();
        int menorNumero = verificaMenor(vetorDeRespostas);
        for (int i = 1; i < vetorDeRespostas.length; i++){
            System.out.println(vetorDeRespostas[i]);
        }
        System.out.println(menorNumero);
    }

    public static int[] addElementArray(int[] array, int elementAdd){
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        newArray[array.length] = elementAdd;
        return newArray;
    }

    public static int[] operacoes() {
        Scanner leitor = new Scanner(System.in);
        int escolha = 1, a, b, c, resp = 0, auxiliar;
        int[] respostas = new int[1];

        while (escolha != 0) {
            escolha = leitor.nextInt();
            switch (escolha) {
                case 1:
                    a = leitor.nextInt();
                    b = leitor.nextInt();
                    resp = a + b;
                    respostas = addElementArray(respostas, resp);
                    break;
                case 2:
                    a = leitor.nextInt();
                    b = leitor.nextInt();
                    c = leitor.nextInt();
                    resp = a + b + c;
                    respostas = addElementArray(respostas, resp);
                    break;
                case 3:
                    a = leitor.nextInt();
                    b = leitor.nextInt();
                    resp = a * b;
                    respostas = addElementArray(respostas, resp);
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }
        return respostas;
    }
    public static int verificaMenor(int[] array){
        int numeroAuxiliar = array[1];
        for (int i = 1; i < array.length - 1; i++){
            if (array[i+1] < numeroAuxiliar){
                numeroAuxiliar = array[i+1];
            }
        }
        return numeroAuxiliar;
    }
}