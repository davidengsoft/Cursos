package exercicios.src.poo.heranca.desafio;

public class Ferrari extends Carro {

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }


    void acelerar() {
        velocidadeAtual += 15;
    }

    void frear() {
        velocidadeAtual -= 15;
    }
}
