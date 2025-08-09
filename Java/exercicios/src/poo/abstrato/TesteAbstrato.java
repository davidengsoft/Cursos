package exercicios.src.poo.abstrato;

public class TesteAbstrato {

    public static void main(String[] args) {

        Mamifero cachorro = new Carrocho();
        System.out.println(cachorro.andar());
        System.out.println(cachorro.respirar());
        System.out.println(cachorro.seAlimentar());
    }
}
