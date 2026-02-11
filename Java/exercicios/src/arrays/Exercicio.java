package exercicios.src.arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double total = 0, media;
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));

        for(int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }
        media = total / notasAlunoA.length;
        System.out.println(media);

        double[]  notasAlunoB = {6.9, 8.9, 5.9, 10};

        total = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            total += notasAlunoB[i];
        }

        media = total / notasAlunoB.length;
        System.out.println(media);

    }
}