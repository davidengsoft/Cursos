package br.com.david.cm;

import br.com.david.cm.excecao.ExplosaoException;
import br.com.david.cm.modelo.Tabuleiro;


public class Aplicacao {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);

        try {
            tabuleiro.abrir(3, 3);
            tabuleiro.alterarMarcacao(4, 5);
        } catch (ExplosaoException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(tabuleiro);
    }
}
