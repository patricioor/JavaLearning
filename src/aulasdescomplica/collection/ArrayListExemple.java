
package aulasdescomplica.collection;

import java.util.ArrayList;

public class ArrayListExemple {
    public static void main(String[] args) {
        
    
    ArrayList<String> listaNome = new ArrayList<>();
    listaNome.add("Patricio");
    listaNome.add("Gustavo");
    listaNome.add("Carol");
    listaNome.add("Renan");
    
    System.out.println("Antes:");
    
    for(String i:listaNome) System.out.println(i);
    
        System.out.print("------");
        System.out.print("Depois");
        System.out.println("------");
        
    listaNome.set(1, "Nelson");
    
    for(String i: listaNome) System.out.println(i);
    
    }
}
