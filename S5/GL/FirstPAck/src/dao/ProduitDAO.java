package dao;

import model.Produit;

import java.util.ArrayList;
import java.util.List;

public class ProduitDAO {
    private static List<Produit> listeProduits = new ArrayList<>();

    // CREATE
    public void ajouter(Produit produit) {
        this.listeProduits.add(produit);
    }

    // READ tous
    public List<Produit> listerTous() {
        return listeProduits;
    }

    // READ par id
    public Produit rechercherId(int idProduit) {
        for (Produit produit : listeProduits) {
            if (produit.getIdProduit() == idProduit){
                return produit;
            }
        }
        return null;
    }

    // UPDATE
    public boolean modifier(Produit produit) {
        for(int i = 0; i < listeProduits.size(); i++){
            if (listeProduits.get(i).getIdProduit() == produit.getIdProduit()){
                listeProduits.set(i, produit);
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean supprimer(int idProduit) {
        Produit produit = rechercherId(idProduit);
        if(produit != null){
            return listeProduits.remove(produit);
        }
        return false;
    }
}
