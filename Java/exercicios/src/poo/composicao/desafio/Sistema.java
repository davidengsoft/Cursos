package exercicios.src.poo.composicao.desafio;

public class Sistema {

    public static void main(String[] args) {

        Cliente cliente01 = new Cliente("David");
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 1.50, 3);
        compra1.adicionarItem("Geladeira", 3250.99, 1);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 33.20, 5);
        compra2.adicionarItem("Impressora", 998, 1);

        cliente01.adicionarCompra(compra1);
        cliente01.adicionarCompra(compra2);

        System.out.println(cliente01.valorTotal());
    }
}
