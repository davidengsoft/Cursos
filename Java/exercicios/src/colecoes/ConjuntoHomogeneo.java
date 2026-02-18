package exercicios.src.colecoes;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Set;

public class ConjuntoHomogeneo {

    public static void main(String[] args) {

        Set<String> listaDeAprovados = new HashSet<>();
        listaDeAprovados.add("Ana");
        listaDeAprovados.add("Carlos");
        listaDeAprovados.add("Luca");
        listaDeAprovados.add("Pedro");

        System.out.println("Candidatos aprovados\n");
        for (String candidato : listaDeAprovados) {
            System.out.println(candidato);
        }

        System.out.println("\n======================\n");

        SortedSet<String> listaDeReprovados = new TreeSet<>();
        listaDeReprovados.add("David");
        listaDeReprovados.add("Mathias");
        listaDeReprovados.add("José");
        listaDeReprovados.add("Guilherme");


        System.out.println("Candidatos reprovados\n");
        for (String candidato : listaDeReprovados) {
            System.out.println(candidato);
        }
    }
}
