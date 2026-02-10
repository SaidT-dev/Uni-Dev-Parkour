package service;

import dao.CompetenceDAO;
import model.Competence;

import java.util.List;

public class GestionCompetence {
    private CompetenceDAO competenceDAO;

    public GestionCompetence() {
        this.competenceDAO = new CompetenceDAO();
    }

    public Competence creerNouvelleCompetence(String nom, int niveau) {
        if(nom == null || nom.trim().isEmpty()){
            System.err.println("Erreur Service: Le nom de la competence est obligatoire.");
            return null;
        }

        if(niveau < 1 || niveau > 5 ){
            System.err.println("Erreur Service: Le niveau de maîtrise doit être entre 1 et 5.");
            return null;
        }

        if(competenceDAO.rechercherNom(nom) != null){
            System.err.println("Erreur Service: La competence '" + nom + "' existe déjà.");
            return null;
        }
        Competence nouvelleCompetence = new Competence(nom, niveau);
        competenceDAO.ajouter(nouvelleCompetence);
        return nouvelleCompetence;
    }

    public List<Competence> obtenirToutesLesCompetences(){
        return competenceDAO.listerTous();
    }
}
