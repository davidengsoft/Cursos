package exercicios.src.poo.composicao;

public class Motor {

    Carro carro; //Objeto carro foi instânciado
    boolean ligado = false;
    double fatorInjecao = 1;


    Motor(Carro carro) {
        this.carro = carro;
    }

    int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
}
