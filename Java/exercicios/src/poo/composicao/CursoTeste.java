package exercicios.src.poo.composicao;

public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("David");
        Aluno aluno2 = new Aluno("Glória");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2026");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        System.out.println("================================================= ");
        System.out.println("| Alunos matriculados no curso de " + curso3.NOME + " |");
        System.out.println("=================================================\n");
        for (Aluno aluno : curso3.alunos) {
            System.out.println(aluno.NOME);
        }

        System.out.println("\n=================================================\n");
        System.out.println("Alunos matriculado no curso " + curso1.NOME + ": " + aluno2.cursos.getFirst().alunos);
        System.out.println("\n=================================================\n");


        Curso cursoEncontrado = aluno1.obterCursoPorNome("Web 2026");

        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.alunos);
        }


    }

}
