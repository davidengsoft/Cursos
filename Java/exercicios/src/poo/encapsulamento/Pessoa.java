package exercicios.src.poo.encapsulamento;

public class Pessoa {

    private int idade = 0;
    private String nome;

    public Pessoa(int idade, String nome){
        setIdade(idade);
        setNome(nome);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0) {
            this.idade = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Meu nome é " + this.nome + " e tenho " + this.idade + " anos";
    }
}
