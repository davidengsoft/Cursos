package exercicios.src.classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 25;

    Produto() {}

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto() {
        return preco - (preco * (desconto / 100));
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco - (preco * (desconto / 100) + preco * (descontoDoGerente / 100));
    }
}