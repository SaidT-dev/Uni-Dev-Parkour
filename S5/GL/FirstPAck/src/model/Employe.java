package model;

public class Employe {
    private int idEmploye = 0;
    protected String nom;
    protected String prenom;
    protected String dateNaissance;
    protected String position;
    protected double salaire;
    protected static int nbrEmploye = 0;

    public Employe(){
        this.nom = null;
        this.prenom = null;
        this.dateNaissance = null;
        this.position = null;
        this.salaire = 0.0;
        this.idEmploye = 0;
    }

    public Employe(String nom, String prenom, String dateNaissance, String position, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.position = position;
        this.salaire = salaire;
        nbrEmploye++;
        this.idEmploye = nbrEmploye;
    }

    public void description(){
        System.out.println(this.nom + " " + this.prenom + " est un(e) employe, " + this.position + ", ne(e) le " + this.dateNaissance + ", et il/elle a un salaire mensuel de: " +  this.salaire + " €");
    }

    public void description(String prenom, String nom){
        System.out.println("L'identifiant d'employe " + this.nom + " " + this.prenom + ", est: " + this.idEmploye);
    }

    public void augmenterSalaire(double montant){
        this.salaire += montant;
    }

    public double obtenireSalaireAnnuel(){
        return this.salaire * 12;
    }

//    Getters and Setters
    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
