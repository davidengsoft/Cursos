package exercicios.src.classe.desafioDoModulo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("David", 65);
        System.out.println(p1.apresentar());

        Comida c1 = new Comida("Arroz", 0.100);
        Comida c2 = new Comida("Feijão", 0.120);

        p1.comer(c1);
        System.out.println(p1.apresentar());

        p1.comer(c2);
        System.out.println(p1.apresentar());

    }
}
