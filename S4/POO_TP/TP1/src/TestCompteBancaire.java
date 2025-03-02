import java.util.Scanner;

public class TestCompteBancaire {
    TestCompteBancaire(){
        Scanner sc = new Scanner(System.in);
        String nom;
        double solde;
        System.out.print("Entrer votre votre nom: ");
        nom = sc.nextLine();
        System.out.print("Entrer votre solde de depart: ");
        solde = sc.nextDouble();

        double montant;
        CompteBancaire compte = new CompteBancaire(nom, solde);

        compte.AfficherSolde();

        System.out.print("Entrer le montant a deposer: ");
        montant = sc.nextDouble();
        compte.deposer(montant);

        compte.AfficherSolde();

        System.out.print("Entrer le montant a retirer: ");
        montant = sc.nextDouble();
        compte.retirer(montant);

        compte.AfficherSolde();
    }
}
