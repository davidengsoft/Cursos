package exercicios.src.poo.heranca;

public class Jogador {

    int x;
    int y;

    boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                y++;
            break;
            case LESTE:
                x++;
            break;
            case SUL:
                y--;
            break;
            case OESTE:
                x--;
            break;
            default:
                System.out.println("[ERRO] Valor informado não é válido!");
                return false;
        }
        if(direcao == Direcao.NORTE) {
            y++;
        }

        return true;
    }
}
