
package exemploescola;

public class AlunoEnsinoMedio extends Aluno {
    @Override
    public double getMedia() {
        return (teste+prova*2)/3;
    } 
}
