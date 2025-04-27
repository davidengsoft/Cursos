package exercicios.src.fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" Dia\n\n");
		
		System.out.println("Hello");
		System.out.println("World\n");
		
		System.out.printf("Mensagem: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f \n", 1234.5678);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.print("Digite seu nome: ");
		String nome =  entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		String n = "100";
		int num = Integer.parseInt(n);
		System.out.print(num + num);
		
		System.out.printf("Nome = %s %s \n", nome, sobrenome);
		System.out.printf("Idade = %d", idade);
		
		entrada.close();
	}

}