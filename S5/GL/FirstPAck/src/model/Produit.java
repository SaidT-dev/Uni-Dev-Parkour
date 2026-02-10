package model;

public class Produit {
    private int idProduit;
    private String nomProduit;
    private double prixProduit;
    private static int nbrProduit = 0;


    public Produit(String nomProduit, double prixProduit) {
        this.idProduit = ++nbrProduit;
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
    }

    public Produit(int idProduit, String nomProduit, double prixProduit) {
        this.idProduit = idProduit;
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(double prixProduit) {
        this.prixProduit = prixProduit;
    }
}
