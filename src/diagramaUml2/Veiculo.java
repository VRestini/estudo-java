package diagramaUml2;

public class Veiculo {
    private String placa;
    private int ano;

    Veiculo(){}
    Veiculo(String placa, int ano){
        this.placa = placa;
        this.ano =ano;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setAno(String ano) {
        ;
    }
    public void exibirDados(){
        System.out.printf("Ano: "+ ano + ", placa: " + placa);
    }

}
