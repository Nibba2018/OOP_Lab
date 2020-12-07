import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Draw extends JFrame{

    public Draw() {
        JPanel panel = new JPanel();


        panel.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g = getGraphics();
                g.setColor(Color.BLACK);
                g.fillOval(e.getX(), e.getY(), 5, 5);
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }

        });


        setTitle("Drawing");
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        add(panel);
        setSize(640, 480);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {
        new Draw();
    }
}