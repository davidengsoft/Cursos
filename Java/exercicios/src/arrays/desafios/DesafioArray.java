package exercicios.src.arrays.desafios;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {


        double[] notas;
        double total = 0;
        double media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas serão inseridas? ");
        notas = new double[entrada.nextInt()];

        System.out.println("\n====================\n");

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a %dª nota: ", (i + 1));
            notas[i] = entrada.nextDouble();
        }

        for (double nota : notas) {
            total += nota;
        }

        media = total / notas.length;
        System.out.println("A média das notas é " + media);

        entrada.close();
    }
}
