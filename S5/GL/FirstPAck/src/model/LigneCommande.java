package model;

public class LigneCommande {
    private int idCommande;
    private int idProduit;

    private int quantite;

    public LigneCommande(int idCommande, int idClient, int quantite) {
        this.idCommande = idCommande;
        this.idProduit = idClient;
        this.quantite = quantite;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
