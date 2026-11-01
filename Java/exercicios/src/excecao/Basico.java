package exercicios.src.excecao;

public class Basico {

    public static void main(String[] args) {


        try {
            Aluno a1 = null;
            imprimirAluno(a1);

        } catch (NullPointerException e) {
            System.out.println("Ocorreu um erro ao imprimir o nome do aluno");
        }

        try {
            System.out.println(7 / 0);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }





        System.out.println("Fim do programa");
    }

     public static void imprimirAluno(Aluno aluno) {
        System.out.println(aluno.getNome());
     }
}
