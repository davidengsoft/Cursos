package exercicios.src.excecao.personalizadaA;

import exercicios.src.excecao.Aluno;

public class Validar {

    private Validar() {}

    public static void aluno(Aluno aluno) {

        if (aluno == null) {
            throw new IllegalArgumentException("O objeto não foi instanciado");
        }

        if (aluno.getNome() == null || aluno.getNome().trim().isBlank()) {
            throw new StringVaziaException("nome");
        }

        if (aluno.getNota() < 0 || aluno.getNota() > 10) {
            throw new NumeroForaDoIntervaloException("nota");
        }
    }
}
