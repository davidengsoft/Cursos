package exercicios.src.Lambdas;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";

        System.out.println(parOuImpar.apply(23));

        Function<String, String> resultado = valor -> "O número é " + valor;

        String resultadoFinal = parOuImpar.andThen(resultado).apply(32);

        System.out.println(resultadoFinal);
    }
}
