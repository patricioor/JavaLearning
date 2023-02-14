
package aulasdescomplica.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExemple {
    public static void main(String[] args) {
  
    Set<String> listaNome = new TreeSet<>();
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
    
    Iterator<String> iterator = listaNome.iterator();
    
    while(iterator.hasNext()) System.out.println(iterator.next());
    
    }
}
