import javax.swing.*;
import java.awt.*;

public class FormPerso extends JFrame {

    public FormPerso() {
        setTitle("Formulaire Personnage");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 350);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        
        JPanel infoGeneralePanel = new JPanel(new GridLayout(0, 2, 5, 5));
        infoGeneralePanel.setBorder(BorderFactory.createTitledBorder("Information Generale"));

        JLabel lblNom = new JLabel("Nom:");
        JTextField txtNom = new JTextField(20);
        JLabel lblPrenom = new JLabel("Prenom:");
        JTextField txtPrenom = new JTextField(20);
        JLabel lblSexe = new JLabel("Sexe:");
        JComboBox comboSexe = new JComboBox(new String[]{"Male", "Female"});
        JLabel lblAge = new JLabel("Age:");
        JSpinner spAge = new JSpinner(new SpinnerNumberModel(0, 0, null, 1));

        infoGeneralePanel.add(lblNom);
        infoGeneralePanel.add(txtNom);
        infoGeneralePanel.add(lblPrenom);
        infoGeneralePanel.add(txtPrenom);
        infoGeneralePanel.add(lblSexe);
        infoGeneralePanel.add(comboSexe);
        infoGeneralePanel.add(lblAge);
        infoGeneralePanel.add(spAge);

        JPanel caraPhysPanel = new JPanel();
        caraPhysPanel.setLayout(new BoxLayout(caraPhysPanel, BoxLayout.Y_AXIS));
        caraPhysPanel.setBorder(BorderFactory.createTitledBorder("Caractéristiques Physiques"));

        JLabel lblTaille = new JLabel("Taille (cm):");
        JTextField txtTaille = new JTextField(5);
        JPanel taillePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        taillePanel.add(lblTaille);
        taillePanel.add(txtTaille);
        taillePanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel lblCheveux = new JLabel("Couleur des Cheveux:");
        JComboBox comboCheveux = new JComboBox(new String[]{"Noir", "Brun", "Blond", "Rouge", "Autre"});
        JPanel cheveuxPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cheveuxPanel.add(lblCheveux);
        cheveuxPanel.add(comboCheveux);
        cheveuxPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel lblClasse = new JLabel("Classe:");
        JRadioButton radioA = new JRadioButton("A");
        JRadioButton radioB = new JRadioButton("B");
        JRadioButton radioC = new JRadioButton("C");
        ButtonGroup classeGroup = new ButtonGroup();
        classeGroup.add(radioA);
        classeGroup.add(radioB);
        classeGroup.add(radioC);

        JPanel radioPanel = new JPanel();
        radioPanel.add(radioA);
        radioPanel.add(radioB);
        radioPanel.add(radioC);

        JPanel classePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        classePanel.add(lblClasse);
        classePanel.add(radioPanel);
        classePanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        caraPhysPanel.add(taillePanel);
        caraPhysPanel.add(cheveuxPanel);
        caraPhysPanel.add(classePanel);
        caraPhysPanel.add(Box.createVerticalGlue());

        JPanel buttonPanel = new JPanel();
        JButton btnQuitter = new JButton("Quitter");
        JButton btnReset = new JButton("Effacer");

        btnQuitter.addActionListener(e -> System.exit(0));
        btnReset.addActionListener(e -> {
            txtNom.setText("");
            txtPrenom.setText("");
            comboSexe.setSelectedIndex(0);
            spAge.setValue(0);
            txtTaille.setText("");
            comboCheveux.setSelectedIndex(0);
            classeGroup.clearSelection();
        });
        buttonPanel.add(btnQuitter);
        buttonPanel.add(btnReset);

        add(infoGeneralePanel, BorderLayout.NORTH);
        add(caraPhysPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        FormPerso frame = new FormPerso();
        frame.setVisible(true);
    }
}
