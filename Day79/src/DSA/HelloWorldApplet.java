package DSA;
import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorldApplet extends Applet {

    // The paint method is used to display text or graphics
    public void paint(Graphics g) {
        // Draw the string "Hello, World!" at the x and y coordinates
        g.drawString("Hello, World!", 50, 50);
    }
}
