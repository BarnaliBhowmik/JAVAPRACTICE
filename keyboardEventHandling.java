import java.awt.*;
import java.awt.event.*;
public class keyboardEventHandling extends Frame implements KeyListener {
    String msg = "";
    keyboardEventHandling() {
        addKeyListener(this);
        setSize(300, 200);
        setVisible(true);
    }
    public void keyPressed (KeyEvent e) {
        msg = "Key Pressed: " + e.getKeyChar();
        repaint();
    }
    public void keyReleased (KeyEvent e) {
        msg = "Key Released: " + e.getKeyChar();
        repaint();
    }
    public void keyTyped (KeyEvent e) {
        msg = "Key Typed: " + e.getKeyChar() ;
        repaint();
    }
    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
    public static void main (String[] args) {
        new keyboardEventHandling();
    }
}
