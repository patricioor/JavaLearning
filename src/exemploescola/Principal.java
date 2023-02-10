
package exemploescola;

public class Principal {
    public static void main(String[] args) {
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();   
        AlunoEnsinoFundamental alunoEnsinoFundamental = new AlunoEnsinoFundamental();
        Professor professor = new Professor();
        
        System.out.println("Aluno Ensino Médio");
        alunoEnsinoMedio.setNome("Patrício");
        alunoEnsinoMedio.setProva(9);
        alunoEnsinoMedio.setTeste(10);
        
        System.out.println(alunoEnsinoMedio.getNome());
        System.out.println(alunoEnsinoMedio.getMedia());
        
        System.out.println("Aluno Ensino Fundamental");
        alunoEnsinoFundamental.setNome("Jose");
        alunoEnsinoFundamental.setProva(8);
        alunoEnsinoFundamental.setTeste(7);
        
        System.out.println(alunoEnsinoFundamental.getNome());
        System.out.println(alunoEnsinoFundamental.getMedia());
        
        System.out.println("Professor");
        professor.setNome("Osterno");
        professor.setSalario(2000);
        
        System.out.println(professor.getNome());
        System.out.println(professor.getSalario());
    }
    
}
