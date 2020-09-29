import java.util.Scanner;

public class VerificaNumero {
    public static boolean verifica_numero(int num) {
        int numeroAuxiliar = 0;
        for (int i = 1; i < num; i++){
            if (num % i == 0) {
                numeroAuxiliar = num/i;
                if(numeroAuxiliar % (i+1) == 0) {
                    numeroAuxiliar = numeroAuxiliar/(i+1);
                    if (numeroAuxiliar % (i+2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int n = leitor.nextInt();
        
        if (verifica_numero(n))
            System.out.println("SIM");
        else
            System.out.println("NAO");
    }
}