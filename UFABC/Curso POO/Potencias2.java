import java.util.Scanner;

public class Potencias2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int tamanhoVetor = leitor.nextInt();
        int[] vetor = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = leitor.nextInt();
        };
        System.out.println(ePotencia(tamanhoVetor, vetor));
    }

    
    public static int ePotencia(int tamanhoVetor, int[] vetor ) {
        
        int contador = 0;
        
        //Enhanced For Loop (só é possivel acessar os valores do vetor, não modificá-los)
        for (int elemento: vetor){
            //Enhanced For Loop nesse caso é perfeito, pois não irá alterar os valores do vetor passado pelo usuário
            while(elemento > 1 && elemento % 2 == 0){
                elemento = elemento/2;
                //System.out.println(elemento);
            };
            if (elemento == 1){
                contador++;
            };
        };

        return contador;
    }
    
}