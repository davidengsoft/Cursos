package exercicios.src.fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (°F - 32) * 5/9 = °C
		
		double temperaturaF = 86;
		final int NUMBER1 = 32;
		final double NUMBER2 = 5.0/9.0;
		double temperaturaC = (temperaturaF - NUMBER1) * NUMBER2;
		
		System.out.printf("%.2f °F", temperaturaC);
		
	}
}
