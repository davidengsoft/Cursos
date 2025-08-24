package fundamentos;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class DesafioMap {

    public static void main(String[] args) {

        Consumer<String> print = System.out::println;
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 364);

        List<Integer> numsInvertidos = nums.stream()
                .map(Integer::toBinaryString) //Converte inteiro para binário
                .map(bin -> new StringBuilder(bin).reverse().toString()) //Inverte a ordem dos caracteres
                .map(binInvertido -> Integer.parseInt(binInvertido, 2)) //Coonverte binário para inteiro
                .collect(Collectors.toList());

        nums.stream().map(Integer::toBinaryString).forEach(print);

        System.out.println("\nNúmeros invertidos...");
        System.out.println(numsInvertidos);

    }
}
