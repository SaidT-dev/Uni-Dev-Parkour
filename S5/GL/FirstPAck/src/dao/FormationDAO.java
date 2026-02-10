package dao;

import model.Formation;
import java.util.ArrayList;
import java.util.List;

public class FormationDAO {
    private static List<Formation> listeFormations = new ArrayList<>();

//    CREATE
    public void ajouter(Formation formation) {
        listeFormations.add(formation);
    }

//    READ Tous
    public List<Formation> listerTous() {
        return listeFormations;
    }

//    READ un
    public Formation rechercherIdFormation(int idFormation) {
        for (Formation f : listeFormations) {
            if (f.getIdFormation() == idFormation) {
                return f;
            }
        }
        return null;
    }



}
