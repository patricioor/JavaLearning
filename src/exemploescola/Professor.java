
package exemploescola;

public class Professor extends Pessoa {

    double salario;
    
    Inss inss = new Inss();
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario * (1-inss.getInss());
    }
}
