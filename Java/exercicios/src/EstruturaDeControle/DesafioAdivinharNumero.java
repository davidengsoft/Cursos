package exercicios.src.EstruturaDeControle;

import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinharNumero {

    public static void main(String[] args) {

        Random rand = new Random(); // Essa fução cria uma instância de classe Random

        int numAleatorio = rand.nextInt(51); // Aqui foi criado um número aleatório entre 0 e 50
        int tentativa = 1;
        int palpite;
        String dica;
        boolean flag = true;

        Scanner entrada = new Scanner(System.in);
        System.out.println("\nTente adivinhar o número que está entre 0 e 50. \nVocê tem 10 tentativas!!\n");

        do {
            System.out.print("Tentativa nº " + tentativa + ":");
            palpite = entrada.nextInt();

            if(tentativa == 10) {
                System.out.println("PERDEU!!");
                System.out.println("Você utilizou todas as 10 tentativas. \nNúmero aleatório = " + numAleatorio);
                flag = false;
            } else  if(palpite != numAleatorio){
                dica = palpite > numAleatorio ? "Palpite acima do número" : "Palpite abaixo do número";
                System.out.println("[Errado]: " + dica);
                tentativa++;
            } else {
                System.out.println("Parabéns!!");
                System.out.printf("\nVocê acertou o número na %d tentativa", tentativa);
                flag = false;
            }

        } while(flag);

        entrada.close();
    }
}
