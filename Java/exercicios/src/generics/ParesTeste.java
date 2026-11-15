package exercicios.src.generics;

public class ParesTeste {

    public static void main(String[] args) {

        Pares<Integer, String> resultadoConcurso = new Pares<>();
        resultadoConcurso.adicionar(1, "David");
        resultadoConcurso.adicionar(2, "Pedro");
        resultadoConcurso.adicionar(3, "Glória");
        resultadoConcurso.adicionar(4, "Aurora");
        resultadoConcurso.adicionar(2, "Mario");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(4));
        System.out.println(resultadoConcurso.getValor(2));



    }
}
