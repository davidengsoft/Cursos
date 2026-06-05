package exercicios.src.poo.heranca.desafio;

public class CarTeste {

    public static void main(String[] args) {

        Carro civc = new Civic();
        civc.acelerar();
        civc.acelerar();
        civc.acelerar();
        System.out.println(civc);

        Carro ferrari = new Ferrari();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println(ferrari);
    }
}
