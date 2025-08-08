package exercicios.src.poo.heranca.desafio;

public class Carro {

    protected final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual = 0;
    private int delta = 5;

    Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }


    public void acelerar() {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDelta();
        }
    }

    public void frear() {
        if (velocidadeAtual >= getDelta()) {
            velocidadeAtual -= getDelta();
        } else {
            velocidadeAtual = 0;

        }
    }

    public String toString() {
        return "Velocidade atual => " + this.velocidadeAtual + "km/h";
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
