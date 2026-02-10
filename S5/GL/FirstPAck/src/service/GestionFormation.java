package service;

import dao.EmployeDAO;
import dao.EmployeFormationDAO;
import dao.FormationDAO;
import model.Employe;
import model.EmployeFormation;
import model.Formation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionFormation {
    private FormationDAO formationDAO;
    private EmployeFormationDAO employeFormationDAO;
    private EmployeDAO employeDAO;

    public GestionFormation() {
        this.formationDAO = new FormationDAO();
        this.employeFormationDAO = new EmployeFormationDAO();
        this.employeDAO = new EmployeDAO();
    }

    public Formation creeNouvelleFormation(String nom, Date date) {
        if (nom == null || nom.trim().isEmpty() || date == null) {
            System.err.println("Erreur Service: Nom et date sont obligatoires.");
            return null;
        }
        Formation nouvelleFormation = new Formation(nom, date);
        formationDAO.ajouter(nouvelleFormation);
        return nouvelleFormation;
    }

    public List<Formation> obtenirToutesLesFormations(){
        return formationDAO.listerTous();
    }

//    public List<Employe> obtenirParticipants(int idFormation){
//        List<Employe> participants = new ArrayList<>();
//        List<EmployeFormation> liens = employeFormationDAO.rechercherIdFormation(idFormation);
//
//        for(EmployeFormation lien : liens) {
//            int idEmploye = lien.getIdEmploye();
//            Employe employe = employeDAO.rechercheId(idEmploye);
//            if(employe != null) participants.add(employe);
//        }
//        return participants;
//    }
}
