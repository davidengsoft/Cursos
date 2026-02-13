package exercicios.src.classe;

public class Data {

    int dia;
    int ano;
    int mes;

    Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String imprimirInformacao() {
        return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
    }
}
