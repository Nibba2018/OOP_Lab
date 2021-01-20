import java.applet.Applet;
import java.awt.Image;
import java.awt.Graphics;

public class ImageAnimation extends Applet{
    Image image;
    public void init(){
        image = getImage(getDocumentBase(), "image.jpg");
    }
    public void paint(Graphics g){
        for(int pos = 0; pos< 600; pos+=50){
            g.drawImage(image, pos, 30, this);
            try{
                Thread.sleep(400);
            }catch(Exception e){
                System.err.println(e);
            }
        }
    }
}
/*
<applet code="ImageAnimation.class" width="500" height="500">
</applet>
*/
