package diagramaUml4;

import java.util.PrimitiveIterator;

public abstract class Desconto implements DescontoStrategy{
    private float porcenagem;

    public float getPorcenagem() {
        return porcenagem;
    }

    public void setPorcenagem(float porcenagem) {
        this.porcenagem = porcenagem;
    }

    public abstract boolean aplicaSe(Produto produto);

}
