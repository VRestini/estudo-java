package diagramaUml1;

public class Teste {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10, 10, "Laranja");
        System.out.println(quadrado);
        Triangulo triangulo = new Triangulo(8, 10, "Amarelo");
        System.out.println(triangulo);
        triangulo.setCor("Roxo");
        System.out.println(triangulo);
    }
}
