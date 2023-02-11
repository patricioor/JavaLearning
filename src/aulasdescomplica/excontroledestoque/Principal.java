
package aulasdescomplica.excontroledestoque;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Principal extends EstoqueComparatorMaior {
    public static void main(String[] args) {
        ArrayList<Produto> s = new ArrayList<Produto>();
        s.add(new Produto(1, "Blusa", 200));
        s.add(new Produto(2,"Calca",50));
        s.add(new Produto(3,"Regata",100));
        s.add(new Produto(4,"Meia",300));
        s.add(new Produto(5,"Bone",50));
        s.add(new Produto(6,"Cinto", 30));
        s.add(new Produto(7,"Gravata",35));
        s.add(new Produto(8, "Sapato", 400));
        s.add(new Produto(9, "Pefume", 350));
        s.add(new Produto(10, "Moletom", 80));
        
        System.out.println("Lista de Produtos da Loja:" );
        
        for(Produto i:s) System.out.println(i.toString());
        
        System.out.print("---------------------");
        System.out.print("Lista de Produtos Ordenado do Maior para o Menor em Estoque:");
        System.out.println("---------------------");

        Collections.sort(s, new EstoqueComparatorMaior());
        
        Iterator<Produto> iteratorComparatorMaior = s.iterator();
        
        while(iteratorComparatorMaior.hasNext()) System.out.println(iteratorComparatorMaior.next().toString());
        
        System.out.print("---------------------");
        System.out.print("Lista de Produtos Ordenado do Maior para o Menor em Estoque:");
        System.out.println("---------------------");
        
        Collections.sort(s, new EstoqueComparatorMenor());
        
        Iterator<Produto> iteratorComparatorMenor = s.iterator();
        
        while(iteratorComparatorMenor.hasNext()) System.out.println(iteratorComparatorMenor.next().toString());
    }
}
