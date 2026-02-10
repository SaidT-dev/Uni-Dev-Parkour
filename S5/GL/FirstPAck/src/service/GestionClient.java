package service;

import dao.ClientDAO;
import dao.CommandeDAO;
import model.Client;
import model.Commande;

import java.util.ArrayList;
import java.util.List;

public class GestionClient {
    private ClientDAO clientDAO;
    private CommandeDAO commandeDAO;

    public GestionClient() {
        this.clientDAO = new ClientDAO();
        this.commandeDAO = new CommandeDAO();
    }

    public Client creeNouveauClient(String nom, String adresse){
        if(nom == null || nom.trim().isEmpty()){
            System.err.println("Erreur: Le nom du client ne peut pas etre vide");
            return null;
        }

        if(adresse == null || adresse.trim().isEmpty()){
            System.err.println("Erreur: L'adresse du client ne peut pas etre vide");
            return null;
        }

        Client nouveauClient = new Client(nom, adresse);

        clientDAO.ajouter(nouveauClient);
        return   nouveauClient;
    }

    public List<Client> obtenirTousLesClients(){
        return clientDAO.listerTous();
    }

    public boolean supprimerClient(int idClient){
        return clientDAO.supprimer(idClient);
    }

    public List<Commande> obtenirComde(int idClient){
        return commandeDAO.rechercherClientId(idClient);
    }

}
