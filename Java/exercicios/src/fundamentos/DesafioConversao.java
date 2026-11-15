package exercicios.src.fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salário: ");
		String salario1 = entrada.next().replace("," , ".");
		
		System.out.print("Digite o segundo salário: ");
		String salario2 = entrada.next().replace("," , ".");
		
		System.out.print("Digite o terceiro salário: ");
		String salario3 = entrada.next().replace("," , ".");
		
		
		Double mediaSalario = ( Double.parseDouble(salario1) + Double.parseDouble(salario2) + Double.parseDouble(salario3) ) / 3;
		
		System.out.printf("\nA média dos seus últimos 3 salários é: R$%s", mediaSalario.toString().replace(".", ","));

		entrada.close();
		
		/*Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor dos últimos três salários que você recebeu.");
		
		System.out.print("\n1º salário: ");
		String salario1 = entrada.nextLine().replace("," , ".");
		
		System.out.print("2º salário: ");
		String salario2 = entrada.nextLine().replace("," , ".");
		
		System.out.print("3º salário: ");
		String salario3 = entrada.nextLine().replace("," , ".");
		
		
		double mediaSalario = (Double.parseDouble(salario1) + Double.parseDouble(salario2) + Double.parseDouble(salario3)) / 3;
		System.out.println("A média dos últimos três salários é " + mediaSalario);
		
		entrada.close();*/
	}
}
