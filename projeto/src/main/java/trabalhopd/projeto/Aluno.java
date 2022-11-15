package trabalhopd.projeto;

public class Aluno {
    public static String name;
    public String matricula;
    public String turma;
    public int pontuacao;

    public Aluno(String name, String turma, String matricula){
        this.name = name;
        this.turma = turma;
        this.matricula = matricula;
        System.out.println(name);
    }
    public void setpontuacao(int pontuacao){
        this.pontuacao = pontuacao;
    }

    public int getpontuacao(){
        return this.pontuacao;
    }

    public String getturma(){
        return this.turma;
    }

    public String getName(){
        return this.name;
    }
}
