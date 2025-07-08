package exercicios.src.classe;

public class AreaCirc {

    double raio;
    static final double PI = 3.1415;

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double calcularArea() {
        return Math.pow(raio, 2) * PI;
    }

    static  double calcularArea(double raio) {
        return Math.pow(raio, 2) * PI;
    }
}
