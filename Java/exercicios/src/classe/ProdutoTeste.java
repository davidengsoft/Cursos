package exercicios.src.classe;


public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook");
        p1.preco = 4532.80;

        var p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 123.15;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        System.out.printf("R$%.2f\n", precoFinal1);

        double precoFinal2 = p2.precoComDesconto();
        System.out.printf("R$%.2f\n", precoFinal2);


    }
}
