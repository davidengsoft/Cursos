package br.com.david.cm;

import br.com.david.cm.modelo.Tabuleiro;
import br.com.david.cm.visao.TabuleiroConsole;


public class Aplicacao {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroConsole(tabuleiro);



    }
}
