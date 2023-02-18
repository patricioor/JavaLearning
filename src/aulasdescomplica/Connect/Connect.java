package aulasdescomplica.Connect;

import java.sql.*;
import java.util.*;

public class Connect {
    
    private static final String USER = "postgres";
    private static final String PASSWORD = "exmDWA159";
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String DRIVER_BANCO = "org.postgresql.Driver";
    private static final String INSTRUCAO_DELETE = "DELETE FROM pessoas WHERE id = ?";
    private static final String INSTRUCAO_INSERT = "INSERT INTO public.pessoas(id, nome) VALUES (?, ?);";
    private static final String CONSULTA = "SELECT id FROM pessoas";
    private static final String INSTRUCAO_SELECT = "SELECT * FROM pessoas ORDER BY id;";
    private static final Scanner input = new Scanner(System.in);
    
    public void run() {               
            try {
                Class.forName(DRIVER_BANCO);
                Connection conexao = DriverManager.getConnection(URL, USER, PASSWORD);

                Statement sentenca = conexao.createStatement();
                ResultSet rs = sentenca.executeQuery(INSTRUCAO_SELECT);

                System.out.println ("Conexao realizada com sucesso");
                System.out.println("Qual a funcao desejada?");
                System.out.println("1 - Inserir dados na tabela");
                System.out.println("2 - Consultar todos os dados presentes na tabela");
                System.out.println("3 - Apagar uma linha da tabela");
                
                int opcao = input.nextInt();


                    switch (opcao) {
                        case 1 -> {
                            System.out.println("quantas pessoas serao inseridas?: ");
                            int num = input.nextInt();

                            PreparedStatement stmt = conexao.prepareStatement(INSTRUCAO_SELECT);
                            ResultSet resultado = stmt.executeQuery();
                            
                            PreparedStatement psId = conexao.prepareStatement(CONSULTA);
                            ResultSet rsId = psId.executeQuery();
                            
                            List<Integer> idsExistentes = new LinkedList<>();

                            while(rsId.next()){
                                idsExistentes.add(rsId.getInt(1));
                            }
                            
                            PreparedStatement ps = conexao.prepareStatement(INSTRUCAO_INSERT);
                            
                            
                            for (int i = 1;i <= num; i++){
                                int id = i;
                                
                                while(idsExistentes.contains(id)) id++;

                                idsExistentes.add(id);

                                System.out.println("Insira o nome da pessoa que ficara na linha " + id);
                                String nome = input.next();

                                ps.setInt(1, id);
                                ps.setString(2, nome);
                                ps.executeUpdate();
                            }
                    }

                        case 2 -> {
                            while(rs.next()){
                                int id = rs.getInt("id");
                                String nome = rs.getString("nome");
                                System.out.println("Id: " + id + " - Nome: " + nome);
                            }
                    }

                        case 3 -> { 
                            while(rs.next()){
                                int id = rs.getInt("id");
                                String nome = rs.getString("nome");
                                System.out.println("Id: " + id + " - Nome: " + nome);
                            } 
                            PreparedStatement psd = conexao.prepareStatement(INSTRUCAO_DELETE);
                            System.out.println("Qual o id da linha a ser apagada?");
                        int num = input.nextInt();
                        psd.setInt(1, num);
                        psd.executeUpdate();
                    }

                        default -> System.out.println("Opção invalida");
                    }           
                } 

                 catch (ClassNotFoundException e) {
                    System.out.println("O driver de banco de dados não pôde ser encontrado.");
                    System.out.println("Mensagem de erro: " + e.getMessage());
                } catch (SQLException e) {
                    System.out.println("Ocorreu um erro ao conectar-se ao banco de dados.");
                    System.out.println("Mensagem de erro: " + e.getMessage());
                    System.out.println("Código de erro: " + e.getErrorCode());
                }
                finally{
                System.out.println("-----FIM DO PROGRAMA-----");
                }
    }
    public static void main(String[] args) {
        Connect connect = new Connect();
        connect.run();
    }
}

