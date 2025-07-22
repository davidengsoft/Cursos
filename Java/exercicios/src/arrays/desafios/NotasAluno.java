package exercicios.src.arrays.desafios;

public class NotasAluno {

    String nome;
    double nota;

    String calcularMedia(double[] notas) {
        double total = 0, media;
        for(double nota: notas) total += nota;
        media = total / notas.length;
        return String.format("A média de %s foi %.2f", this.nome, media);
    }
}
