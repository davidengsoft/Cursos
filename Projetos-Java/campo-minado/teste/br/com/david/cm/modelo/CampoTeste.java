package br.com.david.cm.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CampoTeste {

    private Campo campo;

    void iniciarCampo() {
        campo = new Campo(3,3 );
    }

    @Test
    void testeVizinhoEsquerdaDistancia01() {
        iniciarCampo();

        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDireitaDistancia01() {
        iniciarCampo();

        Campo vizinho = new Campo(3, 4);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    void testeVizinhoEmcimaDistancia01() {
        iniciarCampo();

        Campo vizinho = new Campo(2, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    void testeVizinhoEmbaixoDistancia01() {
        iniciarCampo();

        Campo vizinho = new Campo(4, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia02() {
        iniciarCampo();

        Campo vizinho = new Campo(2, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    void testeNaoVizinhoDistancia02() {
        iniciarCampo();

        Campo vizinho = new Campo(1, 1);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertFalse(resultado);
    }

}
