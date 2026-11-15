package  exercicios.src.fundamentos.conceitosBasicos;

import java.util.Scanner;

public class CelsiusParaFahrenheit {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em graus celsius: ");
		double celsius = entrada.nextDouble();
		
		entrada.close();
		
		double fahrenheit = (celsius * 9.0/5.0) + 32;
		System.out.printf("A conversão de %.2fC° é de %.2fF°", celsius, fahrenheit);
	}
}
