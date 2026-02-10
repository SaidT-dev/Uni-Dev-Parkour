import javax.swing.*;
import java.awt.*;

public class FormulaireComplex extends JFrame {
    String[] sports = {"Football", "Basketball", "Tennis", "Natation", "Athletisme"};

    JMenuBar menuBar = new JMenuBar();
    JMenu fichier;
    JMenu aide;
    JMenuItem nouveau;
    JMenuItem quitter;

    JTabbedPane tabbedPane;

    public FormulaireComplex() {
        setTitle("TP: Premapartion TP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        JPanel formulairePanel = new JPanel(new BorderLayout());

        JPanel topPane = new JPanel(new BorderLayout());
        JPanel formPane = new JPanel(new GridLayout(7, 2, 6, 6));
        JPanel bottomPane = new JPanel(new BorderLayout());

        // MENU BAR
        fichier = new JMenu("Fichier");
        nouveau = new JMenuItem("Nouveau");
        quitter = new JMenuItem("Quitter");
        fichier.add(nouveau);
        fichier.add(quitter);

        aide = new JMenu("Aide");
        menuBar.add(fichier);
        menuBar.add(aide);
        setJMenuBar(menuBar);

        // Tab Pane
        tabbedPane = new JTabbedPane();

        // TOP PANE
        JLabel Title = new JLabel("Formulaire d'inscription", SwingConstants.CENTER);
        Title.setFont(Title.getFont().deriveFont(Font.BOLD, 20f));
        topPane.add(Title, BorderLayout.CENTER);

        // FORM PANE
        JLabel NomLabel = new JLabel("Nom:");
        JTextField NomField = new JTextField(20);
        JPanel NomFieldPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        NomFieldPanel.add(NomField);

        JLabel PrenomLabel = new JLabel("Prenom:");
        JTextField PrenomField = new JTextField(20);
        JPanel PrenomFieldPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        PrenomFieldPanel.add(PrenomField);

        JPanel sexePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 6, 0));
        JLabel SexeLabel = new JLabel("Sexe:");
        JRadioButton MaleRadio = new JRadioButton("Male");
        JRadioButton FemaleRadio = new JRadioButton("Female");
        ButtonGroup SexeGroup = new ButtonGroup();
        SexeGroup.add(MaleRadio);
        SexeGroup.add(FemaleRadio);
        sexePanel.add(MaleRadio);
        sexePanel.add(FemaleRadio);

        JLabel sportLabel = new JLabel("Sport:");
        JComboBox<String> SportCombo = new JComboBox<>(sports);
        SportCombo.setSelectedIndex(0);
        JPanel SportComboPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        SportComboPanel.add(SportCombo);

        JLabel optionLabel = new JLabel("Options:");
        JPanel optionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 6, 0));
        JCheckBox Assurance = new JCheckBox("S'abonner");
        optionPanel.add(Assurance);


        JLabel CommentaireLabel = new JLabel("Commentaire:");
        JTextArea Commentaire = new JTextArea(4, 20);
        Commentaire.setLineWrap(true);
        Commentaire.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(Commentaire);
        JPanel CommentairePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        CommentairePanel.add(scrollPane);

        formPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        formPane.add(NomLabel);
        formPane.add(NomFieldPanel);
        formPane.add(PrenomLabel);
        formPane.add(PrenomFieldPanel);
        formPane.add(sportLabel);
        formPane.add(SportComboPanel);
        formPane.add(SexeLabel);
        formPane.add(sexePanel);
        formPane.add(optionLabel);
        formPane.add(optionPanel);
        formPane.add(CommentaireLabel);
        formPane.add(CommentairePanel);

        // BOTTOM PANE
        JPanel buttonContainer = new JPanel(new GridLayout(2, 1));
        JPanel buttonPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton envoyer = new JButton("Envoyer");
        JButton reinitialiser = new JButton("Reinitialiser");
        JButton viderTableau = new JButton("Vider Tableau");
        buttonPanel1.add(envoyer);
        buttonPanel1.add(reinitialiser);
        buttonPanel1.add(viderTableau);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton quitterB = new JButton("Quitter");
        JButton aideB = new JButton("Aide");
        JButton afficherStatut = new JButton("Afficher Statut");
        buttonPanel2.add(quitterB);
        buttonPanel2.add(afficherStatut);
        buttonPanel2.add(aideB);

        buttonContainer.add(buttonPanel1);
        buttonContainer.add(buttonPanel2);

        bottomPane.setBorder(BorderFactory.createEmptyBorder(8, 10, 8, 10));
        bottomPane.add(buttonContainer, BorderLayout.CENTER);

        formulairePanel.add(topPane, BorderLayout.NORTH);
        formulairePanel.add(formPane, BorderLayout.CENTER);
        formulairePanel.add(bottomPane, BorderLayout.SOUTH);

        // Tab Pane
        tabbedPane.addTab("Formulaire", formulairePanel);
        tabbedPane.addTab("Tableau", new JPanel());

        setContentPane(tabbedPane);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        FormulaireComplex fi = new FormulaireComplex();
        fi.setVisible(true);
    }
}
