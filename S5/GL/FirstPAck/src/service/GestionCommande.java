package service;

import dao.ClientDAO;
import dao.CommandeDAO;
import dao.LigneCommandeDAO;
import dao.ProduitDAO;
import model.Commande;
import model.LigneCommande;

import java.util.Date;
import java.util.List;

public class GestionCommande {
    private CommandeDAO commandeDAO;
    private ClientDAO clientDAO;
    private LigneCommandeDAO ligneCommandeDAO;
    private ProduitDAO produitDAO;

    public GestionCommande() {
        this.commandeDAO = new CommandeDAO();
        this.clientDAO = new ClientDAO();
        this.ligneCommandeDAO = new LigneCommandeDAO();
        this.produitDAO = new ProduitDAO();
    }

    public Commande passerComde(Date date, String statut, int idClient){
        if(clientDAO.rechercherId(idClient) == null){
            System.err.println("Erreur Service: Impossible de cree une commande pour un client inexistant " +
                    "(ID: " + idClient + ")");
            return null;
        }

        Commande nouvelleCommande = new Commande(statut, date, idClient);

        commandeDAO.ajouter(nouvelleCommande);

        return nouvelleCommande;
    }

    public boolean ajouterProduitCommande(int idCommande, int idProduit, int quantite){
        if(commandeDAO.rechercheIdCommande(idCommande) == null){
            System.err.println("Erreur Service: Commande " + idCommande + " inexistante.");
            return false;
        }

        if (produitDAO.rechercherId(idProduit) == null) {
            System.err.println("Erreur Service: Produit " + idProduit + " inexistant.");
            return false;
        }

        if (quantite <= 0) {
            System.err.println("Erreur Service: La quantité doit être positive.");
            return false;
        }

        LigneCommande nouvelleLigne = new LigneCommande(idCommande, idProduit, quantite);
        ligneCommandeDAO.ajouter(nouvelleLigne);
        return true;
    }

    public int obtenirNombreCommande(int idClient){
        List<Commande> commande = commandeDAO.rechercherClientId(idClient);
        return commande.size();
    }

    public List<Commande> listerCommandesClient(int idClient){
        return  commandeDAO.rechercherClientId(idClient);
    }
}
