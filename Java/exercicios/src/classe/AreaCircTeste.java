package exercicios.src.classe;


public class AreaCircTeste {

    public static void main(String[] args) {

        AreaCirc area01 = new AreaCirc(10);
        System.out.println(area01.area());


        AreaCirc area02 = new AreaCirc(5.74);
        System.out.println(area02.area());

        System.out.println("Valor de PI: " + AreaCirc.PI);
    }
}
