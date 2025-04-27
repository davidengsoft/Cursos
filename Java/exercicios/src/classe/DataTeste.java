package exercicios.src.classe;

public class DataTeste {

    public static void main(String[] args) {

        Data data01 = new Data(4, 10, 2005);
        //data01.dia = 4;
        //data01.mes = 10;
        //data01.ano = 2005;

        var data02 = new Data();
        data02.dia = 22;
        data02.mes = 4;
        data02.ano = 2025;

        Data data03 = new Data();

        System.out.println(data01.dataFormatada());
        System.out.println(data02.dataFormatada());
        System.out.println(data03.dataFormatada());
    }
}