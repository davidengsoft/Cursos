package fundamentos.operadores;

public class Ternarios {
	public static void main(String[] args) {
		
		double media = 10;
		
		String resultadoParcial = media >= 5 ? "Recuperação" : "Reprovado";
		String resultado = media >= 7.0 ? "Aprovado" : resultadoParcial;
		
		System.out.println(resultado);
	}
}