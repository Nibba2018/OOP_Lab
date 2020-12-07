import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutExample {

    public BorderLayoutExample() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton btn1 = new JButton("Button1");
        JButton btn2 = new JButton("Button2");
        JButton btn3 = new JButton("Button3");
        JButton btn4 = new JButton("Button4");
        JButton btn5 = new JButton("Button5");
        JButton btn6 = new JButton("Button6");


        panel.add(btn1, BorderLayout.WEST);
        panel.add(btn2, BorderLayout.CENTER);
        panel.add(btn3, BorderLayout.EAST);
        panel.add(btn4, BorderLayout.WEST);
        panel.add(btn5, BorderLayout.CENTER);
        panel.add(btn6, BorderLayout.PAGE_END);

        frame.add(panel);
        frame.setTitle("Border Layout Example");
        frame.setSize(300, 190);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



    public static void main(String[] args) {
        new BorderLayoutExample();
    }

}