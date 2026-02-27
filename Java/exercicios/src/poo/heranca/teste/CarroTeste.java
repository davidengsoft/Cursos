package exercicios.src.poo.heranca.teste;

import exercicios.src.poo.heranca.desafio.Carro;
import exercicios.src.poo.heranca.desafio.Civic;
import exercicios.src.poo.heranca.desafio.Ferrari;

public class CarroTeste {

    public static void main(String[] args) {

        Carro ferrari = new Ferrari();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        System.out.println(ferrari);

        ferrari.frear();
        ferrari.frear();

        System.out.println(ferrari);

        System.out.println("======================================");

        Carro civic = new Civic();
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
