package diagramaUml4;

public class DescontoFixo implements DescontoStrategy{
    private float valor;

    public DescontoFixo(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public float calcularDesconto(Produto produto) {
        return this.valor;
    }
}
