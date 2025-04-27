package exercicios.src.classe;

public class ValorVsReferencia {

    public static void main(String[] args) {

        double a = 2;
        double b = a;  // atribuição por valor

        a++;
        b--;

        System.out.println(a + " / " + b);

        Data d1 = new Data(26, 4, 2025);
        Data d2 = d1; // atribuição por referência

        System.out.printf("%s\n", d1.dataFormatada());
        System.out.printf("%s\n", d2.dataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

    }

    static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }


}
