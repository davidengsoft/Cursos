package exercicios.src.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        int quantidDeAlunos;
        int quantidDeNotas;
        double total = 0;
        double media;
        double[][] notasDaTurma;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        quantidDeAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno? ");
        quantidDeNotas = entrada.nextInt();

        notasDaTurma = new double[quantidDeAlunos][quantidDeNotas];

        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
                notasDaTurma[i][j] = entrada.nextDouble();
                total += notasDaTurma[i][j];
            }
        }

        media = total / (quantidDeAlunos * quantidDeNotas);
        System.out.println("A média da turma é: " + media);

        for (double[] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        entrada.close();


    }
}
