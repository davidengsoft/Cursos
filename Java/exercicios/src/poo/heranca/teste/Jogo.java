package exercicios.src.poo.heranca.teste;

import exercicios.src.poo.heranca.Heroi;
import exercicios.src.poo.heranca.Jogador;
import exercicios.src.poo.heranca.Monstro;

public class Jogo {

    public static void main(String[] args) {

        Jogador monstro = new Monstro(10, 10);
        Jogador heroi = new Heroi(10, 11);

        System.out.println(monstro.getVida());
        System.out.println(heroi.getVida());

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println(monstro.getVida());
        System.out.println(heroi.getVida());

    }
}
