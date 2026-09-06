package exercicios.src.poo.heranca.desafio;

public class CarTeste {

    public static void main(String[] args) {

        Carro civc = new Civic();
        civc.acelerar();
        civc.acelerar();
        civc.acelerar();
        System.out.println(civc);

        Ferrari ferrari = new Ferrari();
        ferrari.acelerar();

        ferrari.ligarTurbo();

        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println(ferrari);
    }
}
