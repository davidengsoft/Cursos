package br.com.david.cm.modelo;


public class Campo {

    private final int linha;
    private final int coluna;

    private boolean aberto;
    private boolean minado;
    private boolean marcado;

    Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }




}
