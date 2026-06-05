package exercicios.src.poo.heranca.desafio;

public class Ferrari extends Carro{

    @Override
    void acelerar() {
        setVelocidadeAtual(getVelocidadeAtual() + 30);
    }
}
