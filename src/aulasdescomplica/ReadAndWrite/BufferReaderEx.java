package aulasdescomplica.ReadAndWrite;


import java.io.*;

public class BufferReaderEx {
    public static void main(String[] args) {
        String nome = "F:\\Patrício\\Estudo\\Programação\\Texto.txt";
        
        System.out.printf("Conteúdo do Arquivo:\n ");
        
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);
            
            String linha = lerArq.readLine();
            while(linha != null){
                System.out.println(linha);
                linha = lerArq.readLine();
            }
            
            arq.close();
        } catch (IOException e) {
            System.out.printf("Erro na abertura do arquivo: $s.\n" + e.getMessage());
        }
        System.out.println();
    }
}