package exercicios.src.colecoes;

import java.util.Objects;

public class Usuario {

    String nome;

    Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }


    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
