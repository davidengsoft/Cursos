package exercicios.src.classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4565.63);
        //p1.nome = "Notebook";
        //p1.preco = 4565.63;
        //p1.desconto = 5;
        Produto.desconto = 29;

        System.out.printf("%.2f", p1.precoComDesconto(5.0));

        var p2 = new Produto();
        p1.nome = "Caneta preta";
        p2.preco = 2.75;

        System.out.printf("\n%.2f", p2.precoComDesconto());
    }
}