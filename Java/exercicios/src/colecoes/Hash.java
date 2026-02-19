package exercicios.src.colecoes;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();
        usuarios.add(new Usuario("David"));
        usuarios.add(new Usuario("Glória"));
        usuarios.add(new Usuario("Conceição"));
        usuarios.add(new Usuario("Orlando"));

        boolean resultado = usuarios.contains(new Usuario("David"));
        System.out.println(resultado);
    }
}
