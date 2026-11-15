package exercicios.src.poo.heranca;

import java.util.Random;

public class Jogador {

    private final String NOME;
    private double vida = 100;
    private int x;
    private int y;
    private double dano;

    public Jogador(String nome, double dano) {
        Random rand = new Random();
        x = rand.nextInt(24) + 1;
        y = rand.nextInt(24) + 1;
        this.NOME = nome;
        this.dano = dano;
    }

    public Jogador(int x, int y, String nome, double dano) {
        setX(x);
        setY(y);
        this.NOME = nome;
        this.dano = dano;
    }

    boolean andar(Direcao direcao) {

        if (direcao == Direcao.NORTE) {
            if (y < 25) {
                y++;
                return true;
            }
        }

        if (direcao == Direcao.SUL) {
            if (y > 1) {
                y--;
                return true;
            }
        }

        if (direcao == Direcao.LESTE) {
            if (x < 25) {
                x++;
                return true;
            }
        }

        if (direcao == Direcao.OESTE) {
            if (x > 1) {
                x--;
                return true;
            }
        }

        return false;
    }

    void atacar(Jogador jogador) {

        int deltaX = Math.abs(x - jogador.x);
        int deltaY = Math.abs(y - jogador.y);

        if (deltaX < 2 && deltaY < 2) {
            jogador.vida -= dano;
        }
    }

    public int getX() {return x;}
    public void setX(int x) {this.x = x;}

    public int getY() {return y;}
    public void setY(int y) {this.y = y;}

    public double getDano() {
        return dano;
    }
    public void setDano(double dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return String.format("\n=========================\n%s\n=========================\n" +
                "Posição: [x = %d, y = %d]\nSaúde: %.2f\nDano: %.2f\n------------------------", NOME, x, y, vida, dano);

    }
}
