package aulasdescomplica;

import java.util.Scanner;

public class For{
    public static void main(String[] args) {
        double nota1,nota2,media;
        Scanner input = new Scanner(System.in);
        
        int numAlunos;
        System.out.println("Insira o numero de alunos que deseja calcular a media em serie:");
        numAlunos = input.nextInt();
        
        
        String nomeAluno;
        
        for(int i = 0; i < numAlunos; i++){
            input.nextLine();
            System.out.print("Digite o nome do aluno:");
            nomeAluno = input.nextLine();

            System.out.println("Aluno: " + nomeAluno);

            System.out.println("Digite a nota 1: ");
            nota1 = input.nextInt();
            System.out.println("Digite a nota 2: ");
            nota2 = input.nextInt();

            media = (nota1 + nota2)/2;
                System.out.println("Media de " + nomeAluno +" e: " + media);
            if(media>=7){
                System.out.println(nomeAluno + " esta aprovado!");
            } else {
                if(media<4){
                    System.out.println(nomeAluno + " esta reprovado!");
                } else {
                    System.out.println(nomeAluno + " esta de final!");
                }
            }
        }
    }
}
