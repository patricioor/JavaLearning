
package aulasdescomplica.excontroledestoque;

import java.util.Comparator;

public class EstoqueComparatorMaior extends EstoqueComparatorMenor  implements Comparator<Produto> {
    @Override
    public int compare(Produto produto1, Produto produto2){
        if(produto1.qntEstoque == produto2.qntEstoque)
            return 0;
        else if(produto1.qntEstoque < produto2.qntEstoque){
            return 1;
        }{
            return -1;
        }
    }      
}
