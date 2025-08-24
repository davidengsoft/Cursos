package exercicios.src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {


        Aluno a1 = new Aluno("David", 7.8);
        Aluno a2 = new Aluno("Rebeca", 9.9);
        Aluno a3 = new Aluno("Carlos", 8.5);
        Aluno a4 = new Aluno("Roberto", 5.3);
        Aluno a5 = new Aluno("Bia", 9.1);
        Aluno a6 = new Aluno("Gloria", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7.0;
        Function<Aluno, String> saudacaoAprovado = aluno -> "Parabéns " + aluno.nome + "! Você foi aprovado(a)";

        alunos.stream()
                .filter(aprovado)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
    }
}
