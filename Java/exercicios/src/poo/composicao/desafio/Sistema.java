package exercicios.src.poo.composicao.desafio;

public class Sistema {

    public static void main(String[] args) {

        Cliente cliente01 = new Cliente("David");

        Compra compra1Cliente01 = new Compra();
        compra1Cliente01.adicionarItem("Mouse", 60.89, 10);
        compra1Cliente01.adicionarItem("Teclado", 58, 20);
        compra1Cliente01.adicionarItem("Monitor 24'", 899.99, 3);


        Compra compra2Cliente01 = new Compra();
        compra2Cliente01.adicionarItem("Fone JBL", 285, 5);
        compra2Cliente01.adicionarItem("Soundbar", 250.90, 3);
        compra2Cliente01.adicionarItem("Pasta térmica", 25, 18);

        cliente01.adicionarCompra(compra1Cliente01);
        cliente01.adicionarCompra(compra2Cliente01);

        System.out.printf("%.2f", cliente01.getValorTotal());
    }
}
