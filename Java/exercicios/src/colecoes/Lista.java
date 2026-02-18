package exercicios.src.colecoes;

import java.util.ArrayList;


public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("David"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Gloria"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3));

        for (Usuario usuario : lista) {
            System.out.println(usuario.nome);
        }
    }
}
