package exercicios.src.classe.desafioDoModulo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "David";
        p1.peso = 65;

        Comida c1 = new Comida();
        c1.nomeComida = "Arroz";
        c1.pesoComida = 0.100;

        Comida c2 = new Comida();
        c2.nomeComida = "Feijão";
        c2.pesoComida = 0.120;

        System.out.println(p1.comer(c1.pesoComida, c2.pesoComida));
    }
}
