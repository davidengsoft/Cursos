package exercicios.src.classe;

public class Data {

    int dia;
    int ano;
    int mes;

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String imprimirInformacao() {
        return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
    }
}
