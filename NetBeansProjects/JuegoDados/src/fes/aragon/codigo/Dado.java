package fes.aragon.codigo;

import java.util.Random;

public class Dado {

    private int cara;

    public Dado() {

    }

    public void Lanzar() {
        Random rd = new Random();
        this.cara = rd.nextInt(6) + 1;
    }

    public int getCara() {
        return cara;
    }

}
