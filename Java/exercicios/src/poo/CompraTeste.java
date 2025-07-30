package exercicios.src.poo;

public class CompraTeste {

    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "João Pedro";
        c1.carrinho.add(new Item("Caneta", 20, 7.93));

    }

}
