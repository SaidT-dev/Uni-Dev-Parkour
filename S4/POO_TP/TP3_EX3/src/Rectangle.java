public class Rectangle implements Forme {
     private double largeur;
     private double longueur;

     Rectangle(double largeur, double longueur) {
         this.largeur = largeur;
         this.longueur = longueur;
     }

    @Override
    public double perimetre() {
        return 2 * (largeur + longueur);
    }

    @Override
    public double surface() {
        return largeur * longueur;
    }


}
