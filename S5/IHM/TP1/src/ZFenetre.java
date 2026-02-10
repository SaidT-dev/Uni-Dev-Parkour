import javax.swing.*;

public class ZFenetre extends JFrame {
    private JMenuBar menuBar;
    private JMenu test1, test1_2, test2;
    private JMenuItem item1, item2, item3, item4;
    private JCheckBoxMenuItem jcmi1, jcmi2;
    private JRadioButtonMenuItem jrm1, jrm2;
    public ZFenetre() {
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        test1 = new JMenu("Fichier");
        menuBar.add(test1);
        item1 = new JMenu("Ouvrir");
        test1.add(item1);
        test1.addSeparator();

        test1_2 = new JMenu("Sous fichier");
        test1.add(test1_2);
        jcmi1 = new JCheckBoxMenuItem("Choix 1");
        test1_2.add(jcmi1);
        jcmi2 = new JCheckBoxMenuItem("Choix 2");
        test1_2.add(jcmi2);
        test1_2.addSeparator();

        item2 = new JMenuItem("Fermer");
        test1.add(item2);
        jrm1 = new JRadioButtonMenuItem("Radio 1");
        jrm2 = new JRadioButtonMenuItem("Radio 2");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrm1);
        jrm1.setSelected(true);
        test1_2.add(jrm1);
        test1_2.add(jrm2);
        test2 = new JMenu("Edition");
        menuBar.add(test2);
        item3 = new JMenuItem("Lancer");
        test2.add(item3);
        item4 = new JMenuItem("Arreter");
        test2.add(item4);
    }
}
