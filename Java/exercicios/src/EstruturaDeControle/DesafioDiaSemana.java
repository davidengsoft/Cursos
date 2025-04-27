package controle;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		String diaSemana = JOptionPane.showInputDialog("Informe o dia da semana");
		
		if(diaSemana.equalsIgnoreCase("Domingo")) {
			System.out.println(1);
		} else if(diaSemana.equalsIgnoreCase("Ssegunda") || diaSemana.equalsIgnoreCase("Segunda-feira")) {
			System.out.println(2);
		} else if(diaSemana.equalsIgnoreCase("Terça") || diaSemana.equalsIgnoreCase("Terça-feira")) {
			System.out.println(3);
		} else if(diaSemana.equalsIgnoreCase("Quarta") || diaSemana.equalsIgnoreCase("Quarta-feira")) {
			System.out.println(4);
		} else if(diaSemana.equalsIgnoreCase("Quinta") || diaSemana.equalsIgnoreCase("Quinta-feira")) {
			System.out.println(5);
		} else if(diaSemana.equalsIgnoreCase("Sexta") || diaSemana.equalsIgnoreCase("Sexta-feira")) {
			System.out.println(6);
		} else if(diaSemana.equalsIgnoreCase("Sábado")) {
			System.out.println(7);
		} else {
			System.out.println("[ERRO]: Dia inválido");
		}
		
	}
}