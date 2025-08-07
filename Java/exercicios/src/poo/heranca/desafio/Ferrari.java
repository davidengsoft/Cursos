package exercicios.src.poo.heranca.desafio;

public class Ferrari extends Carro {

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    public void acelerar() {
        velocidadeAtual += 15;
    }
    public void frear() {
        velocidadeAtual -= 15;
    }
}
