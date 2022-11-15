package trabalhopd.projeto;
import java.util.ArrayList;

public class Turma {
    private String turma;
    private ArrayList<Aluno> aluno;
    private int qalunos;

    public Turma(String turma, int qalunos){
        this.turma = turma;
        this.qalunos = qalunos;
        this.aluno = new ArrayList<Aluno>();
    }

    public void addAluno(Aluno a) {
        this.aluno.add(a);
        qalunos++;
    }

    public String getturma(){
        return this.turma;
    }

    public ArrayList<Aluno> getAlunos() {
        return aluno;
    }

    public void turmaAdd(String turmaa, int qalunoss){

        Turma turma = new Turma(turmaa, qalunoss);
    }
}
