package exercicios.src.poo.heranca.desafio;

public class Carro {

    protected final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual = 0;

    Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }


    public void acelerar() {
        if (velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += 5;
        }
    }

    public void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;

        }
    }

    public String toString() {
        return "Velocidade atual => " + this.velocidadeAtual + "km/h";
    }
}
