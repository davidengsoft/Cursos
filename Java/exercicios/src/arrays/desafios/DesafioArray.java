package exercicios.src.arrays.desafios;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        CalcularMedia aluno1 = new CalcularMedia();
        int cont = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        aluno1.nome = entrada.next();

        System.out.print("Quantas notas deseja informar? ");
        int quantNotas = entrada.nextInt();

        double[] notasAluno = new double[quantNotas];

        for(int i = 0; i < quantNotas; i++) {
            System.out.printf("Digite a nota 0%d: ", ++cont);
            notasAluno[i] = entrada.nextDouble();
        }
        entrada.close();
        System.out.println(aluno1.calcularMedia(notasAluno));

    }
}
