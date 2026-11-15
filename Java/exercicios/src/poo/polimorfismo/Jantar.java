package exercicios.src.poo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(85.5);

        Comida arroz = new Arroz(0.200);
        Comida feijao = new Feijao(0.180);

        System.out.println(convidado.getPeso());

        convidado.comer(arroz);
        convidado.comer(feijao);
        System.out.println(convidado.getPeso());

        Comida sorvete = new Sorvete(0.100);

        convidado.comer(sorvete);
        System.out.println(convidado.getPeso());

    }

}
