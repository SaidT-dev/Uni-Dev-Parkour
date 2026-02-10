package dao;

import model.Competence;

import java.util.ArrayList;
import java.util.List;

public class CompetenceDAO {
    private static List<Competence> listeCompetences = new ArrayList<>();

//    CREATE
    public void ajouter(Competence comp) {
        listeCompetences.add(comp);
    }

//    READ tous
    public List<Competence> listerTous() {
        return listeCompetences;
    }

//    READ un
    public Competence rechercherNom(String nom) {
        for (Competence comp : listeCompetences) {
            if (comp.getNomCompetence().equals(nom)) {
                return comp;
            }
        }
        return null;
    }

//    UPDATE
    public boolean modifier(Competence comp) {
        for (int i = 0; i < listeCompetences.size(); i++) {
            if (listeCompetences.get(i).getNomCompetence().equals(comp.getNomCompetence())) {
                listeCompetences.set(i, comp);
                return true;
            }
        }
        return false;
    }

//    DELETE
    public boolean supprimer(String nom) {
        Competence comp = rechercherNom(nom);
        if (comp != null) {
            return listeCompetences.remove(comp);
        }
        return false;
    }
}
