import javax.swing.*;

public class BoxLayoutTest extends JFrame {
    public BoxLayoutTest(){
        setTitle("Box Layout");
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel b1 = new JPanel();
        b1.setLayout(new BoxLayout(b1,BoxLayout.LINE_AXIS));
        b1.add(new JButton("Button 1"));

        JPanel b2 = new JPanel();
        b2.setLayout(new BoxLayout(b2,BoxLayout.LINE_AXIS));
        b2.add(new JButton("Button 2"));
        b2.add(new JButton("Button 3"));

        JPanel b3 = new JPanel();
        b3.setLayout(new BoxLayout(b3,BoxLayout.LINE_AXIS));
        b3.add(new JButton("Button 4"));
        b3.add(new JButton("Button 5"));
        b3.add(new JButton("Button 6"));

        JPanel b4 = new JPanel();
        b4.setLayout(new BoxLayout(b4,BoxLayout.PAGE_AXIS));
        add(b4);
        b4.add(b1);
        b4.add(b2);
        b4.add(b3);
    }

    public static void main(String[] args) {
        BoxLayoutTest frame = new BoxLayoutTest();
        frame.setVisible(true);
    }
}
