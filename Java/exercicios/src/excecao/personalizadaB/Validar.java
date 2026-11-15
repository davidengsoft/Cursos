package exercicios.src.excecao.personalizadaB;

import exercicios.src.excecao.Aluno;

public class Validar {

    private Validar() {}

    public static void aluno(Aluno aluno) throws NumeroForaDoIntervaloException, StringVaziaException{

        if (aluno == null){
            throw new IllegalArgumentException("O objeto não foi instanciado");
        }

        if (aluno.getNome() == null || aluno.getNome().trim().isEmpty()){
            throw new StringVaziaException("nome");
        }

        if (aluno.getNota() < 0 ||  aluno.getNota() > 10){
            throw new NumeroForaDoIntervaloException("nota");
        }
    }
}
