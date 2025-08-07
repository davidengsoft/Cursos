package exercicios.src.poo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("David",230);
        p1.setIdade(-30);
        System.out.println(p1.getIdade());

        p1.setIdade(19);
        System.out.println(p1.getIdade());

        System.out.println(p1.toString());

    }
}
