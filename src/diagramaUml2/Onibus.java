package diagramaUml2;

public class Onibus extends Veiculo{
    private int assentos;
    Onibus(String placa, int ano, int assentos){
        // super(placa, ano); forma correta
        this.setPlaca(placa);
        this.setAno(ano);
        this.assentos = assentos;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf(", quantidade de assentos: " + assentos + "\n");

    }
}
