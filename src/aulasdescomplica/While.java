
package aulasdescomplica;

import java.awt.BorderLayout;
import java.util.Scanner;

public class While {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int operacao;
        
        do{
            System.out.println("Menu Principal");
            System.out.println("1 - Aluno");
            System.out.println("2 - Professor");
            System.out.println("3 - Coordenador");
            System.out.println("0 - Sair");
            
            System.out.println("Insira a opção desejada:");
            operacao = input.nextInt();
            
            if(operacao == 0) break;
            
            if(operacao >= 1 && operacao <= 3)
                switch(operacao) {
                    case 1 -> System.out.println("Menu aluno");
                    case 2 -> System.out.println("Menu Professor");
                    case 3 -> System.out.println("Menu Coordenador");
                    default -> System.out.println("Você digitou uma opção inválida");
                }         
        }
        while(true); System.out.println("Fim");       
    }
}
