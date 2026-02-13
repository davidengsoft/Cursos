package exercicios.src.classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data(4, 10, 2005);
        Data d2 = new Data(23, 3, 2005);

        System.out.println(d1.imprimirInformacao());
        System.out.println(d2.imprimirInformacao());
    }
}
