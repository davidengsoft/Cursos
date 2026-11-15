package exercicios.src.Lambdas;

public class CalculoTeste1 {

    public static void main(String[] args) {

        Calculo soma = new Somar();
        Calculo multiplicação = new Multiplicar();

        System.out.println(soma.executar(2, 5));
        System.out.println(multiplicação.executar(5, 9));

    }

}
