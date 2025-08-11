package exercicios.src.poo.heranca.desafio;

public interface Luxo {

    void ligarAr();
    void desligarAr();
    default int nivelDoAr() {
        return 1;
    }
}
