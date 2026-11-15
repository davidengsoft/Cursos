package exercicios.src.classe;

public class AreaCirc {

    double raio; //Atributo de instância. Cada objeto terá seu próprio valor.
    final static double PI = 3.1415; //Atributo de classe.
                                     // O valor definido é o mesmo para todos objetos
                                     // (palavra chave: static)

    AreaCirc(double raio) {
        this.raio = raio;
    }

    double area() {
        return Math.pow(raio, 2) * PI;
    }
}
