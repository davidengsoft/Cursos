package exercicios.src.EstruturaDeControle;

public class BreakRotulado {

    public static void main(String[] args) {

        externo: for(int i = 1; i <= 3; i++) {

            interno: for (int j = 1; j <= 3; j++) {
                if (i == 2) {
                    break externo;
                }
                System.out.printf("i = %d, j = %d \n", i, j);
            }
            System.out.println("i = " + i);

        }
    }
}
