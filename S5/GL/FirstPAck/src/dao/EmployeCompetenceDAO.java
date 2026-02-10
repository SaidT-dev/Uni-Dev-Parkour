package dao;

import model.EmployeCompetence;

import java.util.ArrayList;
import java.util.List;

public class EmployeCompetenceDAO {
    private static List<EmployeCompetence> listeLiens = new ArrayList<>();

//    CREATE
    public void ajouter(EmployeCompetence lien) {
        listeLiens.add(lien);
    }

//    READ par idEmploye
    public List<EmployeCompetence> listerparIdEmploye(int idEmploye) {
        List<EmployeCompetence> liens = new ArrayList<>();
        for (EmployeCompetence lien : listeLiens) {
            if (lien.getIdEmploye() == idEmploye) {
                liens.add(lien);
            }
        }
        return liens;
    }

//    READ par idCompetence
    public List<EmployeCompetence> listerparIdCompetence(String nomCompetence) {
        List<EmployeCompetence> liens = new ArrayList<>();
        for (EmployeCompetence lien : listeLiens) {
            if (lien.getNomCompetence() == nomCompetence) {
                liens.add(lien);
            }
        }
        return liens;
    }
}
