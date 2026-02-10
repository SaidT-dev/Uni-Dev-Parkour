package service;

import dao.*;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class GestionEmploye {
    private EmployeDAO employeDAO;
    private CompetenceDAO competenceDAO;
    private EmployeCompetenceDAO employeCompetenceDAO;
    private FormationDAO formationDAO;
    private EmployeFormationDAO employeFormationDAO;

    public GestionEmploye(){
        this.employeDAO = new EmployeDAO();
        this.competenceDAO = new CompetenceDAO();
        this.employeCompetenceDAO = new EmployeCompetenceDAO();
        this.formationDAO = new FormationDAO();
        this.employeFormationDAO = new EmployeFormationDAO();
    }

    public void creerEmploye(String type, String nom, String prenom, String dateNaissance, String position, double salaire, String champSpecial1, double champSpecial2) {

        Employe newEmp;

        if (type.equals("Cadre")) {
             newEmp = new Cadre(nom, prenom, dateNaissance, position, salaire, champSpecial1, champSpecial2);
        } else if ("Employe Temp".equals(type)) {
             newEmp = new EmployeTemporaire(nom, prenom, dateNaissance, position, salaire, champSpecial1, champSpecial2);
        } else {
            newEmp = new Employe(nom, prenom, dateNaissance, position, salaire);
        }

        // Enfin, ajoutez l'employé créé au DAO
        employeDAO.ajouter(newEmp);
    }

    public void ajouterEmploye(String nom, String prenom, String dateNaissance, String position, double salaire) {
        Employe newEmp = new Employe(nom,prenom,dateNaissance,position,salaire);
        employeDAO.ajouter(newEmp);
    }

//    public List<Employe> getAllEmploye(){
//        return employeDAO.getListeEmploye();
//    }
//
//    public boolean augmenterSalaire(int idEmploye, double montant) {
//        Employe emp = employeDAO.rechercheId(idEmploye);
//        if (emp != null) {
//            emp.augmenterSalaire(montant);
//            return employeDAO.modifier(emp);
//        }
//        return false;
//    }
//
//    public double obtenirSalaireAnnuel(int idEmploye) {
//        Employe emp = employeDAO.rechercheId(idEmploye);
//        if (emp != null) {
//            return emp.obtenireSalaireAnnuel();
//        }
//        return 0.0;
//    }
//
//    public boolean ajouterCompetence(int idEmploye, String nomCompetence){
//        if(employeDAO.rechercheId(idEmploye) == null){
//            System.err.println("Erreur Service: Employé " + idEmploye + " inexistant.");
//            return false;
//        }
//
//        if(competenceDAO.rechercherNom(nomCompetence) == null){
//            System.err.println("Erreur Service: Compétence '" + nomCompetence + "' inexistante.");
//            return false;
//        }
//
//        EmployeCompetence nouveauLien = new EmployeCompetence(idEmploye, nomCompetence);
//        employeCompetenceDAO.ajouter(nouveauLien);
//        return  true;
//    }
//
//    public List<Competence> obtenirCompetence(int idEmploye){
//        List<Competence> competences = new ArrayList<>();
//
//        List<EmployeCompetence> liens = employeCompetenceDAO.listerparIdEmploye(idEmploye);
//
//        for(EmployeCompetence lien : liens){
//            Competence comp = competenceDAO.rechercherNom(lien.getNomCompetence());
//            if(comp != null){
//                competences.add(comp);
//            }
//        }
//        return competences;
//    }
//
//    public boolean participerFormation(int idEmploye, int idFormation){
//        if(employeDAO.rechercheId(idEmploye) == null){
//            System.err.println("Erreur Service: Employé " + idEmploye + " inexistant.");
//            return false;
//        }
//
//        if(formationDAO.rechercherIdFormation(idFormation) == null){
//            System.err.println("Erreur Service: Formation '" + idFormation + "' inexistante.");
//            return false;
//        }
//
//        EmployeFormation nouveauLien = new EmployeFormation(idEmploye, idFormation);
//        employeFormationDAO.ajouter(nouveauLien);
//        return  true;
//    }
//
//    public List<Formation> obtenirFormation(int idEmploye){
//        List<Formation> formations = new ArrayList<>();
//
//        List<EmployeFormation> liens = employeFormationDAO.rechercherIdEmploye(idEmploye);
//
//        for(EmployeFormation lien : liens){
//            Formation form = formationDAO.rechercherIdFormation(lien.getIdFormation());
//            if(form != null){
//                formations.add(form);
//            }
//        }
//        return formations;
//    }
}
