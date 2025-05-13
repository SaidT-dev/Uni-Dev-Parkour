public class Oiseau implements Animal {
    String nom;
    String habitat;

    Oiseau(String nom, String habitat) {
        this.nom = nom;
        this.habitat = habitat;
    }

    @Override
    public void dormir() {
        System.out.println("Le " + nom + " dort dans le " + habitat);
    }

    @Override
    public void manger() {
        System.out.println("Le " + nom + " mange");
    }
}
