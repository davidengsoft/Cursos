package exercicios.src.classe.desafios;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida alimento) {
        if (alimento != null) {
            this.peso += alimento.pesoDaComida;
        }
    }

    String apresentar() {
        return String.format("Nome: %s\nPeso: %.2fkg\n\n", this.nome, this.peso);
    }
}
