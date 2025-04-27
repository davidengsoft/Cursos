package exercicios.src.fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1.1345683916;	// Implícita
		System.out.println(a);
		
		
		float b = (float) 1.0;	// Explícita (CAST)
		System.out.println(b);
		
		int c = 127;
		byte d = (byte) c;	// Explícita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int i = (int) e;
		System.out.println(i);
		
	}
}