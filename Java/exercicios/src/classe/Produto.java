package exercicios.src.classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto() {

    }

    Produto(String nomeInicial) {
        nome =nomeInicial;
    }


    double precoComDesconto() {
        return preco - (preco * desconto);
    }

}
