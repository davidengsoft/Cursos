package exercicios.src.Lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Produto> isExpensive = prod -> (prod.PRECO * (1 - prod.DESCONTO)) >= 750;


        Produto produto = new Produto("Notebook", 3893.89, 0.15);
        System.out.println(isExpensive.test(produto));

    }

}
