package exercicios.src.poo.heranca.desafio;

import exercicios.src.EstruturaDeControle.condicional.IfElse;

public class Ferrari extends Carro implements Esportivo, Luxo{

    protected boolean turboLigado = false;
    protected boolean arLigado = false;

    @Override
    void acelerar() {
        if (turboLigado && arLigado) {
            setVelocidadeAtual(getVelocidadeAtual() + 45);
        } else if (turboLigado) {
            setVelocidadeAtual(getVelocidadeAtual() + 45);
        } else if (arLigado) {
            setVelocidadeAtual(getVelocidadeAtual() + 25);
        } else {
            setVelocidadeAtual(getVelocidadeAtual() + 30);
        }

    }

    @Override
    public void ligarTurbo() {
        turboLigado = true;
    }

    @Override
    public void desligarTurbo() {
        turboLigado = false;
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
