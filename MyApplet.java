/*
<applet code="MyApplet" width=300 height=150>
    <param name = "username" value=""Varuni>
</applet>
*/

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    String name;
    public void int() {
        name= getParameter("username");
        if (name == null)
            name = "Guest";
    }
    public void paint(Graphics g) {
        g.drawString("Hello, " + name + "!" , 50, 70);
    }
}