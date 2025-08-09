package exercicios.src.poo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa david = new Pessoa(66.00);
        System.out.println(david.getPeso());

        Arroz arroz = new Arroz(0.150);
        Feijao feijao = new Feijao(0.180);
        Sorvete sorvete = new Sorvete(0.400);
        //Comida comida = new Comida(); //Não posso instanciar um objeto da classe comida, pois ela foi classificada como abstract


        david.comer(arroz);
        david.comer(feijao);
        david.comer(sorvete);
        System.out.println(david.getPeso());

    }

}
