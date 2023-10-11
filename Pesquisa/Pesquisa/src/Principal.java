
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorio
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> listaInteiros = new ArrayList<>();
        TreeSet<Aluno> arvoreInteiros = new TreeSet<>();
        
//        Metodos.popular(listaInteiros, 500000);        
//        Collections.sort(listaInteiros); 
//        System.out.println("Terminou popular e ordenar lista");
//        
        Metodos.popularArvoreAluno(arvoreInteiros);
        System.out.println("Terminou popular arvore binaria");
        Metodos.mostraArvoreAluno(arvoreInteiros);

        //Metodos.mostrar(listaInteiros);
        //Metodos.mostrarArvore(arvoreInteiros);
        
        int pesquisa = Integer.parseInt(JOptionPane.showInputDialog(null,"Número de pesquisa"));

        if (arvoreInteiros.contains(pesquisa)) {
            System.out.println("Encontrado");
        } else {
            System.out.println("NÃO Encontrado");
        }    
        
//        int posicao = Metodos.pesquisaBinaria(listaInteiros, pesquisa);
//        if (posicao != 0) {
//            System.out.println("Encontrado na posicao " + posicao);
//        } else {
//            System.out.println("NAO Encontrado");
//        }


//        posicao = listaInteiros.indexOf(pesquisa);
//        if (posicao != 0) {
//            System.out.println("Encontrado na posicao " + posicao);
//        } else {
//            System.out.println("NAO Encontrado");
//        }
        
        
        
    }
}
