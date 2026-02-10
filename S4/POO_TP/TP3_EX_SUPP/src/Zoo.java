
public class Zoo {
    public static void main(String[] args) {
        // Création du tableau d'animaux
        Animal[] animaux = new Animal[5];

        // Création de 2 mammifères
        animaux[0] = new Mammifere("lion", 5);
        animaux[1] = new Mammifere("éléphant", 10);

        // Création de 3 oiseaux
        animaux[2] = new Oiseau("aigle", "nid");
        animaux[3] = new Oiseau("perroquet", "cage");
        animaux[4] = new Oiseau("pingouin", "banquise");

        // Appel des méthodes dormir et manger pour chaque animal
        for (Animal animal : animaux) {
            animal.dormir();
            animal.manger();
            System.out.println(); // Ligne vide pour plus de lisibilité
        }
    }
}