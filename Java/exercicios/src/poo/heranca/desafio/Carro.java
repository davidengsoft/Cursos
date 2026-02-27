package exercicios.src.poo.heranca.desafio;

public class Carro {

    private double velocidadeAtual = 0.0;

    public void acelerar(){
        velocidadeAtual += 5;
    }

    public void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        if (velocidadeAtual >= 0) {
            this.velocidadeAtual = velocidadeAtual;
        }

    }

    @Override
    public String toString() {
        return "A velocidade atual do carro é " + this.velocidadeAtual + "km/h";
    }
}
