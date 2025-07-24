package exercicios.src.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHomogeneo {

    public static void main(String[] args) {

        //Set<String> lista = new HashSet<>();
        SortedSet<String> lista = new TreeSet<>();
        lista.add("1.2");
        lista.add("David");
        lista.add("Set");
        lista.add("false");

        for(String caracteres: lista) {
            System.out.println(caracteres);
        }

        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(120);
        numeros.add(6);

        for (int n: numeros) {
            System.out.println(n);
        }
    }
}
