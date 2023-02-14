
package aulasdescomplica.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExermple {
    public static void main(String[] args) {
  
    ArrayList<Integer> numerosArrayList = new ArrayList<>();
    numerosArrayList.add(2);
    numerosArrayList.add(7);
    numerosArrayList.add(8);
    numerosArrayList.add(2);
    
    System.out.println("ArrayList: " + numerosArrayList);

    
    Set<Integer> numerosLinkedHashSet = new LinkedHashSet<>();
    
    numerosLinkedHashSet.addAll(numerosArrayList);
    numerosLinkedHashSet.add(5);
    System.out.println("LinkedHashSet: " + numerosLinkedHashSet);
    
    }
    
}
