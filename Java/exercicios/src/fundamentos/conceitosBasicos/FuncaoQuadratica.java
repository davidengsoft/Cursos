package fundamentos.conceitosBasicos;

public class FuncaoQuadratica {

	public static void main(String[] args) {
		
		// ax**2 + bx + c
		double a = 1, b = 12, c = -13;
		double numerador = Math.sqrt(Math.pow(b, 2) - 4 * a * c); 
		double denominador = 2 * a;
		
		double x1 = ( -b + numerador ) / denominador;
		double x2 = ( -b - numerador ) / denominador;
		
		System.out.printf("A raizes dessa função são %.2f e %.2f", x1, x2);
		
	}
}
