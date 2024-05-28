package diagramaUml1;

public class Circulo extends Figura{
    private double raio;


    public Circulo(double raio, String cor){

        super(cor);
        this.raio = raio;

    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public double area() {
        return raio * 3.14;
    }


    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio + "cor= " + getCor() +
                '}';
    }
}
