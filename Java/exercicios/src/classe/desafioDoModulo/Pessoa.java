package exercicios.src.classe.desafioDoModulo;

public class Pessoa {

    String nome;
    double peso;

    String comer(double pesoComida01, double pesoComida02) {
        double pesoAtual = pesoComida01 + pesoComida02 + peso;
        return String.format("%s pesava %.2f. Agora pesa %.2f", nome, peso, pesoAtual);
    }
}
