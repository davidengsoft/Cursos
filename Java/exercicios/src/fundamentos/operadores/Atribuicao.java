package exercicios.src.fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b;
		c -= a;
		c *= b;
		c /= b;
		System.out.println(c);
		
		c %= 2;
		System.out.println(c);
		
	}
}