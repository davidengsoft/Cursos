package exercicios.src.generics;

public class CaixaNumeroTeste {

    public static void main(String[] args) {

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        CaixaNumero<Float> caixaC = new CaixaNumero<>();
        CaixaNumero<Double> caixaD = new CaixaNumero<>();

        caixaB.guardar(10);
        caixaC.guardar(50.49F);
        caixaD.guardar(10.5);


    }


}
