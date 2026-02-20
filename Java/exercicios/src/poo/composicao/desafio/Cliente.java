package exercicios.src.poo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    List<Compra> compras = new ArrayList<>();
    String nome;

    Cliente(String nome){
        this.nome = nome;
    }

    void adicionarCompra(Compra compra) {
        compras.add(compra);
    }

    double valorTotal() {
        double valorTotal = 0;

        for (Compra compra : compras) {
           valorTotal += compra.valorDosItens();
        }

        return valorTotal;
   }

}
