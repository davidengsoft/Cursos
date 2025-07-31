package exercicios.src.poo.composicao.desafio;

public class Item {

    int quantidade;
    final Produto produto;

    Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

}
