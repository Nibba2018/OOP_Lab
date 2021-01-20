import java.applet.Applet;
import java.awt.Graphics;
import java.time.LocalTime;

public class DigitalClock extends Applet implements Runnable{

    String timeString;

    @Override
    public void start() {
        new Thread(this).start();
    }

    public void paint(Graphics g) {
        g.drawString(timeString, 50, 50);
    }

    @Override
    public void run() {
        try{
            while(true){
                LocalTime time = LocalTime.now();

                timeString = String.valueOf(time.getHour()) + ":" +
                             String.valueOf(time.getMinute()) + ":" +
                             String.valueOf(time.getSecond());

                repaint();
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.err.println(e);
        }
    }


}
/*
<applet code="DigitalClock.class" width="200" height="80">
</applet>
*/