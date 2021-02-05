package fes.aragon.inicio;

public class inicio {

    public static void main(String[] args) {
        int[] ar = new int[10];
        int indice = 0;
        int x = 1;
        do {
            ar[indice] = (x * x) - (3 * x) + 1;
            indice++;
            x++;
        } while (indice < ar.length);
        System.out.println("x   f(X)");
        for (int i = 0, xx = 1; i < ar.length; i++) {
            System.out.println(xx + "    " + ar[i]);
        }
    }
}
