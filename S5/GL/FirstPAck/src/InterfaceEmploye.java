import model.Employe;
import service.GestionEmploye;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class InterfaceEmploye extends JFrame {
    // --- Panels
    private JPanel contentPanel;
    private JPanel rightPanel;
    private JPanel leftPanel;
    private JPanel bottomPanel;

    // --- Input fields
    private JComboBox<String> employeeTypeField;
    private JTextField firstNameField;
    private JTextField secondNameField;
    private JTextField positionField;
    private JTextField departmentField;
    private JTextField durationField;
    private JFormattedTextField rateField;
    private JFormattedTextField birthdayField;
    private JFormattedTextField salaryField;
    private JFormattedTextField compensationField;

    // Labels
    private JLabel labelType;
    private JLabel labelNom;
    private JLabel labelPrenom;
    private JLabel labelDateNais;
    private JLabel labelPosition;
    private JLabel labelSalaire;
    private JLabel labelDepart;
    private JLabel labelIdemVoi;
    private JLabel labelDuree;
    private JLabel labelTaux;
    // --- Buttons
    private JButton annulerButton;
    private JButton enregistrerButton;

    // --- Objet métier
    private GestionEmploye gestion;

    public InterfaceEmploye() {
        this.gestion = new GestionEmploye();
        setTitle("Ajout d'un employé");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(contentPanel);
        setLocationRelativeTo(null);
        setSize(720, 800);
        setResizable(false);

        // Initialise les champs selon le type sélectionné
        updateFieldStatesForSelectedEmployeeType();

        // --- Bouton Annuler
        annulerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                annuler();
            }
        });

        // --- Bouton Enregistrer
        enregistrerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enregistrer();
            }
        });

        // --- Changement de type d’employé
        employeeTypeField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateFieldStatesForSelectedEmployeeType();
            }
        });

        setVisible(true);
    }

    private void enregistrer() {
        String nom = firstNameField.getText().trim();
        String prenom = secondNameField.getText().trim();
        String dateNaissance = birthdayField.getText().trim();
        String position = positionField.getText().trim();

        Number salaryNumber = (Number) salaryField.getValue();
        if (nom.isEmpty() || prenom.isEmpty() || dateNaissance.isEmpty()
                || position.isEmpty() || salaryNumber == null) {
            JOptionPane.showMessageDialog(this,
                    "Veuillez remplir tous les champs obligatoires (nom, prénom, date, poste, salaire).",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        try {
            df.parse(dateNaissance);
        } catch (java.text.ParseException ex) {
            JOptionPane.showMessageDialog(this,
                    "La date de naissance est invalide. Format attendu : jj/MM/aaaa.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double salaire = salaryNumber.doubleValue();
        String type = (String) employeeTypeField.getSelectedItem();

        if (type == null || type.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Veuillez sélectionner un type d'employé.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // ✅ Création du gestionnaire
        GestionEmploye gestion = new GestionEmploye();

        switch (type) {
            case "Cadre":
                String departement = departmentField.getText().trim();
                Number compNumber = (Number) compensationField.getValue();
                if (departement.isEmpty() || compNumber == null) {
                    JOptionPane.showMessageDialog(this,
                            "Veuillez saisir le département et la compensation pour un cadre.",
                            "Erreur", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                double compensation = compNumber.doubleValue();

                gestion.creerEmploye(type, nom, prenom, dateNaissance,
                        position, salaire, departement, compensation);
                break;

            case "Employe Temp":
                String duration = durationField.getText().trim();
                Number rateNumber = (Number) rateField.getValue();
                if (duration.isEmpty() || rateNumber == null) {
                    JOptionPane.showMessageDialog(this,
                            "Veuillez saisir la durée et le taux pour un employé temporaire.",
                            "Erreur", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                double rate = rateNumber.doubleValue();

                gestion.creerEmploye(type, nom, prenom, dateNaissance,
                        position, salaire, duration, rate);
                break;

            default:
                JOptionPane.showMessageDialog(this,
                        "Type d'employé inconnu.",
                        "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
        }



        JOptionPane.showMessageDialog(this, "Employé enregistré avec succès !");
    }


    private void annuler() {
        firstNameField.setText("");
        secondNameField.setText("");
        positionField.setText("");
        departmentField.setText("");
        durationField.setText("");
        rateField.setValue(0.0);
        birthdayField.setText("");
        salaryField.setValue(0.0);
        compensationField.setValue(0.0);
    }

    private void updateFieldStatesForSelectedEmployeeType() {
        String sel = (String) employeeTypeField.getSelectedItem();

        if (sel == null) sel = "";

        switch (sel) {
            case "Cadre":
                durationField.setEnabled(false);
                rateField.setEnabled(false);
                departmentField.setEnabled(true);
                compensationField.setEnabled(true);
                break;
            case "Employe Temp":
                durationField.setEnabled(true);
                rateField.setEnabled(true);
                departmentField.setEnabled(false);
                compensationField.setEnabled(false);
                break;
            default:
                durationField.setEnabled(false);
                rateField.setEnabled(false);
                departmentField.setEnabled(false);
                compensationField.setEnabled(false);
                break;
        }
    }

    private void createUIComponents() {
        // Formats numériques
        DecimalFormat moneyFormat = new DecimalFormat("#0.0");
        NumberFormatter moneyFormatter = new NumberFormatter(moneyFormat);
        moneyFormatter.setAllowsInvalid(false);
        moneyFormatter.setOverwriteMode(true);

        // Format de date
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        DateFormatter dateFormatter = new DateFormatter(dateFormat);

        salaryField = new JFormattedTextField(new DefaultFormatterFactory(moneyFormatter));
        rateField = new JFormattedTextField(new DefaultFormatterFactory(moneyFormatter));
        compensationField = new JFormattedTextField(new DefaultFormatterFactory(moneyFormatter));
        birthdayField = new JFormattedTextField(new DefaultFormatterFactory(dateFormatter));
    }


}
