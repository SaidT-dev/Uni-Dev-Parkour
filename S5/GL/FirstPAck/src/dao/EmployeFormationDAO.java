package dao;

import model.EmployeFormation;

import java.util.ArrayList;
import java.util.List;

public class EmployeFormationDAO {
    private static List<EmployeFormation> listeLiens = new ArrayList<>();

//    CREATE
    public void ajouter(EmployeFormation lien) {
        listeLiens.add(lien);
    }

//    READ par id d'employe
    public List<EmployeFormation> rechercherIdEmploye(int idEmploye) {
        List<EmployeFormation> liensDeLEmploye = new ArrayList<>();
        for (EmployeFormation lien : listeLiens) {
            if (lien.getIdEmploye() == idEmploye) {
                liensDeLEmploye.add(lien);
            }
        }
        return liensDeLEmploye;
    }

//    READ par id de formation
    public List<EmployeFormation> rechercherIdFormation(int idFormation) {
        List<EmployeFormation> liensDeLaFormation = new ArrayList<>();
        for (EmployeFormation lien : listeLiens) {
            if (lien.getIdFormation() == idFormation) {
                liensDeLaFormation.add(lien);
            }
        }
        return liensDeLaFormation;
    }
}
