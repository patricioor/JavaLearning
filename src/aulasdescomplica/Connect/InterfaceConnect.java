package aulasdescomplica.Connect;

public interface InterfaceConnect {
     
    ConnectINSERT insert = new ConnectINSERT();
    public String INSTRUCAO_INSERT = insert.getInsert();
    
    ConnectDELETE delete = new ConnectDELETE();
    public String INSTRUCAO_DELETE = delete.getInstrucaoDelete();
    
    ConnectSELECT consulta = new ConnectSELECT();
    public String CONSULTA = consulta.getConsulta();
    
    ConnectSELECT instrucao = new ConnectSELECT();
    public String INSTRUCAO_SELECT = instrucao.getInstrucao();
    
    Conexao usuario = new Conexao();
    public String USER = usuario.getUsuario();
    
    Conexao url = new Conexao();
    public String URL = url.getUrl();
    
    Conexao senha = new Conexao();
    public String PASSWORD = senha.getSenha();
    
    Conexao driverBanco = new Conexao();
    public String DRIVER_BANCO = driverBanco.getDriverBanco();
}
