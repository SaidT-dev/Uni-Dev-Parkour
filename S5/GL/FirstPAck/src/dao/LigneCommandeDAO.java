package dao;

import model.LigneCommande;

import java.util.ArrayList;
import java.util.List;

public class LigneCommandeDAO {

    private static List<LigneCommande> listeLignes = new ArrayList<>();

//    CREATE
    public void ajouter(LigneCommande ligne) {
        listeLignes.add(ligne);
    }

//    READ par id de commande
    public List<LigneCommande> rechercherParCommandeId(int idCommande) {
        List<LigneCommande> lignesDeLaCommande = new ArrayList<>();
        for (LigneCommande ligne : listeLignes) {
            if (ligne.getIdCommande() == idCommande) {
                lignesDeLaCommande.add(ligne);
            }
        }
        return lignesDeLaCommande;
    }

//    READ par id de produit
    public List<LigneCommande> rechercherParProduitId(int idProduit) {
        List<LigneCommande> lignesDuProduit = new ArrayList<>();
        for (LigneCommande ligne : listeLignes) {
            if (ligne.getIdProduit() == idProduit) {
                lignesDuProduit.add(ligne);
            }
        }
        return lignesDuProduit;
    }
}
