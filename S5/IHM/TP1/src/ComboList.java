import javax.swing.*;
import java.awt.*;

public class ComboList extends JFrame {
    String[] items = {"Birds", "Cat", "Dog", "Rabbit"};
    private JPanel container = new JPanel();
    private JComboBox combo = new JComboBox(items);
    private JLabel label = new JLabel("Une ComboBox");
    public ComboList(){
        setTitle("Button");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel top = new JPanel();
        add(top, BorderLayout.NORTH);
        top.setBackground(Color.white);
        combo.setPreferredSize(new Dimension(100,20));
        top.add(label);
        top.add(combo);
        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement("Jane Doe");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        listModel.addElement("Jane Doe");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        listModel.addElement("Jane Doe");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        listModel.addElement("Jane Doe");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        listModel.addElement("Jane Doe");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        JList list = new JList(listModel);
        JScrollPane b2 = new JScrollPane(list);
        add(b2, BorderLayout.SOUTH);
        setVisible(true);
    }
}
