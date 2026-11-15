package exercicios.src.fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
	
		String s = "Olá";
		
		s = s.toUpperCase();
		s = s.replace("OLÁ", "Bom dia"); // "Olá" deve ser convertido para "OLÁ", pois o valor original da variável foi alterado pelo método acima
		s = s.concat("!!"); // Concatena um valor na minha variável


		System.out.println(s);
 		System.out.println("David".toUpperCase());
 		System.out.println("David".length());
 		
 		
	}
}