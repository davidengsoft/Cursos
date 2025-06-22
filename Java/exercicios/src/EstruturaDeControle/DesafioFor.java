package exercicios.src.EstruturaDeControle;

public class DesafioFor {

    public static void main(String[] args) {

        //Não pode usar valor numérico para controlar o laço

        for(String valor = "#"; !valor.equals("######") ; valor += "#") {
            System.out.println(valor);
        }
    }
}
