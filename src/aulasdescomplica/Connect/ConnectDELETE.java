
package aulasdescomplica.Connect;

public class ConnectDELETE {
    private String instrucaoDelete = "DELETE FROM pessoas WHERE id = ?";
    
    protected String getInstrucaoDelete(){
        return instrucaoDelete;
    }
}
