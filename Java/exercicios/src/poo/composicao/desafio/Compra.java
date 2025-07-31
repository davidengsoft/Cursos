package exercicios.src.poo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> carrinho = new ArrayList<>();


    void adicionarItem(String nome, double preco, int qtde) {
        var produto = new Produto(nome, preco);
        this.carrinho.add(new Item(produto, qtde));
    }

    double getValorTotal() {
        double total = 0;

        for (Item item: carrinho) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }
}
