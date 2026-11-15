package exercicios.src.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionam elementos na fila

        // A diferença é o comportamento
        // qunado a fila está cheia
        fila.add("Ana");  // Lançará uma exceção caso a fila esteja cheia.
        fila.offer("Bia");
        fila.offer("Carlos");
        fila.offer("Daniel");// Retorna falso caso a fila esteja cheia.
        fila.offer("Rafaela");

        // Peek e element -> obter próximo elemento da fila (sem remover)

        // A diferença é o comprotamento quando a fila está vazia.
        System.out.println(fila.peek()); // retorna null se a fila estiver vazia.
        System.out.println(fila.element());// lança uma exceção se a fila estiver vazia.

        System.out.println("===================");
        // poll() e remove() -> obtem próximo elemento da fila e remove.
        System.out.println(fila.poll()); // Retorna NULL se a fila estiver vazia
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());// Lança uma exceção se a fila estiver vazia




    }
}
