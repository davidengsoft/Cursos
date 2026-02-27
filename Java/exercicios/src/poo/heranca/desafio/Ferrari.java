package exercicios.src.poo.heranca.desafio;

public class Ferrari extends Carro{

    @Override
    public void acelerar() {
        setVelocidadeAtual(this.getVelocidadeAtual() + 15);
    }
}
