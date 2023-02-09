package aulasdescomplica;
import java.util.Scanner;

public class AulasDescomplica {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double nota1, nota2, nota3, media;
        
        System.out.println("Inserir primeira nota:");
        nota1 = input.nextDouble();
         
        System.out.println("Inserir segunda nota:");
        nota2 = input.nextDouble();
         
        System.out.println("Inserir terceira nota:");
        nota3 = input.nextDouble();
        
        media = (nota1 + nota2 + nota3)/3;
        System.out.println("A média do aluno é " + media);
        
        if(media >= 7){
            System.out.println("Aluno aprovado por média");
        } else {
            if(media < 4){
                System.out.println("Aluno reprovado");
            } else {
                System.out.println("Aluno em recuperação");
            }
        }
    }
}
