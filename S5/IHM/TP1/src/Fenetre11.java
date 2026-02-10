import javax.swing.*;
import java.awt.*;

public class Fenetre11 extends JFrame {
    public Fenetre11() {
        setTitle("Bouton");
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel pan = new JPanel();

        add(pan,  BorderLayout.NORTH);
        JLabel b = new JLabel("Nom");
        pan.add(b);
        JTextField b1 = new JTextField(10);
        pan.add(b1);
        JPanel pan1 = new JPanel();
        pan1.setBorder(BorderFactory.createTitledBorder("Information"));
        add(pan1,BorderLayout.CENTER);
        JLabel prenom = new JLabel("Prenom");
        prenom.setFont(new Font("Arial", Font.PLAIN, 20));
        pan.add(prenom);
        pan1.add(prenom);
        JTextField b11 = new JTextField(10);
        pan1.add(b11);
        b11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b11.setForeground(Color.BLUE);
        JTextArea texte = new JTextArea(10, 40);
        texte.setText("bonjour");
        JScrollPane b2 = new JScrollPane(texte);
        add(b2,BorderLayout.SOUTH);

        setVisible(true);
    }

}
