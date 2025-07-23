package exercicios.src.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        double total = 0, media;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int quantAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int quantNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[quantAlunos][quantNotas];

        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = entrada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        media = total / (quantAlunos * quantNotas);
        System.out.printf("A média da turma é %.2f\n", media);

        for(double[] notasDoAluno: notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        entrada.close();



    }
}
