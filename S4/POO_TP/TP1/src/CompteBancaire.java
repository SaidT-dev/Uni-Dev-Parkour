public class CompteBancaire {
    String nom;
    double solde;

    CompteBancaire(String nom, double solde){
        this.nom = nom;
        this.solde = solde;
    }

    void deposer(double montant){
        solde += montant;
        System.out.println("Vous avez deposer $" + montant);
    }

    void retirer(double montant){
        if(montant > solde){
            System.out.println("Le solde est insufisant");
        } else {
            solde -= montant;
            System.out.println("Vous avez retirer $" + montant);
        }
    }

    void AfficherSolde(){

        System.out.println("Votre solde est: $" + solde);
    }

}
