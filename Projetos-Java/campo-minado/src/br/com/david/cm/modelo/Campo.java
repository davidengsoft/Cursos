package br.com.david.cm.modelo;


import br.com.david.cm.excecao.ExplosaoException;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private final int linha;
    private final int coluna;

    private boolean aberto;
    private boolean minado;
    private boolean marcado;

    private List<Campo> vizinhos = new ArrayList<Campo>();


    Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    boolean adicionarVizinho(Campo vizinho) {
        boolean linhaDiferente = this.linha != vizinho.linha;
        boolean colunaDiferente = this.coluna != vizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;

        int deltaLinha = Math.abs(linha - vizinho.linha);
        int deltaColuna = Math.abs(coluna - vizinho.coluna);
        int deltaGeral = deltaColuna + deltaLinha;

        if (deltaGeral == 1 && !diagonal) {
            vizinhos.add(vizinho);
            return true;
        }

        if (deltaGeral == 2 && diagonal) {
            vizinhos.add(vizinho);
            return true;
        }

        return false;
    }

    void alternarMarcacao() {
        if (!aberto) {
            marcado = !marcado;
        }
    }

    boolean abrir() {

        if (!aberto && !marcado) {
            aberto = true;

            if (minado) {
                throw new ExplosaoException("O campo estava minado");
            }

            if (vizinhancaSegura()) {
                vizinhos.forEach(campo -> campo.abrir());
            }
        }

        return false;
    }


    boolean vizinhancaSegura() {
        return vizinhos.stream().noneMatch(v -> v.minado);
    }


    public boolean isMarcado() {
        return marcado;
    }


}
