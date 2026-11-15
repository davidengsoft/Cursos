package exercicios.src.Lambdas;


import java.util.Scanner;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        String nome, converter;
        double preco, desconto;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        nome = entrada.nextLine();

        System.out.print("Preço do produto: ");
        converter = entrada.nextLine();
        preco = Double.parseDouble(converter.replace(",", "."));

        System.out.print("Desconto do produto: ");
        converter = entrada.nextLine();
        desconto = Double.parseDouble(converter.replace(",", "."));

        Produto produto = new Produto(nome, preco, desconto);

        entrada.close();


        Function<Produto, Double> precoComDesconto = p -> p.PRECO * (1 - p.DESCONTO);
        UnaryOperator<Double> impostoMunicipal = valor -> valor >= 2500 ? valor * 1.085 : valor;
        UnaryOperator<Double> frete = valor -> valor >= 3000 ? valor + 100 : valor + 50;
        UnaryOperator<Double> arredondar = valor -> Double.parseDouble(String.format("%.2f", valor).replace(",", "."));
        Function<Double, String> formatar = valor -> ("R$" + valor).replace(".", ",");


        String precoFinal = precoComDesconto
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(produto);


        System.out.println("O preço final do produto é " + precoFinal);

    }
}
