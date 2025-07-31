package exercicios.src.poo.composicao.desafio;

public class Sistema {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("David");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 1.20, 2);
        compra1.adicionarItem("Notebook",2567.99, 1);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 25.50, 1);
        compra2.adicionarItem("Impressora", 1250.80, 1);

        cliente1.adicionarCompra(compra1);
        cliente1.adicionarCompra(compra2);

        System.out.printf("O valor total das compras foi de R$%.2f", cliente1.getValorTotal());
    }
}
