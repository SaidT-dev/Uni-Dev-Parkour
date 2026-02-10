public class Voiture extends Vehicule{
    private int nbPlace;

    Voiture(int annee, double vitesseMax, double prix, int nbPlace){
        super(annee, vitesseMax, prix);
        this.nbPlace = nbPlace;
    }

    @Override
    public void demarer(){
        System.out.println("Demarage de 1.9 ");
    }

    @Override
    public void accelerer(){
        System.out.println("Sla3qel a mon frr");
    }

    @Override
    String caracteristiqueVehicule(){
        return super.caracteristiqueVehicule() +
                "\nNombre de place: " + nbPlace;
    }

    @Override
    public void chargeCargaison(String cargaison) {}
}

