package exercicios.src.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Guilherme");

        System.out.println(fila.peek());  //Os métodos peek e element retorna o primeiro nome da lista.
        System.out.println(fila.element()); //A diferença entre os dois está no comportamento específico quando a fila estiver vazia
        System.out.println();
    }
}
