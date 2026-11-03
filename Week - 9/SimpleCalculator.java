
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    JTextField tf;
    JButton[] buttons;
    String[] values = {
        "7", "8", "9", "+",
        "4", "5", "6", "-",
        "1", "2", "3", "*",
        "0", "C", "=", "%"
    };

    double num1, num2, result;
    char operator;

    SimpleCalculator() {
        tf = new JTextField();
        tf.setEditable(false);
        tf.setFont(new Font("Arial", Font.BOLD, 25));
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 4, 5, 5));
        buttons = new JButton[16];

        for (int i = 0; i < values.length; i++) {
            buttons[i] = new JButton(values[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 20));
            buttons[i].addActionListener(this);
            p.add(buttons[i]);
        }
        add(tf, BorderLayout.NORTH);
        add(p, BorderLayout.CENTER);

        setTitle("Simple Calculator");
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();

        if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
            tf.setText(tf.getText() + s);
        }

        else if (s.equals("C")) {
            tf.setText("");
            num1 = 0;
            num2 = 0;
            operator = '\0';
        }

        else if (s.equals("=")) {
            num2 = Double.parseDouble(tf.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '%':
                    result = num1 % num2;
                    break;
            }

            tf.setText(String.valueOf(result));
        }

        else {
            num1 = Double.parseDouble(tf.getText());
            operator = s.charAt(0);
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}