package exercicios.src.streams.desafioFilter;

import java.util.ArrayList;
import java.util.List;

public class Desafio {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto("Iphone 14", 4199.89, 5);
        Produto p2 = new Produto("TV 60' Samsung", 5679.44, 0);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(new Produto("Tablet Samsung", 1499.99, 1));
        produtos.add(new Produto("Play Station 5", 3299.80, 0));

        produtos.stream()
                .filter(produto -> produto.getPreco() > 1500)
                .filter(produto -> produto.getQuantEstoque() > 0)
                .map(produto -> produto.getNome())
                .forEach(System.out::println);
    }
}
