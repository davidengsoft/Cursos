package fundamentos.conceitosBasicos;

import java.util.Scanner;

public class FahrenheitParaCelsius {

	public static void main(String[] args) {
		// (°F - 32) / 1.8 = °C
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		entrada.close();
		
		double celsius = (fahrenheit - 32) / 1.8;
		System.out.printf("A temperatura %.2fF° equivale a %.2fC°", fahrenheit, celsius);
	}
}
