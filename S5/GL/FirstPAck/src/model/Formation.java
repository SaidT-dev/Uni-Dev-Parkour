package model;

import java.util.Date;

public class Formation {
    private int idFormation;
    private String nomFormation;
    private Date dateFormation;
    private static int nbrFormation = 0;
    
    public Formation(String nomFormation, Date dateFormation) {
        this.idFormation = ++nbrFormation;
        this.nomFormation = nomFormation;
        this.dateFormation = dateFormation;
    }
    
    public Formation(int idFormation, String nomFormation, Date dateFormation) {
        this.idFormation = idFormation;
        this.nomFormation = nomFormation;
        this.dateFormation = dateFormation;
    }

    public int getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(int idFormation) {
        this.idFormation = idFormation;
    }

    public String getNomFormation() {
        return nomFormation;
    }

    public void setNomFormation(String nomFormation) {
        this.nomFormation = nomFormation;
    }

    public Date getDateFormation() {
        return dateFormation;
    }

    public void setDateFormation(Date dateFormation) {
        this.dateFormation = dateFormation;
    }
}
