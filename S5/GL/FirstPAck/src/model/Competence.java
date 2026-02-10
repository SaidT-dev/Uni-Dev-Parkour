package model;

public class Competence {
    private String nomCompetence;
    private int niveauCompetence;

    public Competence(String nomCompetence, int niveauCompetence) {
        this.nomCompetence = nomCompetence;
        this.niveauCompetence = niveauCompetence;
    }

    public String getNomCompetence() {
        return nomCompetence;
    }

    public void setNomCompetence(String nomCompetence) {
        this.nomCompetence = nomCompetence;
    }

    public int getNiveauCompetence() {
        return niveauCompetence;
    }

    public void setNiveauCompetence(int niveauCompetence) {
        this.niveauCompetence = niveauCompetence;
    }
}
