package exercicios.src.poo.heranca.teste;

import exercicios.src.poo.heranca.desafio.Carro;
import exercicios.src.poo.heranca.desafio.Civic;
import exercicios.src.poo.heranca.desafio.Ferrari;

public class CarroTeste {

    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari(315);
        Civic civic = new Civic(212);


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

        ferrari.ligarTurbo();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        System.out.println(ferrari);

        System.out.println(ferrari.nivelDoAr());

    }
}
