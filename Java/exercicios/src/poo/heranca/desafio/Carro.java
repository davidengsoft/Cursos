package exercicios.src.poo.heranca.desafio;

public class Carro {

    private final String MODELO;
    private int velocidadeAtual = 0;
    private final int VELOCIDADE_MAXIMA;
    private final int FATOR_ACELERACAO;

    public Carro(String modelo, int  fatorAceleracao, int velocidadeMaxima) {
        this.MODELO = modelo;
        this.FATOR_ACELERACAO = fatorAceleracao;
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){

        if (velocidadeAtual + FATOR_ACELERACAO > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += FATOR_ACELERACAO;
        }

    }

    public void frear() {

        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }

    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        if (velocidadeAtual >= 0) {
            this.velocidadeAtual = velocidadeAtual;
        }

    }

    public int getVELOCIDADE_MAXIMA() {
        return VELOCIDADE_MAXIMA;
    }

    public int getFATOR_ACELERACAO() {
        return FATOR_ACELERACAO;
    }

    @Override
    public String toString() {
        return String.format("Velocidade máxima: %dkm/h\nVelocidade Atual: %dkm/h", this.VELOCIDADE_MAXIMA, this.velocidadeAtual);
    }
}
