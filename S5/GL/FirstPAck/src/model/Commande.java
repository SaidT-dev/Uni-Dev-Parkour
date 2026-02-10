package model;

import java.util.Date;

public class Commande {
    private int idCommande;
    private Date dateCommande;
    private String statutCommande;

    private static int nbrCommande = 0;

    private int idClient;

    public Commande(String statutCommande, Date dateCommande, int idClient) {
        this.idCommande = ++nbrCommande;
        this.statutCommande = statutCommande;
        this.dateCommande = dateCommande;
        this.idClient = idClient;
    }

    public Commande(int idComamnde, Date dateCommande, String statutCommande, int idClient) {
        this.idCommande = idComamnde;
        this.dateCommande = dateCommande;
        this.statutCommande = statutCommande;
        this.idClient = idClient;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getStatutCommande() {
        return statutCommande;
    }

    public void setStatutCommande(String statutCommande) {
        this.statutCommande = statutCommande;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
}
