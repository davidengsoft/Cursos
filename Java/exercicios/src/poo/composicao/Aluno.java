package exercicios.src.poo.composicao;


import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String NOME;
    List<Curso> cursos = new ArrayList<>();

    Aluno(String NOME) {
        this.NOME = NOME;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nome) {

        for (Curso curso : this.cursos) {
            if(curso.NOME.equalsIgnoreCase(nome)){
                return curso;
            }
        }

        return null;
    }

    public String toString() {
        return this.NOME;
    }

}
