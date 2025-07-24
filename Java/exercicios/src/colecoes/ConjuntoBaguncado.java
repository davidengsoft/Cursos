package exercicios.src.colecoes;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println(conjunto);
        System.out.println(conjunto.size());

        conjunto.add("Teste");
        conjunto.add('x');
        System.out.println(conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));

        System.out.println(conjunto.size());

        System.out.println(conjunto.contains("Teste"));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));


        Set numeros = new HashSet();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println(numeros);
        System.out.println(conjunto);

        //conjunto.addAll(numeros); //União entre dois conjuntos
        conjunto.retainAll(numeros); //Retorna os valores que os conjuntos tem em comum
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
