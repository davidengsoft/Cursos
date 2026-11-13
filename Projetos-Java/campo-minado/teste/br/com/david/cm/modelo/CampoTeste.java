package br.com.david.cm.modelo;

import br.com.david.cm.excecao.ExplosaoException;
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

    @Test
    void testeAlternarMarcacao() {
        iniciarCampo();

        assertFalse(campo.isMarcado());
    }

    @Test
    void testeAbrirCampoNaoMinadoNaoMarcado() {
        iniciarCampo();

        assertTrue(campo.abrir());
    }

    @Test
    void testeAbrirCampoNaoMinadoMarcado() {
        iniciarCampo();
        campo.alternarMarcacao();

        assertFalse(campo.abrir());
    }

    @Test
    void testeAbrirCampMinadoMarcado() {
        iniciarCampo();
        campo.alternarMarcacao();
        campo.minar();

        assertFalse(campo.abrir());
    }

    @Test
    void testeAbrirCampMinadoNaoMarcado() {
        iniciarCampo();
        campo.minar();

        assertThrows(ExplosaoException.class, () -> campo.abrir());
    }

    @Test
    void testeAbrirComVizinhos() {
        iniciarCampo();

        Campo campo11 = new Campo(1, 1);
        Campo campo22 = new Campo(2, 2);

        campo22.adicionarVizinho(campo11);

        campo.adicionarVizinho(campo22);
        campo.abrir();

        assertTrue(campo22.isAberto() && campo11.isAberto());
    }
}
