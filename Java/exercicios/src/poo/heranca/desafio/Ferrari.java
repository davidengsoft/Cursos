package exercicios.src.poo.heranca.desafio;

public class Ferrari extends Carro{

    public Ferrari(String modelo, int fatorAceleracao, int velocidadeMaxima) {
        super(modelo, fatorAceleracao, velocidadeMaxima);
    }

    @Override
    public void acelerar() {
        setVelocidadeAtual(this.getVelocidadeAtual() + this.getFATOR_ACELERACAO());
    }
}
