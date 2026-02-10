package dao;

import model.Employe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class EmployeDAO {

//    CREATE
    public void ajouter(Employe emp) {
        String sql = "INSERT INTO EMPLOYE (nom, prenom, date_naissance, position, salaire, type_employe, varS, varD) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement  ps = conn.prepareStatement(sql)){

            ps.setString(1, emp.getNom());
            ps.setString(2, emp.getPrenom());
            ps.setString(3, emp.getDateNaissance());
            ps.setString(4, emp.getPosition());
            ps.setDouble(5, emp.getSalaire());

            if (emp instanceof model.Cadre cadre) {
                ps.setString(6, "Cadre");
                ps.setString(7, cadre.getDepartement());
                ps.setDouble(8, cadre.getIndemniteVoiture());
            } else if (emp instanceof model.EmployeTemporaire temp) {
                ps.setString(6, "Employe Temp");
                ps.setString(7, temp.getDureeContrat());
                ps.setDouble(8, temp.getTauxHoraire());
            } else {
                ps.setString(6, "Employe");
                ps.setString(7, null);
                ps.setDouble(8, 0.0);
            }

            ps.executeUpdate();
            System.out.println("Employé ajouté dans la base !");
        } catch (SQLException e){
            System.out.println("Erreur lors de l'ajout de l'employé : " + e.getMessage());
        }

    }

////    READ
//    public List<Employe> getListeEmploye() {
//        return listeEmploye;
//    }
//
////    Read
//    public Employe rechercheId(int id) {
//        for (Employe emp : listeEmploye) {
//            if (emp.getIdEmploye() == id) {
//                return emp;
//            }
//        }
//        return null;
//    }
//
////    UPDATE
//    public boolean modifier(Employe emp){
//        for (int i = 0; i < listeEmploye.size(); i++){
//            if(listeEmploye.get(i).getIdEmploye() == emp.getIdEmploye()){
//                listeEmploye.set(i, emp);
//                return true;
//            }
//        }
//        return false;
//    }
//
////    DELETE
//    public boolean supprimer(int id) {
//        Employe emp = rechercheId(id);
//        if(emp != null){
//            return listeEmploye.remove(emp);
//        }
//        return false;
//    }

}
