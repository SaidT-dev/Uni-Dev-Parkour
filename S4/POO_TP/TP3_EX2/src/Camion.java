public class Camion extends Vehicule{
    private double cargaison;

    Camion(int annee, double vitesseMax, double prix, double cargaison){
        super(annee, vitesseMax, prix);
        this.cargaison = cargaison;
    }

    @Override
    public void demarer(){
        System.out.println("Demarage avec une cargaison de " + cargaison + " kg");
    }

    @Override
    public void accelerer(){
        System.out.println("Acceleration pour atteindre la vitesse max (" + VitesseMax() + ")");
    }

    @Override
    void chargeCargaison(String nature){
        System.out.println("Une cargaison de " + nature);
    }
}
