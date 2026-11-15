package exercicios.src.poo.abstrato;

public class Cachorro extends Mamifero {

    public String seAlimentar() {
        return "Depende da idade. \nFilhote: Bebe leite | Adulto: Come ração";
    }

    public String mover() {
        return "Usando as 4 patas";
    }
}
