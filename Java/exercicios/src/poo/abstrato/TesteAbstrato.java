package exercicios.src.poo.abstrato;

public class TesteAbstrato {

    public static void main(String[] args) {

        Mamifero a = new Carrocho();
        System.out.println(a.caracteristicaPrincipal());
        System.out.println(a.mover());
        System.out.println(a.respirar());
    }
}
