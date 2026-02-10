package dao;

import model.Commande;

import java.util.ArrayList;
import java.util.List;

public class CommandeDAO {
    private static List<Commande> listeCommandes = new ArrayList<>();

//    CREATE
    public void ajouter(Commande commande) {
        this.listeCommandes.add(commande);
    }

//    READ tous
    public List<Commande> listerTOus() {
        return listeCommandes;
    }

//    READ par id de commande
    public Commande rechercheIdCommande(int idCommande) {
        for (Commande commande : listeCommandes) {
            if (commande.getIdCommande() == idCommande){
                return commande;
            }
        }
        return null;
    }

//    READ par id de client
    public List<Commande> rechercherClientId(int idClient){
        List<Commande> listeCommandeClient = new ArrayList<>();
        for (Commande commande : listeCommandes) {
            if(commande.getIdClient() == idClient){
                listeCommandeClient.add(commande);
            }
        }
        return listeCommandeClient;
    }

//    UPDATE
    public boolean modifier(Commande commande) {
        for(int i = 0; i < listeCommandes.size(); i++){
            if (listeCommandes.get(i).getIdCommande() == commande.getIdCommande()){
                listeCommandes.set(i, commande);
                return true;
            }
        }
        return false;
    }

//    DELETE
    public boolean supprimer(int idCommande) {
        Commande commande = rechercheIdCommande(idCommande);
        if(commande != null){
            return listeCommandes.remove(commande);
        }
        return false;
    }
}
