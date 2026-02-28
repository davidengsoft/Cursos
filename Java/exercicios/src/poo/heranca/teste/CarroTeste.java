package exercicios.src.poo.heranca.teste;

import exercicios.src.poo.heranca.desafio.Carro;
import exercicios.src.poo.heranca.desafio.Civic;
import exercicios.src.poo.heranca.desafio.Ferrari;

public class CarroTeste {

    public static void main(String[] args) {

        Carro ferrari = new Ferrari("Ferrari", 15, 340);
        System.out.println("========================\nFerrari\n========================");
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        System.out.println(ferrari);

        ferrari.frear();
        ferrari.frear();

        System.out.println(ferrari);



        Carro civic = new Civic("Honda Civic",5, 220);
        System.out.println("\n========================\nHonda Civic\n========================");
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();

        System.out.println(civic);

        civic.frear();
        civic.frear();
        civic.frear();
        System.out.println(civic);
    }
}
