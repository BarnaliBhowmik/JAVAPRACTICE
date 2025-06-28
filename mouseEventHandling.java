import java.awt.*;
import java.awt.event.*;

public class mouseEventHandling {
    String msg = "";
    mouseEventHandling() {
        addMouseListener(this);
        setSize(300, 200);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        msg = "Mouse Clicked";
        repaint();
    }
    public void mousePressed(MouseEvent e) {
        msg = "Mouse Pressed";
        repaint();
    }
    public void mouseReleased(MouseEvent e) {
        msg = "Mouse Released";
        repaint();
    }
    public void mouseEntered(MouseEvent e) {
        msg = "Mouse Entered";
        repaint();
    }
    public void mouseExited(MouseEvent e) {
        msg = "Mouse Exited";
        repaint();
    }
    public void paintComponent(Graphics g) {
        g.drawString(msg, 50, 100);
    }
    public static void main(String[] args) {
        new mouseEventHandling();
    }
}
