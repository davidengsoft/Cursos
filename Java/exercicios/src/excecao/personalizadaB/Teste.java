package exercicios.src.excecao.personalizadaB;

import exercicios.src.excecao.Aluno;

public class Teste {

    public static void main(String[] args) {

        try {
            Aluno aluno = null;

            Validar.aluno(aluno);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        try {
            Aluno aluno = new Aluno("", 5);
            Validar.aluno(aluno);

        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());

        } catch (NumeroForaDoIntervaloException e) {
            System.out.println(e.getMessage());
        }


        try {
            Aluno aluno = new Aluno("David", -5);
            Validar.aluno(aluno);

        } catch (StringVaziaException e ) {
            System.out.println(e.getMessage());

        } catch (NumeroForaDoIntervaloException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim do programa");

    }
}
