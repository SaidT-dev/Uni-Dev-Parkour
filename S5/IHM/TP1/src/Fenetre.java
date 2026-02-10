import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    public Fenetre() {
        setTitle("Bouton");
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel pan = new JPanel();
        add(pan);
        pan.setLayout(new BorderLayout());
        pan.add(new JButton("CENTER"), BorderLayout.NORTH);
        pan.add(new JCheckBox("SOUTH"), BorderLayout.CENTER);
        pan.add(new JRadioButton("EAST"), BorderLayout.EAST);

        setVisible(true);
    }

}
