package exercicios.src.colecoes;

import java.util.Objects;

public class Usuario {


    String nome;

    Usuario(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }


    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public boolean equals(Object obj) {
        Usuario usuario = (Usuario) obj;
        return this.nome.equals(usuario.nome);
    }
}
