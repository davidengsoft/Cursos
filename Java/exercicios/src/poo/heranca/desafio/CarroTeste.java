package exercicios.src.poo.heranca.desafio;

public class CarroTeste {

    public static void main(String[] args) {

        Carro ferrari = new Ferrari();
        Carro civic = new Civic();


        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        civic.acelerar();
        civic.acelerar();
        civic.acelerar();

        System.out.println(ferrari);
        System.out.println(civic);


        System.out.print("\n");


        ferrari.frear();
        ferrari.frear();
        ferrari.frear();

        civic.frear();
        civic.frear();
        civic.frear();

        System.out.println(ferrari);
        System.out.println(civic);
    }
}
