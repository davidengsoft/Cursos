package exercicios.src.EstruturaDeControle.condicional;

import java.util.Scanner;

public class IfElse_ElseIf {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			
			System.out.println("Nota inválida!");
			
		} else if(nota >= 8.1) {
			System.out.println("Conceito A");
		} else if(nota >= 6.1) {
			System.out.println("Conceito B");
		} else if(nota >= 4.1) {
			System.out.println("Conceito C");
		} else if(nota >= 2.1) {
			System.out.println("Conceito D'");
		} else {
			System.out.println("Conceito E");
		}
		
		entrada.close();
	}
}
