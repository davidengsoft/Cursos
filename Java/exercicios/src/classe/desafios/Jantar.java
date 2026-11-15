package exercicios.src.classe.desafios;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("David", 71);

        Comida c1 = new Comida("Arroz", 0.250);
        Comida c2 = new Comida("Feijão", 0.260);
        Comida c3 = new Comida("File de peito de frango", 0.300);

        System.out.println(p1.apresentar());

        p1.comer(c1);
        p1.comer(c2);
        p1.comer(c3);
        System.out.println(p1.apresentar());
    }
}
