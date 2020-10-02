import java.util.Scanner;

public class MaiorPalavra {
    public static int comprimento_maior_palavra(String texto) {
    	int maiorPalavra = 0;
        int ultimoIndice = 0;
        for (int i = 0; i < texto.length(); i++){
            if (texto.charAt(i) == ' ' || i == texto.length() - 1) {
                if (i == texto.length() - 1) {
                    i++;
                }
                int tamanhoPalavraAtual = i - ultimoIndice;
                ultimoIndice = i + 1;
                if(maiorPalavra < tamanhoPalavraAtual){
                    maiorPalavra = tamanhoPalavraAtual;
                }
            }
        }
        return maiorPalavra;
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
		
        String texto = leitor.nextLine();
        
        System.out.println(comprimento_maior_palavra(texto));
    }
}