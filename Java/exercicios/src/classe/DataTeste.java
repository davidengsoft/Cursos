package exercicios.src.classe;

public class DataTeste {

    public static void main(String[] args) {

        Data data1 = new Data();
        data1.ano = 2005;
        data1.dia = 4;
        data1.mes = 10;

        System.out.println(data1.dataFormatada());

        Data data2 = new Data();
        data2.ano = 2025;
        data2.dia = 23;
        data2.mes = 06;

        System.out.println(data2.dataFormatada());

    }
}
