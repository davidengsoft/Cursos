package exercicios.src.EstruturaDeControle.laco;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		System.out.println("Digite sair para interromper o loop");
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("\nVocê diz: ");
			valor = entrada.nextLine();
		}
		
		entrada.close();
		System.out.println("\n\nFim do programa!");
	}
}
