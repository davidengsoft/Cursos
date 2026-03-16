package exercicios.src.poo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

    int fatorAceleracaoInicial;
    public Ferrari(String modelo, int fatorAceleracao, int velocidadeMaxima) {
        super(modelo, fatorAceleracao, velocidadeMaxima);
        fatorAceleracaoInicial = fatorAceleracao;
    }

    @Override
    public void acelerar() {
        setVelocidadeAtual(this.getVelocidadeAtual() + this.getFatorAceleracao());
    }

    @Override
    public void ligarTurbo() {
        this.setFatorAceleracao(35);
    }

    @Override
    public void desligarTurbo() {
        this.setFatorAceleracao(fatorAceleracaoInicial);
    }

    @Override
    public void ligarAr() {

    }

    @Override
    public void desligarAr() {

    }
}
