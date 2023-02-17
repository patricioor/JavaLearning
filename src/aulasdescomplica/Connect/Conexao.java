
package aulasdescomplica.Connect;

public class Conexao {
    private final String usuario = "postgres";
    private final String senha = "exmDWA159";
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String driverBanco = "org.postgresql.Driver";
    
    protected String getUsuario(){
        return usuario;
    }
    protected String getSenha(){
        return senha;
    }
    protected String getUrl(){
        return url;
    }
    protected String getDriverBanco(){
        return driverBanco;
    }
}
