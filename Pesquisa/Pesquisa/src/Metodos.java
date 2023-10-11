import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Metodos {
    public static void popular(ArrayList<Integer> lista, int quantidade) {
        Random gerador = new Random();
        for (int i = 0; i < quantidade; i++) {
            lista.add(0, gerador.nextInt(1000));
        }
    }
    
    public static void popularArvore(TreeSet<Integer> arvore, int quantidade) {
        Random gerador = new Random();
        for (int i = 0; i < quantidade; i++) {
            arvore.add(gerador.nextInt(1000));
        }
    }
    public static void popularArvoreAluno(TreeSet<Aluno> arvore) {
    	arvore.add(new Aluno(46,"Alexandre Zamberlan"));
    	arvore.add(new Aluno(20,"Alexandre Zeni"));
    	arvore.add(new Aluno(19,"Meani"));
    	arvore.add(new Aluno(19,"Ana"));
    	arvore.add(new Aluno(5,"Dante"));
    	arvore.add(new Aluno(19,"Bia"));    
        }
    
    
    public static void mostrar(ArrayList<Integer> lista) {
        for (Integer i : lista) {
            System.out.println(i);
        }
    }
    
    public static void mostrarArvore(TreeSet<Integer> arvore) {
        for (Integer i : arvore) {
            System.out.println(i);
        }
    }
    public static void mostraArvoreAluno(TreeSet<Aluno> arvore) {
    	  for (Aluno a : arvore) {
              System.out.println(a);
          }
    }
    public static int pesquisaBinaria(ArrayList<Integer> lista, int pesquisa) {
        int ini = 0;
        int fim = lista.size() - 1;
        int meio;
        
        do {
            meio = (int)((ini+fim)/2);
            if (pesquisa == lista.get(meio)) {
                return meio;
            }
            if (pesquisa < lista.get(meio)) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        } while (ini <= fim);
        return -1;//nao encontrado
    }
}
