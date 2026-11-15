package exercicios.src.Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x, y) -> x + y;
        System.out.println(calc.apply(5.0, 5.0));

        BinaryOperator<Integer> calc2 = (x, y) -> x * y;
        System.out.println(calc2.apply(8, 9));
    }
}
