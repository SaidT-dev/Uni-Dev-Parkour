public class Calcul {
    private int a;
    private int b;

    public Calcul(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static int produit(int a, int b) {
        return a * b;
    }

    public int somme() {
        return this.a + this.b;
    }
}