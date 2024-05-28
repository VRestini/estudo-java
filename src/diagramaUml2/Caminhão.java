package diagramaUml2;

public class Caminhão extends Veiculo{
    private int eixos;
    Caminhão(String placa, int ano, int eixos){
        // super(placa, ano); forma correta
        this.setAno(ano);
        this.setPlaca(placa);

        this.eixos = eixos;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("  eixos: " + eixos + "\n");

    }
}
