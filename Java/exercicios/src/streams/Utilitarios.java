package fundamentos;

import java.util.function.UnaryOperator;

public class Utilitarios {

    public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    public final static UnaryOperator<String> primeriaLetra = n -> n.charAt(0) + "";
    public final static UnaryOperator<String> grito = n -> n + "!!!";
}
