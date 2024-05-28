package diagramaUml4;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camisa", 50, Categoria.VESTUARIO);
        Produto produto2 = new Produto("Celular", 800, Categoria.VESTUARIO);
        Produto produto3 = new Produto("Livro", 30, Categoria.LIVRO);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);
        DescontoStrategy descontoFixo = new DescontoFixo(0);
        DescontoStrategy descontoPorCategoria = new DescontoPorCategoria(Categoria.ELETRONICO, 10);
        carrinho.adicionarDesconto(descontoFixo);
        carrinho.adicionarDesconto(descontoPorCategoria);
        carrinho.aplicarDescontos();
        float total = carrinho.getTotal();
        System.out.println("Total da compra: " + total);
    }

}
