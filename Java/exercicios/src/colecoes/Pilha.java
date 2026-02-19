package exercicios.src.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Príncipe");
        livros.push("Don Qhixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println("================");

        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.remove());


    }
}
