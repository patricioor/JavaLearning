
package aulasdescomplica.Exception;

public class ClasseFilha {
    ClasseNeta classeNeta;
    
    public void executar() throws Exception {
        ClasseNeta classeNeta = new ClasseNeta();
        classeNeta.executar();
    }
    
}
