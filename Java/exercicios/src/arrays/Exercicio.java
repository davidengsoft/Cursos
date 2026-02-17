package exercicios.src.arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        double[] notasAlunoB = {6.9, 8.9, 5.5};
        double total = 0;
        double media;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < notasAlunoA.length; i++) {
            System.out.println("informe a " + (i+1)  + "ª nota do aluno A: ");
            notasAlunoA[i] = entrada.nextDouble();
            total += notasAlunoA[i];
        }


        media = total / notasAlunoA.length;

        System.out.println("\n" + Arrays.toString(notasAlunoA));
        System.out.println("A média desse aluno é " + media);


        System.out.println("\n========================\n");


        for (int i = 0; i < notasAlunoB.length; i++) {
            System.out.println("informe a " + (i+1)  + "ª nota do aluno B: ");
            notasAlunoB[i] = entrada.nextDouble();
            total += notasAlunoB[i];
        }

        media = total / notasAlunoB.length;

        System.out.println("\n" + Arrays.toString(notasAlunoB));
        System.out.println("A média desse aluno é " + media);


        entrada.close();
    }
}