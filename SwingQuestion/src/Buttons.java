import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Buttons {
    JLabel label;

    public Buttons() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton btn1 = new JButton("Button1");
        JButton btn2 = new JButton("Button2");
        JButton btn3 = new JButton("Button3");
        JButton btn4 = new JButton("Button4");
        JButton btn5 = new JButton("Button5");
        JButton btn6 = new JButton("Button6");

        label = new JLabel("Button Clicked");


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button 1 clicked at "+LocalDateTime.now().toString());
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button 2 clicked at "+LocalDateTime.now().toString());
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button 3 clicked at "+LocalDateTime.now().toString());
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button 4 clicked at "+LocalDateTime.now().toString());
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button 5 clicked at "+LocalDateTime.now().toString());
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button 6 clicked at "+LocalDateTime.now().toString());
            }
        });

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(label);

        panel.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        frame.add(panel);
        frame.setTitle("Event Listening Example");
        frame.setSize(400, 190);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



    public static void main(String[] args) {
        new Buttons();
    }

}