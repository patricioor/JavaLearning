package aulasdescomplica.ReadAndWrite;

import java.io.*;
import java.util.Scanner;

public class PrintWriterEx {
    
    private static final Scanner input = new Scanner(System.in);
    private static String matricula;
    private static String nome;
    private static double teste,prova;
    private static int faltas;    
    
    public static void main(String[] args) throws IOException {
        try (FileWriter arq = new FileWriter("F:\\Patrício\\Estudo\\Programação\\TextoCriado.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            
            System.out.println("Digite sua matricula:");
            matricula = input.next();
            
            System.out.println("Digite o seu nome:");
            nome = input.next();
            
            System.out.println("Digite a nota do seu teste:");
            teste = input.nextDouble();
            
            System.out.println("Digite a nota da sua prova:");
            prova = input.nextDouble();
            
            System.out.println("Digite o numero de faltas:");
            faltas = input.nextInt();
            
            gravarArq.println(matricula);
            gravarArq.println(nome);
            gravarArq.println(teste);
            gravarArq.println(prova);
            gravarArq.println(faltas);
        } catch(IOException e){
            System.out.println("Erro na abertura do arquivo %s.\n" + e.getMessage());
        } finally {
            System.out.println("Gravação efetuada com sucesso!");
        }   
    }  
}
