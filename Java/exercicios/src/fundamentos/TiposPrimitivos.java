package exercicios.src.fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos númericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 5613;
		long pontosAcumulados = 3_134_845_223L;
		
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false;
		//boolean naoEstaDeFerias = true;
		
		// Tipo caractere;
		char status = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens 
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// Salário
		System.out.println(id + ": ganha -> R$" + salario);
		
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
