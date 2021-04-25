import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    @Override
    public void paint(Graphics graphics) {
        graphics.drawString("Hello",150,150);
    }
}