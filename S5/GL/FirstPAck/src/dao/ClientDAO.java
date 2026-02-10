package dao;

import model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientDAO {
    private static List<Client> listeClients = new ArrayList<>();

//    CREATE
    public void ajouter(Client client){
        listeClients.add(client);
    }

//    READ Tous
    public List<Client> listerTous(){
        return listeClients;
    }

//    READ un
    public Client rechercherId(int id){
        for(Client c : listeClients){
            if(c.getIdClient() == id){
                return c;
            }
        }
        return null;
    }

//    UPDATE
    public boolean modifier(Client client){
        for(int i = 0; i < listeClients.size(); i++){
            if(listeClients.get(i).getIdClient() == client.getIdClient()){
                listeClients.set(i, client);
                return true;
            }
        }
        return false;
    }

//    DELETE
    public boolean supprimer(int id){
        Client client = rechercherId(id);
        if(client != null){
            return listeClients.remove(client);
        }
        return false;
    }
}
