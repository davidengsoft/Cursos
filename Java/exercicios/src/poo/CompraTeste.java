package exercicios.src.poo;

public class CompraTeste {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "David";
        compra1.carrinho.add(new Item("Play Station 5", 1, 3200));
        compra1.carrinho.add(new Item("Gof of war 2018", 1, 74));
        compra1.carrinho.add(new Item("Controle PS5", 1, 295));

        compra1.adicionarItem("Pasta térmica", 1, 25);

        System.out.println(compra1.carrinho.size());
        System.out.println(compra1.getValorTotal());

        for (Item itens: compra1.carrinho) {
            System.out.printf("Produto[%s], Unid[%d], Preço[R$%.2f]\n", itens.nome, itens.quantidade, itens.preco);
        }

    }

}
