package exercicios.src.classe;


public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89, 0.25);

        Produto p2 = new Produto();
        p2.nome = "Caneta preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;


        System.out.println(p1.nome);
        System.out.println(p2.nome);

        System.out.printf("Valor do notebook com 25%% de desconto: R$%.2f", p1.precoComDesconto());
        System.out.printf("\nValor da caneta preta com 29%% de desconto: R$%.2f", p2.precoComDesconto());

    }
}
