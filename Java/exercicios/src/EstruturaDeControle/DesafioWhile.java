package exercicios.src.EstruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {


        double notas = 0.0;
        int notasValidas = 0;
        double total = 0.0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("\nDigite -1 para encerrar o loop");

        while(notas != -1) {
            System.out.print("Digite o valor da nota: ");
            notas = entrada.nextDouble();

            if (notas == -1) {
                System.out.print("Saindo...");
            } else if (notas < 0 || notas > 10) {
                System.out.print("Nota inválida\n");
            } else {
                total += notas;
                notasValidas++;
            }
        }

        double media = total / notasValidas;

        System.out.printf("\nA média das notas foi %.2f", media);

        entrada.close();

    }
}
