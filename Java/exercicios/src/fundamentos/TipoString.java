package exercicios.src.fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!"));
		System.out.println(s.startsWith("B"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("Boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		
		System.out.println("Frase qualquer".indexOf("u"));
	
	}
}