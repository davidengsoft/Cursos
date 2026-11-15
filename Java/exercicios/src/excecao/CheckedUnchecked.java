package exercicios.src.excecao;

public class CheckedUnchecked {

    public static void main(String[] args) {

        try {
            geraErro1();

        } catch (RuntimeException e) {System.out.println(e.getMessage());}

        try {
            geraErro2();

        } catch (Exception e) {System.out.println(e.getMessage());}

        System.out.println("Fim do programa");
    }

    static void geraErro1() { throw new RuntimeException("Ocorreu um erro #01"); }

    static void geraErro2() throws Exception { throw new Exception("Ocorreu um erro #02"); }
}
