package exercicios.src.classe;

public class Equals {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "David";
        u1.email = "david@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "David";
        u2.email = "david@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u2.equals(u1));
        System.out.println(u1.equals(u2));
    }
}
