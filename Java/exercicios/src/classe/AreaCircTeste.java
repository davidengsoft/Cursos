package exercicios.src.classe;


public class AreaCircTeste {

    public static void main(String[] args) {

        AreaCirc area1 = new AreaCirc(10);
        AreaCirc area2 = new AreaCirc(5);

        System.out.println(area1.calcularArea());
        System.out.println(area2.calcularArea());
        System.out.println(AreaCirc.calcularArea(50));
    }
}
