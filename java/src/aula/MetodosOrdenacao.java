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
    
 public static void intercala(ArrayList<Integer> lista, long   n) {
       	int   meio;
       	int  i, j, k;
       	ArrayList<Integer> vetorTemporario =new ArrayList<Integer>();


     	meio = (int)(n / 2);

     	i = 0; //indice da porcao esquerda
     	j = meio; //indice da porcao direita
     	k = 0; //indice do vetor temporario

    	while (i < meio && j < n) {
     		if (lista.get(i) < lista.get(j)) {
     			vetorTemporario.add(lista.get(i),k);  
    	  		++i;
     		} else {
     			vetorTemporario.add(lista.get(j),k); 
    	  		++j;
     		}
     		++k;
    	}

    	if (i == meio) {
     		while (j < n) { //nao hah mais elementos na porcao esquerda
     			vetorTemporario.add(lista.get(j),k); 
    	  		++j;
     	  		++k;
     		}
     	} else {
     		while (i < meio) {
     			vetorTemporario.add(lista.get(i),k);  
     	  		++i;
    	    	++k;
     		}
     	}

     	for (i = 0; i < n; ++i) {
    		lista.add(i,vetorTemporario.get(i));
     	}

     	vetorTemporario.clear();
 }

     public static void mergeSort(ArrayList<Integer> lista, long n) { //responsavel pela divisao = recursao
    	 int meio;

         if (n > 1) {
            meio = (int)(n / 2);

            mergeSort(lista, meio); //porcao da esquerda
            mergeSort(lista, n - meio); //porcao da direita
             intercala(lista, n);
      }
    }
}