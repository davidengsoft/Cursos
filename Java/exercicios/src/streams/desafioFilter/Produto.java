package exercicios.src.streams.desafioFilter;

import java.util.List;

public class Produto {

    private final String nome;
    private double preco;
    private int quantEstoque;

    public Produto(String nome, double preco, int quantEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }
}
