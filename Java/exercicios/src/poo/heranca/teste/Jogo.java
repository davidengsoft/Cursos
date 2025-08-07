package exercicios.src.poo.heranca.teste;

import exercicios.src.poo.heranca.Direcao;
import exercicios.src.poo.heranca.Heroi;
import exercicios.src.poo.heranca.Monstro;

public class Jogo {

    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;
        Heroi heroi = new Heroi(10, 11);

        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem   => " + heroi.vida);
        System.out.println();

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.SUL);


        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem   => " + heroi.vida);
        System.out.println();

    }
}
