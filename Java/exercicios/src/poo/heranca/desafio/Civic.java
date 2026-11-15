package exercicios.src.poo.heranca.desafio;

public class Civic extends Carro implements Luxo{

    protected boolean arLigado = false;

    @Override
    void acelerar() {
        if (arLigado) {
            setVelocidadeAtual(getVelocidadeAtual() + 10);
        } else {
            setVelocidadeAtual(getVelocidadeAtual() + 15);
        }

    }

    @Override
    public void ligarAr() {
        arLigado = true;
    }

    @Override
    public void desligarAr() {
        arLigado = false;
    }
}
