package diagramaUml4;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;
    private List<DescontoStrategy> descontos;
    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
        this.descontos = new ArrayList<>();
    }
    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }
    public void removerProduto(Produto produto) {
        if (produtos.contains(produto)){
            produtos.remove(produto);
        }
        else{
            System.out.println("Produto não existe no carrinho de compras");
        }
    }
    public void aplicarDescontos() {
        for (Produto produto : produtos) {
            for (DescontoStrategy desconto : descontos) {
                produto.setPreco(produto.getPreco() - desconto.calcularDesconto(produto));
            }
        }
    }
    public float getTotal() {
        float total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
    public void adicionarDesconto(DescontoStrategy desconto) {
        this.descontos.add(desconto);
    }
    public void removerDesconto(DescontoStrategy desconto) {
        this.descontos.remove(desconto);
    }
}
