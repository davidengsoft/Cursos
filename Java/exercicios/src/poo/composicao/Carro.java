package exercicios.src.poo.composicao;

public class Carro {

    Motor motor; //Objeto motor foi instanciado.


    Carro () {
        this.motor = new Motor(this); /*Quando intanciar um objeto da classe Carro, ele irá
                                              ser passado como argumento para o contrutor da classe
                                              Motor. Sendo assim, this se refere ao objeto c1. */

    }

    void acelerar() {
        if (motor.fatorInjecao < 2.6) motor.fatorInjecao += 0.4;
    }

    void frear() {
        if (motor.fatorInjecao > 0.5) motor.fatorInjecao -= 0.4;
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }
}
