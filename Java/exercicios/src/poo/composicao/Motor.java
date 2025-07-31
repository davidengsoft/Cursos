package exercicios.src.poo.composicao;

public class Motor {

    Carro carro; // Apenas declaração. Objeto não instanciado.
    boolean ligado = false;
    double fatorInjecao = 1;


    Motor(Carro carro) {
        this.carro = carro; //O objeto está sendo instanciado aqui.
    }

    int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
}
