package exercicios.src.poo.abstrato;

public class Carrocho extends Mamifero{

    @Override
    public String andar() {
        return "Usanso as patas";
    }

    @Override
    public String seAlimentar() {
        return "Tomando leite";
    }
}
