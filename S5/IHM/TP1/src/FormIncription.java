import javax.swing.*;
import java.awt.*;

public class FormIncription extends JFrame {
    String[] sports = {"Football", "Basketball", "Tennis", "Natation", "Athletisme"};

    private JPanel contentPane;
    private JPanel topPane;
    private JPanel bottomPane;
    private JPanel formPane;

    JMenuBar menuBar = new JMenuBar();
    JMenu fichier;
    JMenu aide;
    JMenuItem nouveau;
    JMenuItem quitter;
    private JLabel Title;

    private JLabel NomLabel;
    private JTextField NomField;
    private JLabel PrenomLabel;
    private JTextField PrenomField;

    private JLabel SexeLabel;
    private JRadioButton MaleRadio;
    private JRadioButton FemaleRadio;
    private ButtonGroup SexeGroup;

    private JLabel sportLabel;
    private JComboBox<String> SportCombo = new JComboBox<>(sports);

    private JLabel optionLabel;
    private JCheckBox Assurance;
    private JCheckBox fourni;

    private JLabel CommentaireLabel;
    private JTextArea Commentaire;

    private JButton valider;
    private JButton annuler;
    private JButton effacereTous;

    public FormIncription() {
        setTitle("TP: Premapartion TP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        contentPane = new JPanel(new GridLayout(3,1));
        topPane = new JPanel(new BorderLayout());
        formPane = new JPanel(new GridLayout(6, 2, 6, 6));
        bottomPane = new JPanel(new BorderLayout());

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

        // TOP PANE
        Title = new JLabel("Formulaire d'inscription", SwingConstants.CENTER);
        Title.setFont(Title.getFont().deriveFont(Font.BOLD, 20f));
        topPane.add(Title, BorderLayout.CENTER);

        // FORM PANE
        NomLabel = new JLabel("Nom:");
        NomField = new JTextField();
        PrenomLabel = new JLabel("Prenom:");
        PrenomField = new JTextField();

        JPanel sexePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 6, 0));
        SexeLabel = new JLabel("Sexe:");
        MaleRadio = new JRadioButton("Male");
        FemaleRadio = new JRadioButton("Female");
        SexeGroup = new ButtonGroup();
        SexeGroup.add(MaleRadio);
        SexeGroup.add(FemaleRadio);
        sexePanel.add(MaleRadio);
        sexePanel.add(FemaleRadio);

        sportLabel = new JLabel("Sport:");
        optionLabel = new JLabel("Options:");
        SportCombo.setSelectedIndex(0);

        JPanel optionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 6, 0));
        Assurance = new JCheckBox("Assurance");
        fourni = new JCheckBox("Materiel fourni");
        optionPanel.add(Assurance);
        optionPanel.add(Box.createVerticalStrut(5));
        optionPanel.add(fourni);


        CommentaireLabel = new JLabel("Commentaire:");
        Commentaire = new JTextArea(4, 30);
        Commentaire.setLineWrap(true);
        Commentaire.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(Commentaire);

        formPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        formPane.add(NomLabel);
        formPane.add(NomField);
        formPane.add(PrenomLabel);
        formPane.add(PrenomField);
        formPane.add(SexeLabel);
        formPane.add(sexePanel);
        formPane.add(sportLabel);
        formPane.add(SportCombo);
        formPane.add(optionLabel);
        formPane.add(optionPanel);
        formPane.add(CommentaireLabel);
        formPane.add(scrollPane);

        // BOTTOM PANE
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        valider = new JButton("Valider");
        annuler = new JButton("Annuler");
        effacereTous = new JButton("Effacer Tous");
        buttonPanel.add(valider);
        buttonPanel.add(annuler);
        buttonPanel.add(effacereTous);

        bottomPane.setBorder(BorderFactory.createEmptyBorder(8, 10, 8, 10));
        bottomPane.add(buttonPanel, BorderLayout.CENTER);

        contentPane.add(Title, BorderLayout.NORTH);
        contentPane.add(formPane, BorderLayout.CENTER);
        contentPane.add(bottomPane, BorderLayout.SOUTH);

        setContentPane(contentPane);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        FormIncription fi = new FormIncription();
        fi.setVisible(true);
    }
}
