package exercicios.src.colecoes;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
public class ConjuntoHeterogeneo {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho do conjunto: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho do conjunto: " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set numeros = new HashSet();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println(numeros);
        System.out.println(conjunto);

        conjunto.addAll(numeros);
        System.out.println(conjunto);

        conjunto.retainAll(numeros);
        System.out.println(numeros);

    }
}
