import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="EX39" width="800" height="800"></applet>*/
public class EX39 extends Applet {
    SubFrame f;

    public void init() {
        f = new SubFrame("SubFrameis");
		f.setLocation(100,100);
		f.setSize(500,500);
    }

    public void start() {
        f.setVisible(true);
    }

    public void stop() {
        f.setVisible(false);
    }
}

class SubFrame extends Frame {
    SubFrame(String s) {
        super(s);
        WA a = new WA(this);
        addWindowListener(a);
    }

    public void paint(Graphics g) {
        g.drawString("This is frame", 150, 150);
    }
}

class WA extends WindowAdapter {
    SubFrame s;

    WA(SubFrame k) {
        s = k;
    }

    public void windowClosing(WindowEvent e) {
        s.setVisible(false);
    }
}
