import javax.swing.*;
import java.awt.*;

public class TestB1 extends JFrame {
    private JPanel mainPan, varPan, colorPane, buttonPane, createNewPan;
    private JButton redButton, greenButton, blueButton, imageButton, displayButton, exitButton;
    private String choosed = "Red";
    private final ImageIcon imageIcon = new ImageIcon("src/photo_2025-12-17_20-56-58.jpg");
    private final JLabel imageLabel = new JLabel(imageIcon);

    public TestB1() {
        setTitle("Tadjine Said B5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

//        Nouvelle Fenetre
        createNewPan = new JPanel(new GridBagLayout());
        JButton newPanButton = new JButton("Nouvelle Fenetre");
        newPanButton.addActionListener(e -> {
            setContentPane(mainPan);
            revalidate();
            repaint();
        });
        createNewPan.add(newPanButton);

//        Main Panel
        mainPan = new JPanel(new BorderLayout());
        varPan = new JPanel();
        redButton = new JButton("Rouge");
        redButton.addActionListener(e -> {
            varPan.removeAll();
            varPan.setBackground(Color.RED);
            choosed = "Rouge";
            varPan.revalidate();
            varPan.repaint();
        });
        greenButton = new JButton("Vert");
        greenButton.addActionListener(e -> {
            varPan.removeAll();
            varPan.setBackground(Color.GREEN);
            choosed = "Vert";
            varPan.revalidate();
            varPan.repaint();
        });
        blueButton = new JButton("Bleu");
        blueButton.addActionListener(e -> {
            varPan.removeAll();
            varPan.setBackground(Color.BLUE);
            choosed = "Bleu";
            varPan.revalidate();
            varPan.repaint();
        });
        imageButton = new JButton("Image");
        imageButton.addActionListener(e -> {
            varPan.removeAll();
            varPan.add(imageLabel);
            varPan.revalidate();
            varPan.repaint();
            choosed = "Image";
        });
        colorPane = new JPanel(new GridLayout(4, 1));
        colorPane.add(redButton);
        colorPane.add(greenButton);
        colorPane.add(blueButton);
        colorPane.add(imageButton);

        displayButton = new JButton("Afficher");
        displayButton.addActionListener(e -> JOptionPane.showMessageDialog(mainPan, "Votre choix: " + choosed));

        exitButton = new JButton("Quitter");
        exitButton.addActionListener(e -> {
            int response = JOptionPane.showConfirmDialog(TestB1.this, "etes vous sur?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        buttonPane = new JPanel(new GridLayout(1, 2));
        buttonPane.setPreferredSize(new Dimension(0, 50));
        buttonPane.add(displayButton);
        buttonPane.add(exitButton);


        mainPan.add(varPan, BorderLayout.CENTER);
        mainPan.add(colorPane, BorderLayout.WEST);
        mainPan.add(buttonPane, BorderLayout.SOUTH);

        setContentPane(createNewPan);
    }

    public static void main(String[] args) {
        TestB1 frame = new TestB1();
        frame.setVisible(true);
    }
}
