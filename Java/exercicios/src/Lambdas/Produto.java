package exercicios.src.Lambdas;

public class Produto {

    final String NOME;
    final double PRECO;
    final double DESCONTO;

    public Produto(String NOME, double PRECO, double DESCONTO) {
        this.NOME = NOME;
        this.PRECO = PRECO;
        this.DESCONTO = DESCONTO;
    }


    public String toString() {
        double precoFinal = PRECO * (1 - DESCONTO);
        return NOME + " tem preço de R$" + precoFinal;
    }
}
