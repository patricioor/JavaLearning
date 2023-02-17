package aulasdescomplica.Connect;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.util.LinkedList;
import java.util.List;

public class Connect implements InterfaceConnect {

    public static void main(String[] args) {               
        
        Scanner input = new Scanner(System.in);
        
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
                case 1:
                    
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
                    break;
                    
                case 2:
                    
                    while(rs.next()){
                        int id = rs.getInt("id");
                        String nome = rs.getString("nome");
                        System.out.println("Id: " + id + " - Nome: " + nome);
                        }
                    break;
                    
                case 3: 
                    while(rs.next()){
                        int id = rs.getInt("id");
                        String nome = rs.getString("nome");
                        System.out.println("Id: " + id + " - Nome: " + nome);
                        } 
                    
                        PreparedStatement psd = conexao.prepareStatement(INSTRUCAO_DELETE);
                        
                        System.out.println("Qual o id da linha a ser apagada?");
                        num = input.nextInt();
                        
                        psd.setInt(1, num);
                        psd.executeUpdate();
                    break;
                    
                default:
                    System.out.println("Opção inválida");
                    break;
            }           
        } 
        catch (Exception excepetion) {
            System.out.println("Erro na conexao com o banco de dados");
        }
    }
}
