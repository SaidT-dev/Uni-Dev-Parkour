
import service.GestionClient;
import service.GestionCommande;
import service.GestionProduit;
import model.Client;
import model.Commande;
import model.Produit;
import java.util.Date;
public class TestApplication {
    public static void main(String[] args) {
        System.out.println("Debut de test (Partie 4)");

        GestionClient gestionClient = new GestionClient();
        GestionProduit gestionProduit = new GestionProduit();
        GestionCommande gestionCommande = new GestionCommande();

        System.out.println("Creation du client ...");
        Client client = gestionClient.creeNouveauClient("Dupont", "Paris");

        System.out.println("Creation des produits ...");
        Produit produit1 = gestionProduit.creerNouveauProduit("Ordinateur", 1000.0);
        Produit produit2 = gestionProduit.creerNouveauProduit("Souris", 45.0);

        if (client == null || produit1 == null || produit2 == null) {
            System.err.println("Erreur lors de la création des entités de base. Test arrêté.");
            return;
        }

        System.out.println("Client créé avec ID: " + client.getIdClient());
        System.out.println("Produit 1 créé avec ID: " + produit1.getIdProduit());

        System.out.println("Creation de la commande ...");
        Commande commande = gestionCommande.passerComde(new Date(), "En cours", client.getIdClient());
        if (commande == null) {
            System.err.println("Erreur lors de la création de la commande. Test arrêté.");
            return;
        }
        System.out.println("Commande créée avec ID: " + commande.getIdCommande());

        System.out.println("\nAjout des produits à la commande ...");
        boolean ajout1 = gestionCommande.ajouterProduitCommande(commande.getIdCommande(), produit1.getIdProduit(), 2);
        boolean ajout2 = gestionCommande.ajouterProduitCommande(commande.getIdCommande(), produit2.getIdProduit(), 1);

        if (ajout1 && ajout2) {
            System.out.println("Produits ajoutés avec succès à la commande.");
        } else {
            System.err.println("Erreur lors de l'ajout des produits.");
        }

        System.out.println("\n--- Étape 5: Vérification ---");
        int nbCommandes = gestionCommande.obtenirNombreCommande(client.getIdClient());
        System.out.println("Le client " + client.getNomClient() + " (ID: " + client.getIdClient() + ") a maintenant " + nbCommandes + " commande(s).");
    }
}
