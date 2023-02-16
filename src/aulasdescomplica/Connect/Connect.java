package aulasdescomplica.Connect;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class Connect {

    public static void main(String[] args) {
        final String usuario = "postgres";
        final String senha = "exmDWA159";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String driverBanco = "org.postgresql.Driver";
        final String instrucaoSelect = "SELECT * FROM pessoas;";
        final String instrucaoInsert = "INSERT INTO public.pessoas(id, nome) VALUES (?, ?);";
        final String consulta = "SELECT MAX(id) FROM pessoas";
        
        Scanner input = new Scanner(System.in);

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            Statement sentenca = conexao.createStatement();

            System.out.println ("Conexao realizada com sucesso");
            System.out.println("Qual a funcao desejada?");
            System.out.println("1 - Inserir dados na tabela");
            System.out.println("2 - Consultar todos os dados presentes na tabela");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("quantas pessoas serão inseridas?: ");
                    int num = input.nextInt();
                    
                    PreparedStatement stmt = conexao.prepareStatement(consulta);
                    ResultSet resultado = stmt.executeQuery();
                    
                    int ultimoId = 0;
                    if(resultado.next())ultimoId = resultado.getInt(1);
                    
                    PreparedStatement ps = conexao.prepareStatement(instrucaoInsert);  
                                                                                    
                    if(ultimoId != 0){
                        for (int i = ultimoId;i < num+ultimoId; i++) {
                            System.out.println("Insira o nome da " + (i+1) + "ª pessoa");
                            String nome = input.next();
                            ps.setInt(1, i+1);
                            ps.setString(2, nome);
                            ps.executeUpdate();
                        }
                    } else {
                        for(int i = ultimoId;i < num+ultimoId; i++) {
                            System.out.println("Insira o nome da " + (i+1) + "ª pessoa");
                            String nome = input.next();
                            ps.setInt(1, i+1);
                            ps.setString(2, nome);
                            ps.executeUpdate();
                            }
                        }
                break;

                case 2:
                    ResultSet rs = sentenca.executeQuery(instrucaoSelect);
                    while(rs.next()){
                        int id = rs.getInt("id");
                        String nome = rs.getString("nome");
                        System.out.println("Id: " + id + " - Nome: " + nome);
                        }
                    break;
                    
                default:
                    System.out.println("Opção inválida");
                    break;
            }
                    
        } catch (Exception excepetion) {
            System.out.println("Erro na conexao com o banco de dados");
        }
    }
}
