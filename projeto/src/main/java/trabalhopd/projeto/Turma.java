package trabalhopd.projeto;
import java.util.ArrayList;

public class Turma {
    private String turma;
    private ArrayList<Aluno> aluno;
    private int qalunos;

    public Turma(String turma, int qalunos){
        this.turma = turma;
        this.qalunos = qalunos;
    }

    public static void turmaAdd(String turmaa, int qalunoss){
        Turma turma = new Turma(turmaa, qalunoss);
    }
}
