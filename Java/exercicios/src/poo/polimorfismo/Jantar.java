package exercicios.src.poo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa david = new Pessoa(66.00);
        System.out.println(david.getPeso());

        Comida arroz = new Arroz(0.150);
        Comida feijao = new Feijao(0.180);
        Comida sorvete = new Sorvete(0.400);

        david.comer(arroz);
        david.comer(feijao);
        david.comer(sorvete);
        System.out.println(david.getPeso());

    }

}
