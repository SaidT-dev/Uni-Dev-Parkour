public class Mammifere implements Animal {
    String nom;
    int age;

    Mammifere(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    @Override
    public void dormir() {
        System.out.println("Le " + nom + " dort");
    }

    @Override
    public void manger() {
        System.out.println("Le " + nom + " mange");
    }
}
