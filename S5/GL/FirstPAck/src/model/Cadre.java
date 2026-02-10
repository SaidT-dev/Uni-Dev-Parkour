package model;

public class Cadre extends Employe{
    private String departement;
    private double indemniteVoiture;

    public Cadre(String nom, String prenom, String dateNaissance, String position, double salaire, String departement, double indemniteVoiture) {
        super(nom, prenom, dateNaissance, position, salaire);
        this.departement = departement;
        this.indemniteVoiture = indemniteVoiture;
    }

    public void afficherDepartement(){
        System.out.println("Departement: " + departement);
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public double getIndemniteVoiture() {
        return indemniteVoiture;
    }

    public void setIndemniteVoiture(double indemniteVoiture) {
        this.indemniteVoiture = indemniteVoiture;
    }
}
