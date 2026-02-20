package exercicios.src.poo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();

    void adicionarItem(String nome, double valor, int quant) {
        Produto p = new Produto(nome, valor);
        itens.add(new Item(p, quant));
    }

    double valorDosItens() {
        double valor = 0;

        for (Item item : itens) {
            valor += (item.quant * item.produto.preco);
        }

        return valor;
    }
}
