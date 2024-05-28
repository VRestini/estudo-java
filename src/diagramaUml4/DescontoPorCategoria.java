package diagramaUml4;

public class DescontoPorCategoria implements DescontoStrategy{
    private Categoria categoria;
    private float porcentagem;

    public DescontoPorCategoria(Categoria categoria, float porcentagem) {
        this.categoria = categoria;
        this.porcentagem = porcentagem;
    }

    @Override
    public float calcularDesconto(Produto produto) {
        if (produto.getCategoria() == this.categoria) {
            return produto.getPreco() * this.porcentagem / 100;
        } else {
            return 0;
        }
    }
}
