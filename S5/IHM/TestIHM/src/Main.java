import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    JPanel panel, buttonPanel, panelMain;
    String[] niv = {null, "L1", "L2","L3", "M1", "M2"};
    JLabel lblNom, lblPrenom, lblNiveau, lblType;
    JTextField txtNom, txtPrenom;
    JComboBox<String> cmbNiveau;
    JRadioButton normalRadio, redoublantRadio;
    JButton effacer, quitter;

    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Fenetre");
        setSize(400, 250);
        setLocationRelativeTo(null);
        panel = new JPanel(new GridLayout(4, 2));
        panelMain = new JPanel(new BorderLayout());
        panelMain.setBorder(BorderFactory.createTitledBorder("Informations"));

        lblNom = new JLabel("Nom:");
        lblPrenom = new JLabel("Prénom:");
        lblNiveau = new JLabel("Niveau:");
        lblType = new JLabel("Type étudiant:");
        txtNom = new JTextField();
        txtPrenom = new JTextField();
        cmbNiveau = new JComboBox<>(niv);
        normalRadio = new JRadioButton("Normal");
        redoublantRadio = new JRadioButton("Redoublant");
        ButtonGroup typeGroup = new ButtonGroup();
        typeGroup.add(normalRadio);
        typeGroup.add(redoublantRadio);
        JPanel radioPanel = new JPanel();
        radioPanel.add(normalRadio);
        radioPanel.add(redoublantRadio);

        effacer = new JButton("Effacer");
        quitter = new JButton("Quitter");
        buttonPanel = new JPanel();
        buttonPanel.add(effacer);
        buttonPanel.add(quitter);

        effacer.addActionListener(e -> {
            txtNom.setText("");
            txtPrenom.setText("");
            cmbNiveau.setSelectedIndex(0);
            typeGroup.clearSelection();
        });

        quitter.addActionListener(e -> System.exit(0));

        panel.add(lblNom);
        panel.add(txtNom);
        panel.add(lblPrenom);
        panel.add(txtPrenom);
        panel.add(lblNiveau);
        panel.add(cmbNiveau);
        panel.add(lblType);

        panelMain.add(panel, BorderLayout.NORTH);
        panelMain.add(radioPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(panelMain);
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
