package exercicios.src.poo.composicao;


import java.util.ArrayList;
import java.util.List;

public class Curso {

    final String NOME;
    final List<Aluno> alunos = new ArrayList<>();

    public Curso(String NOME) {
        this.NOME = NOME;
    }

    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

}
