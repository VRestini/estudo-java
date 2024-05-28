package diagramaUml3;

import java.util.ArrayList;

public class Pedido {
    private String cliente;
    private String endereco;
    private double valorTotal;
    ArrayList<CarrinhoCompra> pedido = new ArrayList<>();
    public void adicionarCarrinho(CarrinhoCompra carro){
        pedido.add(carro);
    }
    public void exibirProdutos(){
        for(CarrinhoCompra p: pedido){
            System.out.println(p.toString());
        }

    }
}
