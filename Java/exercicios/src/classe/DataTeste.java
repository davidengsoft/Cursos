package exercicios.src.classe;

public class DataTeste {

    public static void main(String[] args) {

        Data data1 = new Data(4, 10, 2005);

        Data data2 = new Data();
        data2.ano = 2025;
        data2.dia = 23;
        data2.mes = 06;

        Data data3 = new Data();

        System.out.println(data1.dataFormatada());
        System.out.println(data2.dataFormatada());
        System.out.println(data3.dataFormatada());

    }
}
