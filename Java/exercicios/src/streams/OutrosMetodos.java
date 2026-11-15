package exercicios.src.streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("David", 7.8);
        Aluno a2 = new Aluno("Julio", 6.1);
        Aluno a3 = new Aluno("Maria", 9.8);
        Aluno a4 = new Aluno("Pedro", 9.9);

        Aluno a5 = new Aluno("David", 7.8);
        Aluno a6 = new Aluno("Luna", 6.1);
        Aluno a7 = new Aluno("Maria", 9.8);
        Aluno a8 = new Aluno("Gabi", 9.9);


        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
        System.out.println("distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit...");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\ntakeWhile...");
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);


    }
}
