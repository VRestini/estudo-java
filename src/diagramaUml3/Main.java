package diagramaUml3;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompra c1 = new CarrinhoCompra();
        c1.adicionarProduto(new Produto("Celular", ".", 200, 1));
        c1.adicionarProduto(new Produto("Celular", ".", 200, 1));
        c1.adicionarProduto(new Produto("Celular", ".", 200, 1));
        c1.exibirProdutos();
        System.out.println(c1.getValorTotal());
        Pedido p1 = new Pedido();
        p1.adicionarCarrinho(c1);
        p1.exibirProdutos();

    }
}
