package exercicios.src.classe;

public class Usuario {

    String nome;
    String email;

    public boolean equals(Object objeto) {

        if(objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto; //Nesta linha é feito um casting para mudar o tipo do objeto
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }
}
