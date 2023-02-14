package aulasdescomplica.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExemple {
    public static void main(String[] args) {
        
    int num, somaTotal = 0;
    List<Integer> listaNumero = new ArrayList<>();
    
    Scanner input = new Scanner(System.in);
    System.out.println("Quantos numeros serao adicionados a lista?");
    num = input.nextInt();
    
    for(int i = 0; i < num; i++){
    System.out.println("Insira aqui o número que ficara no indice '" + i+ "' da lista:");
    listaNumero.add(input.nextInt());
    }
    
    System.out.println(listaNumero);
    
    for(Integer j:listaNumero) somaTotal +=j;
    
    System.out.println(somaTotal);
    }
}
