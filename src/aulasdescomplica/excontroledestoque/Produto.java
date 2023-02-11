
package aulasdescomplica.excontroledestoque;

public class Produto {
    
    protected int codigoProduto;
    protected String nomeProduto;
    protected int qntEstoque;
    
    public double getCodigo() {
        return codigoProduto;
    }

    public void setCodigo(int codigo) {
        this.codigoProduto = codigo;
    }

    public String getProduto() {
        return nomeProduto;
    }

    public void setProduto(String produto) {
        this.nomeProduto = produto;
    }

    public double getQntEstoque() {
        return qntEstoque;
    }

    public void setQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    }
    
    Produto(int codigoProduto, String nomeProduto, int qntEstoque) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.qntEstoque = qntEstoque;
    }
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        
        builder.append(this.codigoProduto).append( ", ").append(this.nomeProduto).append(", ").append(this.qntEstoque);
        return builder.toString();
    }
}
