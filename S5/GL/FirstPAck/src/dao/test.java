package dao;

import model.Cadre;

public class test {
    public static void main(String[] args) {
        EmployeDAO dao = new EmployeDAO();
        Cadre c = new Cadre("Ahmed", "Belkacem", "12/03/1995", "Chef Projet", 4000.0, "Informatique", 500.0);
        dao.ajouter(c);
    }
}
