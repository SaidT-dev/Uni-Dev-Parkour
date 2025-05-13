public class TestForme {
    public static void main(String[] args) {
        // Création d'un rectangle de largeur 5 et longueur 3
        Rectangle rectangle = new Rectangle(5, 3);

        // Création d'un cercle de rayon 2
        Cercle cercle = new Cercle(2);

        // Affichage des résultats pour le rectangle
        System.out.println("Rectangle :");
        System.out.println("Surface : " + rectangle.surface());
        System.out.println("Périmètre : " + rectangle.perimetre());

        // Affichage des résultats pour le cercle
        System.out.println("\nCercle :");
        System.out.println("Surface : " + cercle.surface());
        System.out.println("Périmètre : " + cercle.perimetre());
    }
}