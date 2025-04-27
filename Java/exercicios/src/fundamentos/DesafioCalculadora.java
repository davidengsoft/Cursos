package exercicios.src.fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double number1 = entrada.nextDouble();
		
		System.out.print("Digite um segundo número: ");
		double number2 = entrada.nextDouble();
		
		System.out.print("Agora informe qual operção será realizada: ");
		String operador = entrada.next();
		
		double calculo = operador.equals("+") ? number1 + number2 : 0;
		calculo = operador.equals("-") ? number1 - number2 : calculo;
		calculo = operador.equals("*") ? number1 * number2 : calculo;
		calculo = operador.equals("/") ? number1 / number2 : calculo;
		calculo = operador.equals("%") ? number1 % number2 : calculo;
		
		System.out.printf("%.2f %s %.2f = %.2f",  number1, operador, number2, calculo);
		
		entrada.close();
	}
}
