package exercicios.src.classe;

public class Equals {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "David de Oliveira";
        u1.email = "david@gmail.com";


        Usuario u2 = new Usuario();
        u2.nome = "David de Oliveira";
        u2.email = "david@gmail.com";

        System.out.println(u1 == u2); // Compara o endereço de memória doa objetos
        System.out.println(u1.equals(u2)); // Compara os atributos dos objetos
    }
}
