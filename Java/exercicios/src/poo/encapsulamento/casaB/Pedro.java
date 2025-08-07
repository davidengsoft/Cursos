package exercicios.src.poo.encapsulamento.casaB;

import exercicios.src.poo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {
        //System.out.println(mae.segredo);
        //System.out.println(fazDentroDeCasa); //Não recebe por herança, pois não está no mesmo pacote da class Ana
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
    }

}
