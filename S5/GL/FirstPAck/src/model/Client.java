package model;

public class Client {
    private int idClient;
    private String nomClient;
    private String adresseClient;
    private static int nbrClient = 0;

    public Client() {
        this(0, "null", "null");
    }

    public Client(String nomClient, String adresseClient) {
        this.idClient = ++nbrClient;
        this.nomClient = nomClient;
        this.adresseClient = adresseClient;

    }

//    Pour DOA
    public Client(int idClient, String nomClient, String adresseClient) {
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.adresseClient = adresseClient;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }
}
