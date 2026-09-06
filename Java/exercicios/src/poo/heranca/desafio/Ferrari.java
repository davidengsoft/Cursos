package exercicios.src.poo.heranca.desafio;

import exercicios.src.EstruturaDeControle.condicional.IfElse;

public class Ferrari extends Carro implements Esportivo, Luxo{

    protected boolean turboLigado = false;

    @Override
    void acelerar() {
        if (turboLigado) {
            setVelocidadeAtual(getVelocidadeAtual() + 50);
        }
        else {
            setVelocidadeAtual(getVelocidadeAtual() + 30);
        }
    }

    @Override
    public void ligarTurbo(){
        turboLigado = true;
    } 

    @Override
    public void desligarTurbo(){
        turboLigado = false;
    }

    @Override
    public void ligarAr() {

    }

    @Override
    public void desligarAr() {
        
    }
}
