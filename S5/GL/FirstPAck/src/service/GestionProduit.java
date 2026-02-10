package service;

import dao.ProduitDAO;
import model.Produit;

import java.util.List;

public class GestionProduit {
    private ProduitDAO produitDAO;

    public GestionProduit() {
        this.produitDAO = new ProduitDAO();
    }

    public Produit creerNouveauProduit(String nom, double prix) {
        if(prix < 0.0) {
            System.err.println("Erreur Service: Le prix d'un produit ne peut pas être négatif.");
            return null;
        }

        if(nom == null || nom.trim().isEmpty()) {
            System.err.println("Erreur Service: Le nom du produit est obligatoire.");
            return null;
        }

        Produit nouveauProduit = new Produit(nom, prix);
        produitDAO.ajouter(nouveauProduit);
        return nouveauProduit;
    }

    public List<Produit> oubtenirTousProduit(){
        return produitDAO.listerTous();
    }
}
