package trabalhopd.projeto;

public class Aluno {
    public static String name;
    public String matricula;
    public String turma;
    public int pontuacao;

    public Aluno(String name, String turma, String matricula){
        name = name;
        turma = turma;
        matricula = matricula;
        System.out.println(name);
    }
    public Aluno(int pontuacao){
        pontuacao = pontuacao;
    }

}
