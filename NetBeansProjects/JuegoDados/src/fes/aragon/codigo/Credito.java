package fes.aragon.codigo;

public class Credito {

    private int credito = 20;
    private Credito decremento;
    private Credito incremento;

    public Credito() {
    }

    public void decremento() {
        credito--;
    }

    public void incremento() {
        credito++;
    }

    public int getCredito() {
        return credito;
    }

    @Override
    public String toString() {
        return "Credito{" + "credito=" + credito + '}';
    }
}
