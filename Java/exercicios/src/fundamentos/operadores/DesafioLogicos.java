package exercicios.src.fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F) 
		// Trabalho na quinta (V ou F)
		
		boolean trabTerca = true;
		boolean trabQuint = false;
		boolean TV50 = trabTerca && trabQuint;
		boolean TV32 = trabTerca ^ trabQuint;
		boolean sorvete = trabTerca || trabQuint;
		boolean naoTmrSorvt = !sorvete;
		
		System.out.println("Vão comprar a televisão de 50 polegadas? " + TV50);
		System.out.println("Vão comprar a televisão de 32 polegadas? " + TV32);
		System.out.println("Vão tomar sorvete? " + sorvete);
		System.out.println("Não vão tomar sorvete? " + naoTmrSorvt);
		
	}
}
