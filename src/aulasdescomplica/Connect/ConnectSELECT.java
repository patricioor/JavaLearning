package aulasdescomplica.Connect;

public class ConnectSELECT {
    private final String instrucaoConsulta = "SELECT id FROM pessoas";
    private final String instrucaoSelect = "SELECT * FROM pessoas ORDER BY id;";
         
    protected final String getConsulta() {
        return instrucaoConsulta;
    }
    
    protected final String getInstrucao() {
        return instrucaoSelect;
    }
}
