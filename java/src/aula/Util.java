package aula;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;


public class Util {
	

	    public static void popular(int quantidade, ArrayList<Integer> lista) {
	        Random gerador = new Random();
	        for (int i = 0; i < quantidade; i++) {
	            lista.add(gerador.nextInt(100));
	        }
	    }

	    public static void exibir(ArrayList<Integer> lista) {
	        for (int i = 0; i < lista.size(); i++) {
	            System.out.println(lista.get(i));
	        }
	    }


    public static void lerArquivo(ArrayList<Integer> lista) {
        try {
            FileReader fr;
            fr = new FileReader("numeros.txt");
            BufferedReader bf = new BufferedReader(fr);
            String linha;
            do {
                linha = bf.readLine();
                if (linha == null) {
                    break;
                }
                lista.add(Integer.parseInt(linha));
                
                System.out.println(linha);
            } while(true);
            bf.close();
        }catch (Exception e){
            System.out.println("Erro "+ e.getMessage());
        }
    }    
}