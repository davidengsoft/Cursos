package br.com.david.cm.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CampoTeste {

    private Campo campo;

    void iniciarCampo() {
        campo = new Campo(3,3 );
    }

    @Test
    void testeVizinhoRealDistancia1() {
        iniciarCampo();

        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertTrue(resultado);
    }




}
