import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator implements ActionListener {

    private JFrame frame;
    private JTextField display;
    private JPanel buttonPanel;
    private JButton add, subtract, multiply, divide, equals, clear;
    private double operand1 = 0, operand2 = 0;
    private String operator = "";

    public SimpleCalculator() {
        frame = new JFrame("Simple Calculator");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextField();
        display.setPreferredSize(new Dimension(350, 50));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);

        add = new JButton("+");
        subtract = new JButton("-");
        multiply = new JButton("*");
        divide = new JButton("/");
        equals = new JButton("=");
        clear = new JButton("C");

        buttonPanel = new JPanel(new GridLayout(4, 4, 10, 10));
        buttonPanel.setPreferredSize(new Dimension(350, 250));
        buttonPanel.add(new JButton("7"));
        buttonPanel.add(new JButton("8"));
        buttonPanel.add(new JButton("9"));
        buttonPanel.add(divide);
        buttonPanel.add(new JButton("4"));
        buttonPanel.add(new JButton("5"));
        buttonPanel.add(new JButton("6"));
        buttonPanel.add(multiply);
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("2"));
        buttonPanel.add(new JButton("3"));
        buttonPanel.add(subtract);
        buttonPanel.add(new JButton("."));
        buttonPanel.add(new JButton("0"));
        buttonPanel.add(equals);
        buttonPanel.add(add);
        buttonPanel.add(clear);

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        equals.addActionListener(this);
        clear.addActionListener(this);

        frame.add(display, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("+")) {
            operand1 = Double.parseDouble(display.getText());
            operator = "+";
            display.setText("");
        } else if (command.equals("-")) {
            operand1 = Double.parseDouble(display.getText());
            operator = "-";
            display.setText("");
        } else if (command.equals("*")) {
            operand1 = Double.parseDouble(display.getText());
            operator = "*";
            display.setText("");
        } else if (command.equals("/")) {
            operand1 = Double.parseDouble(display.getText());
            operator = "/";
            display.setText("");
        } else if (command.equals("=")) {
            operand2 = Double.parseDouble(display.getText());
            double result = 0;
            switch (operator) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
                    break;
            }
            display.setText(Double.toString(result));
            operator = "";
        } else if (command.equals("C")) {
            display.setText("");
            operator = "";
            operand1 = 0;
            operand2 = 0;
        } else {
            display.setText(display.getText() + command);
        }
    }
}
