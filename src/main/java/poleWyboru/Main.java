package poleWyboru;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public Main() {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Pole wyboru");
        this.setBounds(300, 300, 300, 300);

        etykieta.setFont(new Font("Arial", Font.PLAIN, 25));

        ActionListener sluchacz = new CheckBoxHandler();
        pogrubiony.addActionListener(sluchacz);
        pochylony.addActionListener(sluchacz);
        panel1.add(pogrubiony);
        panel1.add(pochylony);
        panel2.add(etykieta);
        this.getContentPane().add(panel1, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.CENTER);


        this.setDefaultCloseOperation(3);

    }
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();

    JCheckBox pogrubiony = new JCheckBox("pogrubiony");
    JCheckBox pochylony = new JCheckBox("pochylony");


    JLabel etykieta = new JLabel("Jeste");

    public class CheckBoxHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent actionEvent) {

            int style = Font.PLAIN;


           if (pogrubiony.isSelected()) style += Font.BOLD;
           if (pochylony.isSelected()) style += Font.ITALIC;

           etykieta.setFont(new Font(etykieta.getFont().getFamily(), style, etykieta.getFont().getSize()));
        }
    }
    public static void main(String[] args) {
        new Main().setVisible(true);

    }

}

