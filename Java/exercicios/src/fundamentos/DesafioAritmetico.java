package exercicios.src.fundamentos;

public class DesafioAritmetico {

	public static void main(String[] args) {
			
		double a = Math.pow( (6 * (3 + 2) ) , 2);
		
		a = a / (3 * 2);
	
		
		double b = (1 - 5) * (2 - 7); 
		b = Math.pow( (b / 2) , 2);
	
		
		double c = Math.pow( (a - b) , 3);
		
		 
		double d = Math.pow(10, 3);
		
		double resultFinal = c / d;  
		System.out.println(resultFinal);
	}
}