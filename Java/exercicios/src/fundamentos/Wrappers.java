package exercicios.src.fundamentos;

public class Wrappers {

	public static void main(String[] args) {

		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000");
		Long l = 1000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f= 123.10F;
		System.out.println(f);
		
		Double d = 1234.78965;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c.hashCode());
		
		
	}
}
