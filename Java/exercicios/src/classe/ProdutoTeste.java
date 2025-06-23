package exercicios.src.classe;


public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4532.80;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 123.15;
        p2.desconto = 0.10;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.preco - (p1.preco * p1.desconto);
        System.out.printf("R$%.2f\n", precoFinal1);

        double precoFinal2 = p2.preco - (p2.preco * p2.desconto);
        System.out.printf("R$%.2f\n", precoFinal2);


    }
}
