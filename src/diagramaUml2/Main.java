package diagramaUml2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> a1 = new ArrayList<>();
        Onibus b1 = new Onibus("AAA", 2002, 4);
        Onibus b2 = new Onibus("BBB", 2001, 14);
        Caminhão c1 = new Caminhão("CCC", 1994, 2);
        Caminhão c2 = new Caminhão("DDD", 1995, 2);
        a1.add(b1);
        a1.add(b2);
        a1.add(c1);
        a1.add(c2);
        for (Veiculo item : a1) {
            item.exibirDados();
        }
    }
}
