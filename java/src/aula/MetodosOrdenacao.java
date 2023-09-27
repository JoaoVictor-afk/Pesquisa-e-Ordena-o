package aula;
import java.util.ArrayList;
import java.util.Random;

public class MetodosOrdenacao {
    
    public static void bolha(ArrayList<Integer> lista) {
        boolean houveTroca;
        int tmp;
        int i;

        do {
            houveTroca = false;
            for (i = 0; i < lista.size()-1; i++) {
                if (lista.get(i) > lista.get(i+1)) {
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i,lista.get(i+1));
                    lista.set(i+1, tmp);  
                }
            }
        } while (houveTroca);
    }

    public static void selecao(ArrayList<Integer> lista) {
        int posMenor, i, j;
        int tmp;
    
        for (i = 0; i < lista.size()-1; i++) {
            posMenor = i;
            for (j = i + 1; j < lista.size(); j++ ) {
                if (lista.get(j) < lista.get(posMenor)) {
                    posMenor = j;
                }
            }
            if (i != posMenor) { 
                tmp = lista.get(i);
                lista.set(i, lista.get(posMenor));
                lista.set(posMenor, tmp);
            }
        }
    }

    
    
    public static void pente(ArrayList<Integer> lista) {
        boolean houveTroca;
        int tmp;
        int i;
        int distancia = lista.size();
        
        do {
            distancia = (int)((float)distancia / 1.3);
            if (distancia < 1) distancia = 1;
    
            houveTroca = false;
            for (i = 0; i < lista.size() - distancia; i++) {
                if (lista.get(i) > lista.get(i+distancia)) {
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i+distancia));
                    lista.set(i+distancia, tmp);
                }
            }
        } while (distancia > 1 || houveTroca);
    }
    
   public void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        // Merge the temp arrays
 
        // Initial indices of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    
   public void sort(int arr[], int l, int r)
    {
        if (l < r) {
 
            // Find the middle point
            int m = l + (r - l) / 2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}