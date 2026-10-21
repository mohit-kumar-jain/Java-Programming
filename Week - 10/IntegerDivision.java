import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IntegerDivision extends JFrame implements ActionListener {

    JTextField num1, num2, result;
    JButton divide;

    IntegerDivision() {

        setTitle("Integer Division");
        setSize(400, 250);
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel l1 = new JLabel("Num1:");
        JLabel l2 = new JLabel("Num2:");
        JLabel l3 = new JLabel("Result:");

        num1 = new JTextField();
        num2 = new JTextField();
        result = new JTextField();
        result.setEditable(false);

        divide = new JButton("Divide");
        divide.addActionListener(this);

        add(l1);
        add(num1);

        add(l2);
        add(num2);

        add(l3);
        add(result);

        add(new JLabel(""));
        add(divide);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());

            int ans = n1 / n2;

            result.setText(String.valueOf(ans));
        }

        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                this,
                "Please enter valid integers.",
                "NumberFormatException",
                JOptionPane.ERROR_MESSAGE
            );
        }

        catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(
                this,
                "Cannot divide by zero.",
                "ArithmeticException",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        new IntegerDivision();
    }
}