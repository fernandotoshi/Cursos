import java.util.Random;

public class Exercicio3 {
    public static void selectionsort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int indice_menor = i;
            for(int k = i + 1; k < v.length; k++){
                if(v[k] < v[indice_menor])
                    indice_menor = k;
            }
            if (i != indice_menor) {
                int tmp = v[i];
                v[i] = v[indice_menor];
                v[indice_menor] = tmp;
            }
        }
    }

    public static int obter_menor_indice(int[] v, int i) {
        if (i == v.length - 1) return i;
        int indice_menor_temp = obter_menor_indice(v, i + 1);
        return (v[indice_menor_temp] < v[i] ? indice_menor_temp : i);
    }

    public static void selectionsort_recursivo(int[] v, int i) {
        if (i == v.length - 1) return;

        int indice_menor = obter_menor_indice(v, i);
        if (i != indice_menor) {
            int tmp = v[i];
            v[i] = v[indice_menor];
            v[indice_menor] = tmp;
        }
        selectionsort_recursivo(v, i + 1);
    }

    public static void selectionsort_r(int[] v) {
        selectionsort_recursivo(v, 0);
    }

    public static void imprimir(int[] v) {
        for (int i = 0; i < v.length; i++)
            System.out.print(v[i] + " ");
        System.out.println();
    }

    public static void main(String[] args){
        Random rnd = new Random(123);
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++)
            v[i] = rnd.nextInt(50);
            imprimir(v);
            selectionsort_r(v);
            imprimir(v);
    }
}