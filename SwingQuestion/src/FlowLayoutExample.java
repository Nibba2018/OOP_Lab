import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutExample {

    public FlowLayoutExample() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton btn1 = new JButton("Button1");
        JButton btn2 = new JButton("Button2");
        JButton btn3 = new JButton("Button3");
        JButton btn4 = new JButton("Button4");
        JButton btn5 = new JButton("Button5");
        JButton btn6 = new JButton("Button6");


        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);

        panel.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        frame.add(panel);
        frame.setTitle("Flow Layout Example");
        frame.setSize(400, 190);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



    public static void main(String[] args) {
        new FlowLayoutExample();
    }

}