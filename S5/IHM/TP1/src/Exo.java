import javax.swing.*;
import java.awt.*;

public class Exo extends JFrame {
    String[] list = {"Etudiant", "professeur", "Administrateur"};
    private JPanel contentPane;
    private JPanel rightPan;
    private JPanel leftPane;
    private JPanel  bottomPane;
    private JPanel topPane;
    private JComboBox<String> comboBox = new JComboBox<>(list);
    private JTextArea textArea;

    Exo(){
        setTitle("Exo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);

        contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);

//    top pane
        topPane = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel comboLabel = new JLabel("Categorue:");
        topPane.add(comboLabel);
        topPane.add(comboBox);

//        right pane
        rightPan = new JPanel();
        rightPan.setLayout(new BoxLayout(rightPan, BoxLayout.Y_AXIS));
        rightPan.setBorder(BorderFactory.createTitledBorder("option"));
        JCheckBox check1 = new JCheckBox("ajouter");
        JCheckBox check2 = new JCheckBox("ajuster");
        check1.setAlignmentX(Component.LEFT_ALIGNMENT);
        check2.setAlignmentX(Component.LEFT_ALIGNMENT);

        rightPan.add(check1);
        rightPan.add(Box.createVerticalStrut(5));
        rightPan.add(check2);

//        left pane
        leftPane = new JPanel();
        leftPane.setLayout(new BoxLayout(leftPane, BoxLayout.Y_AXIS));
        leftPane.setBorder(BorderFactory.createTitledBorder("niv"));

        JRadioButton radio1 = new JRadioButton("info");
        JRadioButton radio2 = new JRadioButton("abort");
        JRadioButton radio3 = new JRadioButton("success");

        radio1.setAlignmentX(Component.LEFT_ALIGNMENT);
        radio2.setAlignmentX(Component.LEFT_ALIGNMENT);
        radio3.setAlignmentX(Component.LEFT_ALIGNMENT);

        ButtonGroup radiGroup = new ButtonGroup();
        radiGroup.add(radio1);
        radiGroup.add(radio2);
        radiGroup.add(radio3);

        leftPane.add(radio1);
        leftPane.add(Box.createVerticalStrut(5));
        leftPane.add(radio2);
        leftPane.add(Box.createVerticalStrut(5));
        leftPane.add(radio3);

//        bottom pane
        bottomPane = new JPanel(new BorderLayout());
        JPanel topBottom = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel inputLabel = new JLabel("message:");
        JTextField textField = new JTextField(15);
        topBottom.add(inputLabel);
        topBottom.add(textField);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btn1 = new JButton("Ajouter");
        JButton btn2 = new JButton("effacer");
        JButton btn3 = new JButton("Fermer");
        bottomPanel.add(btn1);
        bottomPanel.add(btn2);
        bottomPanel.add(btn3);

        bottomPane.add(topBottom, BorderLayout.NORTH);
        bottomPane.add(bottomPanel, BorderLayout.SOUTH);

//        Center
        textArea = new JTextArea();

//        Ajout des element au pricipale
        contentPane.add(topPane, BorderLayout.NORTH);
        contentPane.add(rightPan, BorderLayout.EAST);
        contentPane.add(leftPane, BorderLayout.WEST);
        contentPane.add(new JScrollPane(textArea), BorderLayout.CENTER);
        contentPane.add(bottomPane, BorderLayout.SOUTH);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}