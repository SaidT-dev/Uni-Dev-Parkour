import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listner extends JFrame {
    private JButton b;
    private int h = 0;

    Listner(){
        setTitle("Gestion de clics");
        setBounds(10, 20, 300, 200);
        setLayout(new FlowLayout(FlowLayout.CENTER,5 ,5));
        b = new JButton("ok");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                h++;
                b.setText("ok " + h);
            }
        });
        add(b);
    }

    public static void main(String[] args) {
        Listner frame = new Listner();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
