import javax.swing.*;
import java.awt.*;

public class FormDialog extends JFrame {
    JPanel formPanel;
    JPanel buttonPanel;
    JLabel lblNom;
    JTextField txtNom;
    JLabel lblPrenom;
    JTextField txtPrenom;
    JLabel lblGroupe;
    JComboBox<String> groupeCombo;
    JLabel lblAnnee;
    JComboBox<String> anneeCombo;
    JLabel lblModule;
    JComboBox<String> moduleCombo;
    JCheckBox admisCheck;
    JCheckBox ajourneCheck;
    JButton afficherButton;
    JButton effacerButton;
    JButton quitterButton;

    FormDialog() {
        setTitle("FormDialog");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400, 400);
        setLayout(new BorderLayout());
        String[] groupes = {"A1", "A2", "A3", "A4", "B1", "B2", "B3", "B4"};
        String[] annees = {"L1", "L2", "L3", "M1", "M2"};
        String[] modules = {"GL", "IHM", "SE", "Probabilité"};
        formPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        lblNom = new JLabel("Nom:");
        txtNom = new JTextField(20);
        lblPrenom = new JLabel("Prenom:");
        txtPrenom = new JTextField(20);
        lblGroupe = new JLabel("Groupe:");
        groupeCombo = new JComboBox<>(groupes);
        lblAnnee = new JLabel("Année:");
        anneeCombo = new JComboBox<>(annees);
        lblModule = new JLabel("Module:");
        moduleCombo = new JComboBox<>(modules);

        groupeCombo.setSelectedItem(null);
        anneeCombo.setSelectedItem(null);
        moduleCombo.setSelectedItem(null);

        ButtonGroup statusGroup = new ButtonGroup();
        admisCheck = new JCheckBox("Admis");
        ajourneCheck = new JCheckBox("Ajourne");
        statusGroup.add(admisCheck);
        statusGroup.add(ajourneCheck);
        afficherButton = new JButton("Afficher Statut");
        effacerButton = new JButton("Effacer");
        quitterButton = new JButton("Quitter");
        buttonPanel = new JPanel();
        buttonPanel.add(afficherButton);
        buttonPanel.add(effacerButton);
        buttonPanel.add(quitterButton);

        quitterButton.addActionListener(e -> System.exit(0));

        effacerButton.addActionListener(e -> {
            txtNom.setText("");
            txtPrenom.setText("");
            groupeCombo.setSelectedItem(null);
            anneeCombo.setSelectedItem(null);
            moduleCombo.setSelectedItem(null);
            statusGroup.clearSelection();
        });

        afficherButton.addActionListener(e -> {
            String status;
            if (admisCheck.isSelected()) {
                status = "Admis";
            } else if (ajourneCheck.isSelected()) {
                status = "Ajourné";
            } else {
                status = "Non sélectionné";
            }

            String msg = "Nom: " + txtNom.getText() + "\n"
                    + "Prenom: " + txtPrenom.getText() + "\n"
                    + "Groupe: " + (groupeCombo.getSelectedItem() == null ? "" : groupeCombo.getSelectedItem()) + "\n"
                    + "Année: " + (anneeCombo.getSelectedItem() == null ? "" : anneeCombo.getSelectedItem()) + "\n"
                    + "Module: " + (moduleCombo.getSelectedItem() == null ? "" : moduleCombo.getSelectedItem()) + "\n"
                    + "Statut: " + status;

            JOptionPane.showMessageDialog(this, msg, "Informations", JOptionPane.INFORMATION_MESSAGE);
        });

        formPanel.add(lblNom);
        formPanel.add(txtNom);
        formPanel.add(lblPrenom);
        formPanel.add(txtPrenom);
        formPanel.add(lblGroupe);
        formPanel.add(groupeCombo);
        formPanel.add(lblAnnee);
        formPanel.add(anneeCombo);
        formPanel.add(lblModule);
        formPanel.add(moduleCombo);

        JLabel lblStatus = new JLabel("Statut:");
        JPanel statusPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        statusPanel.add(admisCheck);
        statusPanel.add(ajourneCheck);
        formPanel.add(lblStatus);
        formPanel.add(statusPanel);

        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
    }

    public static void main(String[] args) {
        FormDialog frame = new FormDialog();
        frame.setVisible(true);

    }
}
