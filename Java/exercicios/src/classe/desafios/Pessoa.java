package exercicios.src.classe.desafios;

public class Pessoa {

    String nome;
    double peso;

    String comer(Comida comer) {
        peso += comer.peso;
        return String.format("%.2fkg", peso);
    }
}
