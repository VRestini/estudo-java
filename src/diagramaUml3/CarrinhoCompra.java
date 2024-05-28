package diagramaUml3;

import diagramaUml2.Veiculo;

import java.util.ArrayList;

public class CarrinhoCompra {
    private double valorTotal;
    ArrayList<Produto> carro = new ArrayList<>();


    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void adicionarProduto(Produto p){
        carro.add(p);
        this.valorTotal += p.getPreco();
    }
    public void exibirProdutos(){
        for(Produto p: carro){
            System.out.println(p.toString());
        }

    }
}
