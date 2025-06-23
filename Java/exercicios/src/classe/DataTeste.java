package exercicios.src.classe;

public class DataTeste {

    public static void main(String[] args) {

        Data data1 = new Data();
        data1.ano = 2005;
        data1.dia = 4;
        data1.mes = 10;

        System.out.printf("%d/%d/%d", data1.dia, data1.mes, data1.ano);

        Data data2 = new Data();
        data2.ano = 2025;
        data2.dia = 23;
        data2.mes = 06;

        System.out.printf("\n%d/%d/%d", data2.dia, data2.mes, data2.ano);

    }
}
