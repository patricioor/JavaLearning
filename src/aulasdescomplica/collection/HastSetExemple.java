
package aulasdescomplica.collection;

import java.util.HashSet;
import java.util.Set;


public class HastSetExemple {
    public static void main(String[] args) {
  
    Set<String> listaNome = new HashSet<>();
    listaNome.add("Patricio");
    listaNome.add("Gustavo");
    listaNome.add("Carol");
    listaNome.add("Renan");
    
    System.out.println("Antes:");
    
    for(String i:listaNome) System.out.println(i);
    
        System.out.print("------");
        System.out.print("Depois");
        System.out.println("------");
        
    listaNome.add("Patricio");// não duplica
    
    for(String i: listaNome) System.out.println(i);
    
    }
}