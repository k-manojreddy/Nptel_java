import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EX41 extends Frame implements ActionListener {
    TextField t;
    int a, b;
    String s = "";
    String operator = "";

    EX41() {
        setLayout(new GridLayout(5, 3));
        Button b[] = new Button[16];
        for (int i = 1; i <= 9; i++) {
            b[i - 1] = new Button("" + i);
            add(b[i - 1]);
            b[i - 1].addActionListener(this);
        }
        b[9] = new Button("+");
        b[10] = new Button("-");
        b[11] = new Button("=");
        add(b[9]);
        add(b[10]);
        add(b[11]);
        for (int i = 9; i <= 11; i++) {
            b[i].addActionListener(this);
        }
        t = new TextField();
        add(t);
        setVisible(true);
        setSize(300, 500);
    }

    public static void main(String[] args) {
        new EX41();
    }

    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals("+") || action.equals("-")) {
            a = Integer.parseInt(s);
            operator = action;
            s = "";
        } else if (action.equals("=")) {
            b = Integer.parseInt(s);
            if (operator.equals("+")) {
                t.setText("" + (a + b));
            } else if (operator.equals("-")) {
                t.setText("" + (a - b));
            }
        } else {
            s += action;
        }
    }
}
