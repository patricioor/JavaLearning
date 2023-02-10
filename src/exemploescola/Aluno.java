
package exemploescola;

public abstract class Aluno extends Pessoa implements Media {
     protected double teste, prova;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    
    void setTeste(double teste){
        this.teste = teste;
    }
    
    double getTeste(){
        return this.teste;
    }
    
    
    void setProva(double prova) {
        this.prova = prova;
    }
    
    double getProva(){
        return this.prova;
    }
}
