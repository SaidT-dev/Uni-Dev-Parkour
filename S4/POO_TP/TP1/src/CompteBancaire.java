public class CompteBancaire {
    String nom;
    double solde;

    CompteBancaire(String nom, double solde){
        this.nom = nom;
        this.solde = solde;
    }

    void deposer(double montant){
        this.solde += montant;
        System.out.println("Vous avez deposer " + montant + "da");
    }

    void retirer(double montant){
        this.solde -= montant;
        System.out.println("Vous avez retirer " + montant + "da");
    }

    void AfficherSolde(){
        System.out.println("Votre solde est: " + this.solde + "da.");
    }

}
