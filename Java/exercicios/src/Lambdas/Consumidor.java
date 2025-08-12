package exercicios.src.Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.NOME);

        Produto p1 = new Produto("Caneta", 5.50, 0.09);
        imprimir.accept(p1);
        System.out.print("\n");

        Produto p2 = new Produto("Notebook", 2987.99, 0.25);
        Produto p3 = new Produto("Caderno", 19.90, 0.03);
        Produto p4 = new Produto("Borracha", 7.80, 0.18);
        Produto p5 = new Produto("Lapis", 2.00, 0.1);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.PRECO));
        produtos.forEach(System.out::println);
    }
}
