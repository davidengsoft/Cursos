package exercicios.src.classe.desafios;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "David";
        p1.peso = 65;

        Comida c1 = new Comida();
        c1.nome = "Arroz";
        c1.peso = 0.100;

        System.out.println(p1.comer(c1));

        Comida c2 = new Comida();
        c2.nome = "Feijão";
        c2.peso = 0.100;

        System.out.println(p1.comer(c2));


    }
}
