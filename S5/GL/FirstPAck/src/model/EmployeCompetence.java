package model;

public class EmployeCompetence {
    private int idEmploye;
    private String nomCompetence;

    public EmployeCompetence(int idEmploye, String nomCompetence) {
        this.idEmploye = idEmploye;
        this.nomCompetence = nomCompetence;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getNomCompetence() {
        return nomCompetence;
    }

    public void setNomCompetence(String nomCompetence) {
        this.nomCompetence = nomCompetence;
    }
}
