package exercicios.src.poo.composicao;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> itens = new ArrayList<>();
    String cliente;

    void adicionarItem(Item item) {
        itens.add(item);
        item.compra = this;
    }

    double getValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.quantidade * item.preco;
        }

        return total;
    }
}
