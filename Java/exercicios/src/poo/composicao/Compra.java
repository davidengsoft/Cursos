package exercicios.src.poo.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> carrinho = new ArrayList<>();

    void adicionarItem(String nome, int quantidade, double preco) {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    void adicionarItem(Item produto) {
        this.carrinho.add(produto);
        produto.compra = this;
    }

    double getValorTotal() {
        double total = 0;

        for (Item carrinho: this.carrinho) {
            total += carrinho.quantidade * carrinho.preco;
        }

        return total;
    }

}
