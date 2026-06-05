package exercicios.src.poo.heranca.desafio;

public class Carro {

    private int velocidadeAtual;

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    void acelerar(){
        velocidadeAtual += 10;
    }

    void frear(){
        velocidadeAtual = velocidadeAtual >= 10 ? velocidadeAtual - 10 : 0;
    }

    @Override
    public String toString() {
        return String.format("Velocidade: %dkm/h", velocidadeAtual);
    }
}



