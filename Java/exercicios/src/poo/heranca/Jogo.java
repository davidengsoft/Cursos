package exercicios.src.poo.heranca;

public class Jogo {

    public static void main(String[] args) {

        Jogador heroi = new Heroi(10, 24, "David", 15.5);
        Jogador monstro = new Monstro(11, 24, "Pedro", 10);

        System.out.println(heroi);
        System.out.println(monstro);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        heroi.atacar(monstro);

        System.out.println(monstro);
        System.out.println(heroi);
    }
}
