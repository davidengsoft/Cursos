package exercicios.src.fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o Segundo número: ");
		
		System.out.printf("Os valores digitados foram %s e %s \n", valor1, valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("A soma é " + soma);
		System.out.println("Média é " + soma / 2);
		
		
	}
}
