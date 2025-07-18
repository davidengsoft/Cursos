package exercicios.src.classe;

public class ValorVsReferencia {

    public static void main(String[] args) {

        double a = 2;
        double b = a; // atribuição por valor (Tipo prmitivo)

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 2025);
        Data d2 = d1; // atribuição por referencia (Objeto)

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());
    }

    static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(double a) {
        a++;
    }
}
