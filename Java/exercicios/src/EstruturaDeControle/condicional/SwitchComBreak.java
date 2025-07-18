package exercicios.src.EstruturaDeControle.condicional;

import javax.swing.*;

public class SwitchComBreak {

    public static void main(String[] args) {

        int nota = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota: "));
        String conceito;

        switch(nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "C";
                break;
            case 4: case 3:
                conceito = "D";
                break;
            case 2: case 1: case 0:
                conceito = "E";
                break;
            default:
                conceito = "Não informado!";
        }
        System.out.printf("Conceito é: %s", conceito);
    }
}
