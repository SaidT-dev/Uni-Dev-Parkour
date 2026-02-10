package model;

public class EmployeFormation {
    private int idEmploye;
    private int idFormation;

    public EmployeFormation(int idEmploye, int idFormation) {
        this.idEmploye = idEmploye;
        this.idFormation = idFormation;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public int getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(int idFormation) {
        this.idFormation = idFormation;
    }
}
