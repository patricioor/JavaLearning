
package aulasdescomplica.Connect;

public class ConnectINSERT {
    private final String instrucaoInsert = "INSERT INTO public.pessoas(id, nome) VALUES (?, ?);";
    
    protected final String getInsert(){
        return instrucaoInsert;
    } 
}
