package exercicios.src.classe.desafioDoModulo;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if(comida != null) {
            this.peso += comida.pesoComida;
        }
    }

    String apresentar() {
        return String.format("Nome: %s,  Peso: %.2f", nome, peso);
    }
}
