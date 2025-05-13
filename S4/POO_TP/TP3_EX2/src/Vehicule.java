 abstract class Vehicule {
    private static int numImmatriculation = 0;
    private int annee;
    private double vitesseMax;
    private double prix;

     Vehicule(int annee, double vitesseMax, double prix){
        this.annee = annee;
        this.vitesseMax = vitesseMax;
        this.prix = prix;
        numImmatriculation++;
    }

    int getAnnee(){
        return this.annee;
    }

    void setAnnee(int annee){
        this.annee = annee;
    }

    double getVitesseMax(){
        return this.vitesseMax;
    }

    void setVitesseMax(int vitesseMax){
        this.vitesseMax = vitesseMax;
    }

    double getPrix(){
        return this.prix;
    }

    void setPrix(double prix){
        this.prix = prix;
    }

    abstract void demarer();
    abstract void accelerer();
    abstract void chargeCargaison(String nature);

    String VitesseMax(){
        return this.vitesseMax + " km/h";
    }

    String caracteristiqueVehicule(){
        return "Immatriculation: " + numImmatriculation +
                "\nAnnee du model: " + this.annee +
                "\nprix: " + this.prix;
    }
}
