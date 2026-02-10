package model;

public class EmployeTemporaire extends Employe {
    private String dureeContrat;
    private double tauxHoraire;

    public EmployeTemporaire(String nom, String prenom, String dateNaissance, String position, double salaire, String dureeContrat, double tauxHoraire) {
        super(nom, prenom, dateNaissance, position, salaire);
        this.dureeContrat = dureeContrat;
        this.tauxHoraire = tauxHoraire;
    }

    public void afficherContrat(){
        System.out.println("Duree de contrat: " + dureeContrat);
    }

    public String getDureeContrat() {
        return dureeContrat;
    }

    public void setDureeContrat(String dureeContrat) {
        this.dureeContrat = dureeContrat;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }
}
