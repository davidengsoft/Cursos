package exercicios.src.colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("David"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("José"));
        lista.add(new Usuario("Rebeca"));

        System.out.println(lista.get(2));

        for( Usuario u: lista) {
            System.out.println(u.nome);
        }

        System.out.println("-------");

        lista.remove(4);
        lista.remove(new Usuario("Ana"));
        for(Usuario u: lista) {
            System.out.println(u.nome);
        }

        System.out.println("-------");
        System.out.println("Tem? " + lista.contains(new Usuario("David")));
        System.out.println("Tem? " + lista.contains(new Usuario("Rebeca")));

    }
}
