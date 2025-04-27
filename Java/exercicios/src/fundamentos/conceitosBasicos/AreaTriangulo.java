package fundamentos.conceitosBasicos;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a altura do triângulo: "); 
		double altura = entrada.nextDouble();
		
		System.out.print("Informe a base do triângulo: ");
		double base = entrada.nextDouble();
		
		
		entrada.close();
		
		double area = ( altura * base ) / 2;
		System.out.printf("A área do triângulo é %.2f", area);
		

	}
}
