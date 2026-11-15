package exercicios.src.excecao.personalizadaA;

import exercicios.src.excecao.Aluno;

public class Teste  {

    public static void main(String[] args) {

        try {
            Aluno a1 = new Aluno("", -10);
            Validar.aluno(a1);

        } catch (NumeroForaDoIntervaloException e) {
            System.out.println(e.getMessage());

        } catch (StringVaziaException e ) {
            System.out.println(e.getMessage());
        }



        try {
            Aluno a1 = new Aluno("David", -10);
            Validar.aluno(a1);

        } catch (NumeroForaDoIntervaloException e) {
            System.out.println(e.getMessage());

        } catch (StringVaziaException e ) {
            System.out.println(e.getMessage());
        }

    }
}
