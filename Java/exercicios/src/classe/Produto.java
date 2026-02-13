package exercicios.src.classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto() {
        //Construtor padrão teve que ser declarado de forma explicita
    }

    Produto(String nome, double preco, double desconto) {
        this.nome = nome;
    }

    double precoComDesconto() {
        return this.preco - (this.preco * this.desconto);
    }



}
